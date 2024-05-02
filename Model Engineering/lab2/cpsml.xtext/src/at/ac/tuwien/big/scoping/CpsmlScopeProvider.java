/*
 * generated by Xtext 2.27.0
 */
package at.ac.tuwien.big.scoping;

import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;

import java.util.ArrayList;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.*;
import org.eclipse.xtext.scoping.*;
import cpsml.*;

public class CpsmlScopeProvider extends AbstractDeclarativeScopeProvider {
	
	// 1) Scoping for MessageBrokers of a MessagingLink
	public IScope scope_MessagingLink_messageBroker(MessagingLink messagingLink, EReference eReference) {
		if( eReference.equals(CpsmlPackage.Literals.MESSAGING_LINK__MESSAGE_BROKER)) {
			CPS cps = (CPS) messagingLink.eContainer().eContainer().eContainer();
			List<MessageBroker> messageBrokers = cps.getMessageBroker().stream()
					.filter( msg -> msg.getTopics().containsAll(messagingLink.getTopics()))
					.collect(Collectors.toList());
			return Scopes.scopeFor(messageBrokers);
		}
		return IScope.NULLSCOPE;
	}
	
	// 2) Scoping for WiredModules (of MessageBrokers) of a WiredModule (of a Node)
	// The list of suggested ConnectionModules should only include WiredModules of MessageBrokers which support at least one matching Protocol
	public IScope scope_WiredModule_connect(WiredModule wiredModule, EReference eReference) {
	    if( eReference.equals(CpsmlPackage.Literals.WIRED_MODULE__CONNECT)) {
	        Node node = (Node) wiredModule.eContainer();
	        CPS cps = (CPS)wiredModule.eContainer().eContainer().eContainer();
	        
	        // get list of message brokers
	        // for each message brokers, check their connection modules
	        // collect those that have matching protocols
	        List<WiredModule> wiredModules = cps.getMessageBroker().stream().flatMap(mb -> mb.getConnectionModule().stream()).filter(cm -> cm instanceof WiredModule).map( cm -> (WiredModule) cm)
	                .filter( wm -> wm.getSupportedProtocols().stream().anyMatch( p -> wiredModule.getSupportedProtocols().contains(p)))
	                .collect(Collectors.toList());
	        
	        
	        /*List<WiredModule> wiredModules = node.getConnectionModule().stream()
	                .filter( cm -> cm instanceof WiredModule)
	                .map( cm -> (WiredModule) cm)
	                .filter( wm -> wm.getSupportedProtocols().stream().anyMatch( p -> wiredModule.getSupportedProtocols().contains(p)))
	                .collect(Collectors.toList());*/
	        return Scopes.scopeFor(wiredModules);
	    }
	    return IScope.NULLSCOPE;
	}
	
	//3) Scoping for WirelessModules (of Nodes) of a WirelessModule (of a MessageBroker)
	//The list of suggested ConnectionModules should only include WirelessModules of Nodes which support at least
	//one matching Protocol and meet the “range” requirements, meaning both elements are within euclidian distance.
		public IScope scope_WirelessModule_connect(WirelessModule wirelessModule, EReference eReference) {
		    if( eReference.equals(CpsmlPackage.Literals.WIRELESS_MODULE__CONNECT)) {
		      //MessageBroker messageBroker = (MessageBroker) wirelessModule.eContainer();
	          CPS cps = (CPS)wirelessModule.eContainer().eContainer().eContainer();
	          
	          //List<WiredModule> wiredModules = cps.getMessageBroker().stream().flatMap(mb -> mb.getConnectionModule().stream()).filter(cm -> cm instanceof WiredModule).map( cm -> (WiredModule) cm)
		      //          .filter( wm -> wm.getSupportedProtocols().stream().anyMatch( p -> wiredModule.getSupportedProtocols().contains(p)))
		      //          .collect(Collectors.toList());
	          
	          
	          List<WirelessModule> wirelessModules = cps.getEnvironment().stream() //getNodes().stream().flatMap(n -> n.getConnectionModule().stream()).filter(cm -> cm instanceof WirelessModule).map( cm -> (WirelessModule) cm)
	                  .map(env->env.getNode()).flatMap(List::stream)
	                  .map(node->node.getConnectionModule()).flatMap(List :: stream)
	                  .filter (connection_module-> connection_module instanceof WirelessModule).map(connection_module-> (WirelessModule)connection_module)
	                  .filter( wm -> wm.getSupportedProtocols().stream().anyMatch( p -> wirelessModule.getSupportedProtocols().contains(p)))
	                  .filter( wm -> calculateEuclidianDistance(wirelessModule, wm) <= wirelessModule.getRange())
	                  .collect(Collectors.toList());
	          return Scopes.scopeFor(wirelessModules);
	      }   
	      return IScope.NULLSCOPE;
	  }   


		private double calculateEuclidianDistance(EObject MessageBroker, EObject node){
		    MessageBroker mb = (MessageBroker) MessageBroker;
		    Node n = (Node) node;

		    double x1 = mb.getPosition().getX();
		    double y1 = mb.getPosition().getY();
		    double z1 = mb.getPosition().getZ();

		    double x2 = n.getPosition().getX();
		    double y2 = n.getPosition().getY();
		    double z2 = n.getPosition().getZ();

		    return Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2) + Math.pow(z2-z1,2));
		}
	}
	
	