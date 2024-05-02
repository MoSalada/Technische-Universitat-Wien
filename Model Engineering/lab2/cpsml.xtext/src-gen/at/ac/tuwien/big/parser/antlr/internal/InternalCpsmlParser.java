package at.ac.tuwien.big.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import at.ac.tuwien.big.services.CpsmlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCpsmlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'CPS'", "'{'", "'environments'", "':'", "'['", "','", "']'", "'messageBrokers'", "'controllers'", "'}'", "'nodes'", "'health'", "'Position'", "'components'", "'connectionModules'", "'subscribes'", "'publishes'", "'Sensor'", "'topic'", "'functions'", "'frequency'", "'Actuator'", "'runs'", "'ratedRuns'", "'::'", "'('", "')'", "'topics'", "'WiredModule'", "'supportedProtocols'", "'connect'", "'->'", "'connectOpposite'", "'WirelessModule'", "'range'", "'description'", "'messageBroker'", "'x'", "'y'", "'z'", "'-'", "'.'", "'E'", "'e'", "'NULL'", "'BOOLEAN'", "'INT'", "'STRING'", "'GOOD'", "'WARNING'", "'CRITICAL'", "'DDS'", "'MQTT'", "'SMQTT'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalCpsmlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCpsmlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCpsmlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCpsml.g"; }



     	private CpsmlGrammarAccess grammarAccess;

        public InternalCpsmlParser(TokenStream input, CpsmlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "CPS";
       	}

       	@Override
       	protected CpsmlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleCPS"
    // InternalCpsml.g:65:1: entryRuleCPS returns [EObject current=null] : iv_ruleCPS= ruleCPS EOF ;
    public final EObject entryRuleCPS() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCPS = null;


        try {
            // InternalCpsml.g:65:44: (iv_ruleCPS= ruleCPS EOF )
            // InternalCpsml.g:66:2: iv_ruleCPS= ruleCPS EOF
            {
             newCompositeNode(grammarAccess.getCPSRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCPS=ruleCPS();

            state._fsp--;

             current =iv_ruleCPS; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCPS"


    // $ANTLR start "ruleCPS"
    // InternalCpsml.g:72:1: ruleCPS returns [EObject current=null] : (otherlv_0= 'CPS' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'environments' otherlv_4= ':' otherlv_5= '[' ( (lv_environment_6_0= ruleEnvironment ) ) (otherlv_7= ',' ( (lv_environment_8_0= ruleEnvironment ) ) )* otherlv_9= ']' otherlv_10= 'messageBrokers' otherlv_11= ':' otherlv_12= '[' ( (lv_messageBroker_13_0= ruleMessageBroker ) ) (otherlv_14= ',' ( (lv_messageBroker_15_0= ruleMessageBroker ) ) )* otherlv_16= ']' otherlv_17= 'controllers' otherlv_18= ':' otherlv_19= '[' ( (lv_controller_20_0= ruleController ) ) (otherlv_21= ',' ( (lv_controller_22_0= ruleController ) ) )* otherlv_23= ']' otherlv_24= '}' ) ;
    public final EObject ruleCPS() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_environment_6_0 = null;

        EObject lv_environment_8_0 = null;

        EObject lv_messageBroker_13_0 = null;

        EObject lv_messageBroker_15_0 = null;

        EObject lv_controller_20_0 = null;

        EObject lv_controller_22_0 = null;



        	enterRule();

        try {
            // InternalCpsml.g:78:2: ( (otherlv_0= 'CPS' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'environments' otherlv_4= ':' otherlv_5= '[' ( (lv_environment_6_0= ruleEnvironment ) ) (otherlv_7= ',' ( (lv_environment_8_0= ruleEnvironment ) ) )* otherlv_9= ']' otherlv_10= 'messageBrokers' otherlv_11= ':' otherlv_12= '[' ( (lv_messageBroker_13_0= ruleMessageBroker ) ) (otherlv_14= ',' ( (lv_messageBroker_15_0= ruleMessageBroker ) ) )* otherlv_16= ']' otherlv_17= 'controllers' otherlv_18= ':' otherlv_19= '[' ( (lv_controller_20_0= ruleController ) ) (otherlv_21= ',' ( (lv_controller_22_0= ruleController ) ) )* otherlv_23= ']' otherlv_24= '}' ) )
            // InternalCpsml.g:79:2: (otherlv_0= 'CPS' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'environments' otherlv_4= ':' otherlv_5= '[' ( (lv_environment_6_0= ruleEnvironment ) ) (otherlv_7= ',' ( (lv_environment_8_0= ruleEnvironment ) ) )* otherlv_9= ']' otherlv_10= 'messageBrokers' otherlv_11= ':' otherlv_12= '[' ( (lv_messageBroker_13_0= ruleMessageBroker ) ) (otherlv_14= ',' ( (lv_messageBroker_15_0= ruleMessageBroker ) ) )* otherlv_16= ']' otherlv_17= 'controllers' otherlv_18= ':' otherlv_19= '[' ( (lv_controller_20_0= ruleController ) ) (otherlv_21= ',' ( (lv_controller_22_0= ruleController ) ) )* otherlv_23= ']' otherlv_24= '}' )
            {
            // InternalCpsml.g:79:2: (otherlv_0= 'CPS' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'environments' otherlv_4= ':' otherlv_5= '[' ( (lv_environment_6_0= ruleEnvironment ) ) (otherlv_7= ',' ( (lv_environment_8_0= ruleEnvironment ) ) )* otherlv_9= ']' otherlv_10= 'messageBrokers' otherlv_11= ':' otherlv_12= '[' ( (lv_messageBroker_13_0= ruleMessageBroker ) ) (otherlv_14= ',' ( (lv_messageBroker_15_0= ruleMessageBroker ) ) )* otherlv_16= ']' otherlv_17= 'controllers' otherlv_18= ':' otherlv_19= '[' ( (lv_controller_20_0= ruleController ) ) (otherlv_21= ',' ( (lv_controller_22_0= ruleController ) ) )* otherlv_23= ']' otherlv_24= '}' )
            // InternalCpsml.g:80:3: otherlv_0= 'CPS' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'environments' otherlv_4= ':' otherlv_5= '[' ( (lv_environment_6_0= ruleEnvironment ) ) (otherlv_7= ',' ( (lv_environment_8_0= ruleEnvironment ) ) )* otherlv_9= ']' otherlv_10= 'messageBrokers' otherlv_11= ':' otherlv_12= '[' ( (lv_messageBroker_13_0= ruleMessageBroker ) ) (otherlv_14= ',' ( (lv_messageBroker_15_0= ruleMessageBroker ) ) )* otherlv_16= ']' otherlv_17= 'controllers' otherlv_18= ':' otherlv_19= '[' ( (lv_controller_20_0= ruleController ) ) (otherlv_21= ',' ( (lv_controller_22_0= ruleController ) ) )* otherlv_23= ']' otherlv_24= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCPSAccess().getCPSKeyword_0());
            		
            // InternalCpsml.g:84:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCpsml.g:85:4: (lv_name_1_0= ruleEString )
            {
            // InternalCpsml.g:85:4: (lv_name_1_0= ruleEString )
            // InternalCpsml.g:86:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCPSAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCPSRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"at.ac.tuwien.big.Cpsml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getCPSAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getCPSAccess().getEnvironmentsKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getCPSAccess().getColonKeyword_4());
            		
            otherlv_5=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getCPSAccess().getLeftSquareBracketKeyword_5());
            		
            // InternalCpsml.g:119:3: ( (lv_environment_6_0= ruleEnvironment ) )
            // InternalCpsml.g:120:4: (lv_environment_6_0= ruleEnvironment )
            {
            // InternalCpsml.g:120:4: (lv_environment_6_0= ruleEnvironment )
            // InternalCpsml.g:121:5: lv_environment_6_0= ruleEnvironment
            {

            					newCompositeNode(grammarAccess.getCPSAccess().getEnvironmentEnvironmentParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_environment_6_0=ruleEnvironment();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCPSRule());
            					}
            					add(
            						current,
            						"environment",
            						lv_environment_6_0,
            						"at.ac.tuwien.big.Cpsml.Environment");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCpsml.g:138:3: (otherlv_7= ',' ( (lv_environment_8_0= ruleEnvironment ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCpsml.g:139:4: otherlv_7= ',' ( (lv_environment_8_0= ruleEnvironment ) )
            	    {
            	    otherlv_7=(Token)match(input,16,FOLLOW_3); 

            	    				newLeafNode(otherlv_7, grammarAccess.getCPSAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalCpsml.g:143:4: ( (lv_environment_8_0= ruleEnvironment ) )
            	    // InternalCpsml.g:144:5: (lv_environment_8_0= ruleEnvironment )
            	    {
            	    // InternalCpsml.g:144:5: (lv_environment_8_0= ruleEnvironment )
            	    // InternalCpsml.g:145:6: lv_environment_8_0= ruleEnvironment
            	    {

            	    						newCompositeNode(grammarAccess.getCPSAccess().getEnvironmentEnvironmentParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_environment_8_0=ruleEnvironment();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCPSRule());
            	    						}
            	    						add(
            	    							current,
            	    							"environment",
            	    							lv_environment_8_0,
            	    							"at.ac.tuwien.big.Cpsml.Environment");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_9=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_9, grammarAccess.getCPSAccess().getRightSquareBracketKeyword_8());
            		
            otherlv_10=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_10, grammarAccess.getCPSAccess().getMessageBrokersKeyword_9());
            		
            otherlv_11=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_11, grammarAccess.getCPSAccess().getColonKeyword_10());
            		
            otherlv_12=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_12, grammarAccess.getCPSAccess().getLeftSquareBracketKeyword_11());
            		
            // InternalCpsml.g:179:3: ( (lv_messageBroker_13_0= ruleMessageBroker ) )
            // InternalCpsml.g:180:4: (lv_messageBroker_13_0= ruleMessageBroker )
            {
            // InternalCpsml.g:180:4: (lv_messageBroker_13_0= ruleMessageBroker )
            // InternalCpsml.g:181:5: lv_messageBroker_13_0= ruleMessageBroker
            {

            					newCompositeNode(grammarAccess.getCPSAccess().getMessageBrokerMessageBrokerParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_8);
            lv_messageBroker_13_0=ruleMessageBroker();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCPSRule());
            					}
            					add(
            						current,
            						"messageBroker",
            						lv_messageBroker_13_0,
            						"at.ac.tuwien.big.Cpsml.MessageBroker");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCpsml.g:198:3: (otherlv_14= ',' ( (lv_messageBroker_15_0= ruleMessageBroker ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCpsml.g:199:4: otherlv_14= ',' ( (lv_messageBroker_15_0= ruleMessageBroker ) )
            	    {
            	    otherlv_14=(Token)match(input,16,FOLLOW_3); 

            	    				newLeafNode(otherlv_14, grammarAccess.getCPSAccess().getCommaKeyword_13_0());
            	    			
            	    // InternalCpsml.g:203:4: ( (lv_messageBroker_15_0= ruleMessageBroker ) )
            	    // InternalCpsml.g:204:5: (lv_messageBroker_15_0= ruleMessageBroker )
            	    {
            	    // InternalCpsml.g:204:5: (lv_messageBroker_15_0= ruleMessageBroker )
            	    // InternalCpsml.g:205:6: lv_messageBroker_15_0= ruleMessageBroker
            	    {

            	    						newCompositeNode(grammarAccess.getCPSAccess().getMessageBrokerMessageBrokerParserRuleCall_13_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_messageBroker_15_0=ruleMessageBroker();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCPSRule());
            	    						}
            	    						add(
            	    							current,
            	    							"messageBroker",
            	    							lv_messageBroker_15_0,
            	    							"at.ac.tuwien.big.Cpsml.MessageBroker");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_16=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_16, grammarAccess.getCPSAccess().getRightSquareBracketKeyword_14());
            		
            otherlv_17=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_17, grammarAccess.getCPSAccess().getControllersKeyword_15());
            		
            otherlv_18=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_18, grammarAccess.getCPSAccess().getColonKeyword_16());
            		
            otherlv_19=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_19, grammarAccess.getCPSAccess().getLeftSquareBracketKeyword_17());
            		
            // InternalCpsml.g:239:3: ( (lv_controller_20_0= ruleController ) )
            // InternalCpsml.g:240:4: (lv_controller_20_0= ruleController )
            {
            // InternalCpsml.g:240:4: (lv_controller_20_0= ruleController )
            // InternalCpsml.g:241:5: lv_controller_20_0= ruleController
            {

            					newCompositeNode(grammarAccess.getCPSAccess().getControllerControllerParserRuleCall_18_0());
            				
            pushFollow(FOLLOW_8);
            lv_controller_20_0=ruleController();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCPSRule());
            					}
            					add(
            						current,
            						"controller",
            						lv_controller_20_0,
            						"at.ac.tuwien.big.Cpsml.Controller");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCpsml.g:258:3: (otherlv_21= ',' ( (lv_controller_22_0= ruleController ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCpsml.g:259:4: otherlv_21= ',' ( (lv_controller_22_0= ruleController ) )
            	    {
            	    otherlv_21=(Token)match(input,16,FOLLOW_3); 

            	    				newLeafNode(otherlv_21, grammarAccess.getCPSAccess().getCommaKeyword_19_0());
            	    			
            	    // InternalCpsml.g:263:4: ( (lv_controller_22_0= ruleController ) )
            	    // InternalCpsml.g:264:5: (lv_controller_22_0= ruleController )
            	    {
            	    // InternalCpsml.g:264:5: (lv_controller_22_0= ruleController )
            	    // InternalCpsml.g:265:6: lv_controller_22_0= ruleController
            	    {

            	    						newCompositeNode(grammarAccess.getCPSAccess().getControllerControllerParserRuleCall_19_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_controller_22_0=ruleController();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCPSRule());
            	    						}
            	    						add(
            	    							current,
            	    							"controller",
            	    							lv_controller_22_0,
            	    							"at.ac.tuwien.big.Cpsml.Controller");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_23=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_23, grammarAccess.getCPSAccess().getRightSquareBracketKeyword_20());
            		
            otherlv_24=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getCPSAccess().getRightCurlyBracketKeyword_21());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCPS"


    // $ANTLR start "entryRuleEnvironment"
    // InternalCpsml.g:295:1: entryRuleEnvironment returns [EObject current=null] : iv_ruleEnvironment= ruleEnvironment EOF ;
    public final EObject entryRuleEnvironment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnvironment = null;


        try {
            // InternalCpsml.g:295:52: (iv_ruleEnvironment= ruleEnvironment EOF )
            // InternalCpsml.g:296:2: iv_ruleEnvironment= ruleEnvironment EOF
            {
             newCompositeNode(grammarAccess.getEnvironmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnvironment=ruleEnvironment();

            state._fsp--;

             current =iv_ruleEnvironment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnvironment"


    // $ANTLR start "ruleEnvironment"
    // InternalCpsml.g:302:1: ruleEnvironment returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'nodes' otherlv_3= ':' otherlv_4= '[' ( (lv_node_5_0= ruleNode ) ) (otherlv_6= ',' ( (lv_node_7_0= ruleNode ) ) )* otherlv_8= ']' otherlv_9= '}' ) ;
    public final EObject ruleEnvironment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_node_5_0 = null;

        EObject lv_node_7_0 = null;



        	enterRule();

        try {
            // InternalCpsml.g:308:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'nodes' otherlv_3= ':' otherlv_4= '[' ( (lv_node_5_0= ruleNode ) ) (otherlv_6= ',' ( (lv_node_7_0= ruleNode ) ) )* otherlv_8= ']' otherlv_9= '}' ) )
            // InternalCpsml.g:309:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'nodes' otherlv_3= ':' otherlv_4= '[' ( (lv_node_5_0= ruleNode ) ) (otherlv_6= ',' ( (lv_node_7_0= ruleNode ) ) )* otherlv_8= ']' otherlv_9= '}' )
            {
            // InternalCpsml.g:309:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'nodes' otherlv_3= ':' otherlv_4= '[' ( (lv_node_5_0= ruleNode ) ) (otherlv_6= ',' ( (lv_node_7_0= ruleNode ) ) )* otherlv_8= ']' otherlv_9= '}' )
            // InternalCpsml.g:310:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'nodes' otherlv_3= ':' otherlv_4= '[' ( (lv_node_5_0= ruleNode ) ) (otherlv_6= ',' ( (lv_node_7_0= ruleNode ) ) )* otherlv_8= ']' otherlv_9= '}'
            {
            // InternalCpsml.g:310:3: ( (lv_name_0_0= ruleEString ) )
            // InternalCpsml.g:311:4: (lv_name_0_0= ruleEString )
            {
            // InternalCpsml.g:311:4: (lv_name_0_0= ruleEString )
            // InternalCpsml.g:312:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEnvironmentAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnvironmentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"at.ac.tuwien.big.Cpsml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getEnvironmentAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getEnvironmentAccess().getNodesKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getEnvironmentAccess().getColonKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getEnvironmentAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalCpsml.g:345:3: ( (lv_node_5_0= ruleNode ) )
            // InternalCpsml.g:346:4: (lv_node_5_0= ruleNode )
            {
            // InternalCpsml.g:346:4: (lv_node_5_0= ruleNode )
            // InternalCpsml.g:347:5: lv_node_5_0= ruleNode
            {

            					newCompositeNode(grammarAccess.getEnvironmentAccess().getNodeNodeParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_node_5_0=ruleNode();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEnvironmentRule());
            					}
            					add(
            						current,
            						"node",
            						lv_node_5_0,
            						"at.ac.tuwien.big.Cpsml.Node");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCpsml.g:364:3: (otherlv_6= ',' ( (lv_node_7_0= ruleNode ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCpsml.g:365:4: otherlv_6= ',' ( (lv_node_7_0= ruleNode ) )
            	    {
            	    otherlv_6=(Token)match(input,16,FOLLOW_3); 

            	    				newLeafNode(otherlv_6, grammarAccess.getEnvironmentAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalCpsml.g:369:4: ( (lv_node_7_0= ruleNode ) )
            	    // InternalCpsml.g:370:5: (lv_node_7_0= ruleNode )
            	    {
            	    // InternalCpsml.g:370:5: (lv_node_7_0= ruleNode )
            	    // InternalCpsml.g:371:6: lv_node_7_0= ruleNode
            	    {

            	    						newCompositeNode(grammarAccess.getEnvironmentAccess().getNodeNodeParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_node_7_0=ruleNode();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEnvironmentRule());
            	    						}
            	    						add(
            	    							current,
            	    							"node",
            	    							lv_node_7_0,
            	    							"at.ac.tuwien.big.Cpsml.Node");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_8=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_8, grammarAccess.getEnvironmentAccess().getRightSquareBracketKeyword_7());
            		
            otherlv_9=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getEnvironmentAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnvironment"


    // $ANTLR start "entryRuleNode"
    // InternalCpsml.g:401:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalCpsml.g:401:45: (iv_ruleNode= ruleNode EOF )
            // InternalCpsml.g:402:2: iv_ruleNode= ruleNode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNode=ruleNode();

            state._fsp--;

             current =iv_ruleNode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalCpsml.g:408:1: ruleNode returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'health' otherlv_3= ':' ( (lv_status_4_0= ruleStatus ) ) otherlv_5= 'Position' ( (lv_position_6_0= rulePosition ) ) otherlv_7= 'components' otherlv_8= ':' otherlv_9= '[' ( (lv_component_10_0= ruleComponent ) ) (otherlv_11= ',' ( (lv_component_12_0= ruleComponent ) ) )* otherlv_13= ']' otherlv_14= 'connectionModules' otherlv_15= ':' otherlv_16= '[' ( (lv_connectionModule_17_0= ruleConnectionModule ) ) (otherlv_18= ',' ( (lv_connectionModule_19_0= ruleConnectionModule ) ) )* otherlv_20= ']' (otherlv_21= 'subscribes' otherlv_22= ':' otherlv_23= '[' ( (lv_subscription_24_0= ruleMessagingLink ) ) (otherlv_25= ',' ( (lv_subscription_26_0= ruleMessagingLink ) ) )* otherlv_27= ']' )? (otherlv_28= 'publishes' otherlv_29= ':' otherlv_30= '[' ( (lv_publication_31_0= ruleMessagingLink ) ) (otherlv_32= ',' ( (lv_publication_33_0= ruleMessagingLink ) ) )* otherlv_34= ']' )? otherlv_35= '}' ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        Enumerator lv_status_4_0 = null;

        EObject lv_position_6_0 = null;

        EObject lv_component_10_0 = null;

        EObject lv_component_12_0 = null;

        EObject lv_connectionModule_17_0 = null;

        EObject lv_connectionModule_19_0 = null;

        EObject lv_subscription_24_0 = null;

        EObject lv_subscription_26_0 = null;

        EObject lv_publication_31_0 = null;

        EObject lv_publication_33_0 = null;



        	enterRule();

        try {
            // InternalCpsml.g:414:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'health' otherlv_3= ':' ( (lv_status_4_0= ruleStatus ) ) otherlv_5= 'Position' ( (lv_position_6_0= rulePosition ) ) otherlv_7= 'components' otherlv_8= ':' otherlv_9= '[' ( (lv_component_10_0= ruleComponent ) ) (otherlv_11= ',' ( (lv_component_12_0= ruleComponent ) ) )* otherlv_13= ']' otherlv_14= 'connectionModules' otherlv_15= ':' otherlv_16= '[' ( (lv_connectionModule_17_0= ruleConnectionModule ) ) (otherlv_18= ',' ( (lv_connectionModule_19_0= ruleConnectionModule ) ) )* otherlv_20= ']' (otherlv_21= 'subscribes' otherlv_22= ':' otherlv_23= '[' ( (lv_subscription_24_0= ruleMessagingLink ) ) (otherlv_25= ',' ( (lv_subscription_26_0= ruleMessagingLink ) ) )* otherlv_27= ']' )? (otherlv_28= 'publishes' otherlv_29= ':' otherlv_30= '[' ( (lv_publication_31_0= ruleMessagingLink ) ) (otherlv_32= ',' ( (lv_publication_33_0= ruleMessagingLink ) ) )* otherlv_34= ']' )? otherlv_35= '}' ) )
            // InternalCpsml.g:415:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'health' otherlv_3= ':' ( (lv_status_4_0= ruleStatus ) ) otherlv_5= 'Position' ( (lv_position_6_0= rulePosition ) ) otherlv_7= 'components' otherlv_8= ':' otherlv_9= '[' ( (lv_component_10_0= ruleComponent ) ) (otherlv_11= ',' ( (lv_component_12_0= ruleComponent ) ) )* otherlv_13= ']' otherlv_14= 'connectionModules' otherlv_15= ':' otherlv_16= '[' ( (lv_connectionModule_17_0= ruleConnectionModule ) ) (otherlv_18= ',' ( (lv_connectionModule_19_0= ruleConnectionModule ) ) )* otherlv_20= ']' (otherlv_21= 'subscribes' otherlv_22= ':' otherlv_23= '[' ( (lv_subscription_24_0= ruleMessagingLink ) ) (otherlv_25= ',' ( (lv_subscription_26_0= ruleMessagingLink ) ) )* otherlv_27= ']' )? (otherlv_28= 'publishes' otherlv_29= ':' otherlv_30= '[' ( (lv_publication_31_0= ruleMessagingLink ) ) (otherlv_32= ',' ( (lv_publication_33_0= ruleMessagingLink ) ) )* otherlv_34= ']' )? otherlv_35= '}' )
            {
            // InternalCpsml.g:415:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'health' otherlv_3= ':' ( (lv_status_4_0= ruleStatus ) ) otherlv_5= 'Position' ( (lv_position_6_0= rulePosition ) ) otherlv_7= 'components' otherlv_8= ':' otherlv_9= '[' ( (lv_component_10_0= ruleComponent ) ) (otherlv_11= ',' ( (lv_component_12_0= ruleComponent ) ) )* otherlv_13= ']' otherlv_14= 'connectionModules' otherlv_15= ':' otherlv_16= '[' ( (lv_connectionModule_17_0= ruleConnectionModule ) ) (otherlv_18= ',' ( (lv_connectionModule_19_0= ruleConnectionModule ) ) )* otherlv_20= ']' (otherlv_21= 'subscribes' otherlv_22= ':' otherlv_23= '[' ( (lv_subscription_24_0= ruleMessagingLink ) ) (otherlv_25= ',' ( (lv_subscription_26_0= ruleMessagingLink ) ) )* otherlv_27= ']' )? (otherlv_28= 'publishes' otherlv_29= ':' otherlv_30= '[' ( (lv_publication_31_0= ruleMessagingLink ) ) (otherlv_32= ',' ( (lv_publication_33_0= ruleMessagingLink ) ) )* otherlv_34= ']' )? otherlv_35= '}' )
            // InternalCpsml.g:416:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'health' otherlv_3= ':' ( (lv_status_4_0= ruleStatus ) ) otherlv_5= 'Position' ( (lv_position_6_0= rulePosition ) ) otherlv_7= 'components' otherlv_8= ':' otherlv_9= '[' ( (lv_component_10_0= ruleComponent ) ) (otherlv_11= ',' ( (lv_component_12_0= ruleComponent ) ) )* otherlv_13= ']' otherlv_14= 'connectionModules' otherlv_15= ':' otherlv_16= '[' ( (lv_connectionModule_17_0= ruleConnectionModule ) ) (otherlv_18= ',' ( (lv_connectionModule_19_0= ruleConnectionModule ) ) )* otherlv_20= ']' (otherlv_21= 'subscribes' otherlv_22= ':' otherlv_23= '[' ( (lv_subscription_24_0= ruleMessagingLink ) ) (otherlv_25= ',' ( (lv_subscription_26_0= ruleMessagingLink ) ) )* otherlv_27= ']' )? (otherlv_28= 'publishes' otherlv_29= ':' otherlv_30= '[' ( (lv_publication_31_0= ruleMessagingLink ) ) (otherlv_32= ',' ( (lv_publication_33_0= ruleMessagingLink ) ) )* otherlv_34= ']' )? otherlv_35= '}'
            {
            // InternalCpsml.g:416:3: ( (lv_name_0_0= ruleEString ) )
            // InternalCpsml.g:417:4: (lv_name_0_0= ruleEString )
            {
            // InternalCpsml.g:417:4: (lv_name_0_0= ruleEString )
            // InternalCpsml.g:418:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getNodeAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNodeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"at.ac.tuwien.big.Cpsml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getNodeAccess().getHealthKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getNodeAccess().getColonKeyword_3());
            		
            // InternalCpsml.g:447:3: ( (lv_status_4_0= ruleStatus ) )
            // InternalCpsml.g:448:4: (lv_status_4_0= ruleStatus )
            {
            // InternalCpsml.g:448:4: (lv_status_4_0= ruleStatus )
            // InternalCpsml.g:449:5: lv_status_4_0= ruleStatus
            {

            					newCompositeNode(grammarAccess.getNodeAccess().getStatusStatusEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_15);
            lv_status_4_0=ruleStatus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNodeRule());
            					}
            					set(
            						current,
            						"status",
            						lv_status_4_0,
            						"at.ac.tuwien.big.Cpsml.Status");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getNodeAccess().getPositionKeyword_5());
            		
            // InternalCpsml.g:470:3: ( (lv_position_6_0= rulePosition ) )
            // InternalCpsml.g:471:4: (lv_position_6_0= rulePosition )
            {
            // InternalCpsml.g:471:4: (lv_position_6_0= rulePosition )
            // InternalCpsml.g:472:5: lv_position_6_0= rulePosition
            {

            					newCompositeNode(grammarAccess.getNodeAccess().getPositionPositionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_16);
            lv_position_6_0=rulePosition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNodeRule());
            					}
            					set(
            						current,
            						"position",
            						lv_position_6_0,
            						"at.ac.tuwien.big.Cpsml.Position");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,24,FOLLOW_6); 

            			newLeafNode(otherlv_7, grammarAccess.getNodeAccess().getComponentsKeyword_7());
            		
            otherlv_8=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getNodeAccess().getColonKeyword_8());
            		
            otherlv_9=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_9, grammarAccess.getNodeAccess().getLeftSquareBracketKeyword_9());
            		
            // InternalCpsml.g:501:3: ( (lv_component_10_0= ruleComponent ) )
            // InternalCpsml.g:502:4: (lv_component_10_0= ruleComponent )
            {
            // InternalCpsml.g:502:4: (lv_component_10_0= ruleComponent )
            // InternalCpsml.g:503:5: lv_component_10_0= ruleComponent
            {

            					newCompositeNode(grammarAccess.getNodeAccess().getComponentComponentParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_8);
            lv_component_10_0=ruleComponent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNodeRule());
            					}
            					add(
            						current,
            						"component",
            						lv_component_10_0,
            						"at.ac.tuwien.big.Cpsml.Component");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCpsml.g:520:3: (otherlv_11= ',' ( (lv_component_12_0= ruleComponent ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCpsml.g:521:4: otherlv_11= ',' ( (lv_component_12_0= ruleComponent ) )
            	    {
            	    otherlv_11=(Token)match(input,16,FOLLOW_17); 

            	    				newLeafNode(otherlv_11, grammarAccess.getNodeAccess().getCommaKeyword_11_0());
            	    			
            	    // InternalCpsml.g:525:4: ( (lv_component_12_0= ruleComponent ) )
            	    // InternalCpsml.g:526:5: (lv_component_12_0= ruleComponent )
            	    {
            	    // InternalCpsml.g:526:5: (lv_component_12_0= ruleComponent )
            	    // InternalCpsml.g:527:6: lv_component_12_0= ruleComponent
            	    {

            	    						newCompositeNode(grammarAccess.getNodeAccess().getComponentComponentParserRuleCall_11_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_component_12_0=ruleComponent();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNodeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"component",
            	    							lv_component_12_0,
            	    							"at.ac.tuwien.big.Cpsml.Component");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_13=(Token)match(input,17,FOLLOW_18); 

            			newLeafNode(otherlv_13, grammarAccess.getNodeAccess().getRightSquareBracketKeyword_12());
            		
            otherlv_14=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_14, grammarAccess.getNodeAccess().getConnectionModulesKeyword_13());
            		
            otherlv_15=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_15, grammarAccess.getNodeAccess().getColonKeyword_14());
            		
            otherlv_16=(Token)match(input,15,FOLLOW_19); 

            			newLeafNode(otherlv_16, grammarAccess.getNodeAccess().getLeftSquareBracketKeyword_15());
            		
            // InternalCpsml.g:561:3: ( (lv_connectionModule_17_0= ruleConnectionModule ) )
            // InternalCpsml.g:562:4: (lv_connectionModule_17_0= ruleConnectionModule )
            {
            // InternalCpsml.g:562:4: (lv_connectionModule_17_0= ruleConnectionModule )
            // InternalCpsml.g:563:5: lv_connectionModule_17_0= ruleConnectionModule
            {

            					newCompositeNode(grammarAccess.getNodeAccess().getConnectionModuleConnectionModuleParserRuleCall_16_0());
            				
            pushFollow(FOLLOW_8);
            lv_connectionModule_17_0=ruleConnectionModule();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNodeRule());
            					}
            					add(
            						current,
            						"connectionModule",
            						lv_connectionModule_17_0,
            						"at.ac.tuwien.big.Cpsml.ConnectionModule");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCpsml.g:580:3: (otherlv_18= ',' ( (lv_connectionModule_19_0= ruleConnectionModule ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCpsml.g:581:4: otherlv_18= ',' ( (lv_connectionModule_19_0= ruleConnectionModule ) )
            	    {
            	    otherlv_18=(Token)match(input,16,FOLLOW_19); 

            	    				newLeafNode(otherlv_18, grammarAccess.getNodeAccess().getCommaKeyword_17_0());
            	    			
            	    // InternalCpsml.g:585:4: ( (lv_connectionModule_19_0= ruleConnectionModule ) )
            	    // InternalCpsml.g:586:5: (lv_connectionModule_19_0= ruleConnectionModule )
            	    {
            	    // InternalCpsml.g:586:5: (lv_connectionModule_19_0= ruleConnectionModule )
            	    // InternalCpsml.g:587:6: lv_connectionModule_19_0= ruleConnectionModule
            	    {

            	    						newCompositeNode(grammarAccess.getNodeAccess().getConnectionModuleConnectionModuleParserRuleCall_17_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_connectionModule_19_0=ruleConnectionModule();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getNodeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"connectionModule",
            	    							lv_connectionModule_19_0,
            	    							"at.ac.tuwien.big.Cpsml.ConnectionModule");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_20=(Token)match(input,17,FOLLOW_20); 

            			newLeafNode(otherlv_20, grammarAccess.getNodeAccess().getRightSquareBracketKeyword_18());
            		
            // InternalCpsml.g:609:3: (otherlv_21= 'subscribes' otherlv_22= ':' otherlv_23= '[' ( (lv_subscription_24_0= ruleMessagingLink ) ) (otherlv_25= ',' ( (lv_subscription_26_0= ruleMessagingLink ) ) )* otherlv_27= ']' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCpsml.g:610:4: otherlv_21= 'subscribes' otherlv_22= ':' otherlv_23= '[' ( (lv_subscription_24_0= ruleMessagingLink ) ) (otherlv_25= ',' ( (lv_subscription_26_0= ruleMessagingLink ) ) )* otherlv_27= ']'
                    {
                    otherlv_21=(Token)match(input,26,FOLLOW_6); 

                    				newLeafNode(otherlv_21, grammarAccess.getNodeAccess().getSubscribesKeyword_19_0());
                    			
                    otherlv_22=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_22, grammarAccess.getNodeAccess().getColonKeyword_19_1());
                    			
                    otherlv_23=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_23, grammarAccess.getNodeAccess().getLeftSquareBracketKeyword_19_2());
                    			
                    // InternalCpsml.g:622:4: ( (lv_subscription_24_0= ruleMessagingLink ) )
                    // InternalCpsml.g:623:5: (lv_subscription_24_0= ruleMessagingLink )
                    {
                    // InternalCpsml.g:623:5: (lv_subscription_24_0= ruleMessagingLink )
                    // InternalCpsml.g:624:6: lv_subscription_24_0= ruleMessagingLink
                    {

                    						newCompositeNode(grammarAccess.getNodeAccess().getSubscriptionMessagingLinkParserRuleCall_19_3_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_subscription_24_0=ruleMessagingLink();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNodeRule());
                    						}
                    						add(
                    							current,
                    							"subscription",
                    							lv_subscription_24_0,
                    							"at.ac.tuwien.big.Cpsml.MessagingLink");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCpsml.g:641:4: (otherlv_25= ',' ( (lv_subscription_26_0= ruleMessagingLink ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==16) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalCpsml.g:642:5: otherlv_25= ',' ( (lv_subscription_26_0= ruleMessagingLink ) )
                    	    {
                    	    otherlv_25=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_25, grammarAccess.getNodeAccess().getCommaKeyword_19_4_0());
                    	    				
                    	    // InternalCpsml.g:646:5: ( (lv_subscription_26_0= ruleMessagingLink ) )
                    	    // InternalCpsml.g:647:6: (lv_subscription_26_0= ruleMessagingLink )
                    	    {
                    	    // InternalCpsml.g:647:6: (lv_subscription_26_0= ruleMessagingLink )
                    	    // InternalCpsml.g:648:7: lv_subscription_26_0= ruleMessagingLink
                    	    {

                    	    							newCompositeNode(grammarAccess.getNodeAccess().getSubscriptionMessagingLinkParserRuleCall_19_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_subscription_26_0=ruleMessagingLink();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"subscription",
                    	    								lv_subscription_26_0,
                    	    								"at.ac.tuwien.big.Cpsml.MessagingLink");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_27=(Token)match(input,17,FOLLOW_21); 

                    				newLeafNode(otherlv_27, grammarAccess.getNodeAccess().getRightSquareBracketKeyword_19_5());
                    			

                    }
                    break;

            }

            // InternalCpsml.g:671:3: (otherlv_28= 'publishes' otherlv_29= ':' otherlv_30= '[' ( (lv_publication_31_0= ruleMessagingLink ) ) (otherlv_32= ',' ( (lv_publication_33_0= ruleMessagingLink ) ) )* otherlv_34= ']' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCpsml.g:672:4: otherlv_28= 'publishes' otherlv_29= ':' otherlv_30= '[' ( (lv_publication_31_0= ruleMessagingLink ) ) (otherlv_32= ',' ( (lv_publication_33_0= ruleMessagingLink ) ) )* otherlv_34= ']'
                    {
                    otherlv_28=(Token)match(input,27,FOLLOW_6); 

                    				newLeafNode(otherlv_28, grammarAccess.getNodeAccess().getPublishesKeyword_20_0());
                    			
                    otherlv_29=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_29, grammarAccess.getNodeAccess().getColonKeyword_20_1());
                    			
                    otherlv_30=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_30, grammarAccess.getNodeAccess().getLeftSquareBracketKeyword_20_2());
                    			
                    // InternalCpsml.g:684:4: ( (lv_publication_31_0= ruleMessagingLink ) )
                    // InternalCpsml.g:685:5: (lv_publication_31_0= ruleMessagingLink )
                    {
                    // InternalCpsml.g:685:5: (lv_publication_31_0= ruleMessagingLink )
                    // InternalCpsml.g:686:6: lv_publication_31_0= ruleMessagingLink
                    {

                    						newCompositeNode(grammarAccess.getNodeAccess().getPublicationMessagingLinkParserRuleCall_20_3_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_publication_31_0=ruleMessagingLink();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNodeRule());
                    						}
                    						add(
                    							current,
                    							"publication",
                    							lv_publication_31_0,
                    							"at.ac.tuwien.big.Cpsml.MessagingLink");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCpsml.g:703:4: (otherlv_32= ',' ( (lv_publication_33_0= ruleMessagingLink ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==16) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalCpsml.g:704:5: otherlv_32= ',' ( (lv_publication_33_0= ruleMessagingLink ) )
                    	    {
                    	    otherlv_32=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_32, grammarAccess.getNodeAccess().getCommaKeyword_20_4_0());
                    	    				
                    	    // InternalCpsml.g:708:5: ( (lv_publication_33_0= ruleMessagingLink ) )
                    	    // InternalCpsml.g:709:6: (lv_publication_33_0= ruleMessagingLink )
                    	    {
                    	    // InternalCpsml.g:709:6: (lv_publication_33_0= ruleMessagingLink )
                    	    // InternalCpsml.g:710:7: lv_publication_33_0= ruleMessagingLink
                    	    {

                    	    							newCompositeNode(grammarAccess.getNodeAccess().getPublicationMessagingLinkParserRuleCall_20_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_publication_33_0=ruleMessagingLink();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNodeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"publication",
                    	    								lv_publication_33_0,
                    	    								"at.ac.tuwien.big.Cpsml.MessagingLink");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_34=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_34, grammarAccess.getNodeAccess().getRightSquareBracketKeyword_20_5());
                    			

                    }
                    break;

            }

            otherlv_35=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_35, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_21());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleComponent"
    // InternalCpsml.g:741:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalCpsml.g:741:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalCpsml.g:742:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalCpsml.g:748:1: ruleComponent returns [EObject current=null] : (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        EObject this_Sensor_0 = null;

        EObject this_Actuator_1 = null;



        	enterRule();

        try {
            // InternalCpsml.g:754:2: ( (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator ) )
            // InternalCpsml.g:755:2: (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator )
            {
            // InternalCpsml.g:755:2: (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            else if ( (LA11_0==32) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalCpsml.g:756:3: this_Sensor_0= ruleSensor
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getSensorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sensor_0=ruleSensor();

                    state._fsp--;


                    			current = this_Sensor_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCpsml.g:765:3: this_Actuator_1= ruleActuator
                    {

                    			newCompositeNode(grammarAccess.getComponentAccess().getActuatorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Actuator_1=ruleActuator();

                    state._fsp--;


                    			current = this_Actuator_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleSensor"
    // InternalCpsml.g:777:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalCpsml.g:777:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalCpsml.g:778:2: iv_ruleSensor= ruleSensor EOF
            {
             newCompositeNode(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensor=ruleSensor();

            state._fsp--;

             current =iv_ruleSensor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalCpsml.g:784:1: ruleSensor returns [EObject current=null] : (otherlv_0= 'Sensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'health' otherlv_4= ':' ( (lv_status_5_0= ruleStatus ) ) otherlv_6= 'topic' otherlv_7= ':' ( (lv_topic_8_0= ruleEString ) ) otherlv_9= 'functions' otherlv_10= ':' otherlv_11= '[' ( (lv_function_12_0= ruleFunction ) ) (otherlv_13= ',' ( (lv_function_14_0= ruleFunction ) ) )* otherlv_15= ']' (otherlv_16= 'frequency' otherlv_17= ':' ( (lv_frequency_18_0= ruleEFloat ) ) )? otherlv_19= '}' ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_status_5_0 = null;

        AntlrDatatypeRuleToken lv_topic_8_0 = null;

        EObject lv_function_12_0 = null;

        EObject lv_function_14_0 = null;

        AntlrDatatypeRuleToken lv_frequency_18_0 = null;



        	enterRule();

        try {
            // InternalCpsml.g:790:2: ( (otherlv_0= 'Sensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'health' otherlv_4= ':' ( (lv_status_5_0= ruleStatus ) ) otherlv_6= 'topic' otherlv_7= ':' ( (lv_topic_8_0= ruleEString ) ) otherlv_9= 'functions' otherlv_10= ':' otherlv_11= '[' ( (lv_function_12_0= ruleFunction ) ) (otherlv_13= ',' ( (lv_function_14_0= ruleFunction ) ) )* otherlv_15= ']' (otherlv_16= 'frequency' otherlv_17= ':' ( (lv_frequency_18_0= ruleEFloat ) ) )? otherlv_19= '}' ) )
            // InternalCpsml.g:791:2: (otherlv_0= 'Sensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'health' otherlv_4= ':' ( (lv_status_5_0= ruleStatus ) ) otherlv_6= 'topic' otherlv_7= ':' ( (lv_topic_8_0= ruleEString ) ) otherlv_9= 'functions' otherlv_10= ':' otherlv_11= '[' ( (lv_function_12_0= ruleFunction ) ) (otherlv_13= ',' ( (lv_function_14_0= ruleFunction ) ) )* otherlv_15= ']' (otherlv_16= 'frequency' otherlv_17= ':' ( (lv_frequency_18_0= ruleEFloat ) ) )? otherlv_19= '}' )
            {
            // InternalCpsml.g:791:2: (otherlv_0= 'Sensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'health' otherlv_4= ':' ( (lv_status_5_0= ruleStatus ) ) otherlv_6= 'topic' otherlv_7= ':' ( (lv_topic_8_0= ruleEString ) ) otherlv_9= 'functions' otherlv_10= ':' otherlv_11= '[' ( (lv_function_12_0= ruleFunction ) ) (otherlv_13= ',' ( (lv_function_14_0= ruleFunction ) ) )* otherlv_15= ']' (otherlv_16= 'frequency' otherlv_17= ':' ( (lv_frequency_18_0= ruleEFloat ) ) )? otherlv_19= '}' )
            // InternalCpsml.g:792:3: otherlv_0= 'Sensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'health' otherlv_4= ':' ( (lv_status_5_0= ruleStatus ) ) otherlv_6= 'topic' otherlv_7= ':' ( (lv_topic_8_0= ruleEString ) ) otherlv_9= 'functions' otherlv_10= ':' otherlv_11= '[' ( (lv_function_12_0= ruleFunction ) ) (otherlv_13= ',' ( (lv_function_14_0= ruleFunction ) ) )* otherlv_15= ']' (otherlv_16= 'frequency' otherlv_17= ':' ( (lv_frequency_18_0= ruleEFloat ) ) )? otherlv_19= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSensorAccess().getSensorKeyword_0());
            		
            // InternalCpsml.g:796:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCpsml.g:797:4: (lv_name_1_0= ruleEString )
            {
            // InternalCpsml.g:797:4: (lv_name_1_0= ruleEString )
            // InternalCpsml.g:798:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"at.ac.tuwien.big.Cpsml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getSensorAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getSensorAccess().getHealthKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getSensorAccess().getColonKeyword_4());
            		
            // InternalCpsml.g:827:3: ( (lv_status_5_0= ruleStatus ) )
            // InternalCpsml.g:828:4: (lv_status_5_0= ruleStatus )
            {
            // InternalCpsml.g:828:4: (lv_status_5_0= ruleStatus )
            // InternalCpsml.g:829:5: lv_status_5_0= ruleStatus
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getStatusStatusEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_22);
            lv_status_5_0=ruleStatus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorRule());
            					}
            					set(
            						current,
            						"status",
            						lv_status_5_0,
            						"at.ac.tuwien.big.Cpsml.Status");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,29,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getSensorAccess().getTopicKeyword_6());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getSensorAccess().getColonKeyword_7());
            		
            // InternalCpsml.g:854:3: ( (lv_topic_8_0= ruleEString ) )
            // InternalCpsml.g:855:4: (lv_topic_8_0= ruleEString )
            {
            // InternalCpsml.g:855:4: (lv_topic_8_0= ruleEString )
            // InternalCpsml.g:856:5: lv_topic_8_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getTopicEStringParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_23);
            lv_topic_8_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorRule());
            					}
            					set(
            						current,
            						"topic",
            						lv_topic_8_0,
            						"at.ac.tuwien.big.Cpsml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,30,FOLLOW_6); 

            			newLeafNode(otherlv_9, grammarAccess.getSensorAccess().getFunctionsKeyword_9());
            		
            otherlv_10=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_10, grammarAccess.getSensorAccess().getColonKeyword_10());
            		
            otherlv_11=(Token)match(input,15,FOLLOW_24); 

            			newLeafNode(otherlv_11, grammarAccess.getSensorAccess().getLeftSquareBracketKeyword_11());
            		
            // InternalCpsml.g:885:3: ( (lv_function_12_0= ruleFunction ) )
            // InternalCpsml.g:886:4: (lv_function_12_0= ruleFunction )
            {
            // InternalCpsml.g:886:4: (lv_function_12_0= ruleFunction )
            // InternalCpsml.g:887:5: lv_function_12_0= ruleFunction
            {

            					newCompositeNode(grammarAccess.getSensorAccess().getFunctionFunctionParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_8);
            lv_function_12_0=ruleFunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorRule());
            					}
            					add(
            						current,
            						"function",
            						lv_function_12_0,
            						"at.ac.tuwien.big.Cpsml.Function");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCpsml.g:904:3: (otherlv_13= ',' ( (lv_function_14_0= ruleFunction ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==16) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalCpsml.g:905:4: otherlv_13= ',' ( (lv_function_14_0= ruleFunction ) )
            	    {
            	    otherlv_13=(Token)match(input,16,FOLLOW_24); 

            	    				newLeafNode(otherlv_13, grammarAccess.getSensorAccess().getCommaKeyword_13_0());
            	    			
            	    // InternalCpsml.g:909:4: ( (lv_function_14_0= ruleFunction ) )
            	    // InternalCpsml.g:910:5: (lv_function_14_0= ruleFunction )
            	    {
            	    // InternalCpsml.g:910:5: (lv_function_14_0= ruleFunction )
            	    // InternalCpsml.g:911:6: lv_function_14_0= ruleFunction
            	    {

            	    						newCompositeNode(grammarAccess.getSensorAccess().getFunctionFunctionParserRuleCall_13_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_function_14_0=ruleFunction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSensorRule());
            	    						}
            	    						add(
            	    							current,
            	    							"function",
            	    							lv_function_14_0,
            	    							"at.ac.tuwien.big.Cpsml.Function");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_15=(Token)match(input,17,FOLLOW_25); 

            			newLeafNode(otherlv_15, grammarAccess.getSensorAccess().getRightSquareBracketKeyword_14());
            		
            // InternalCpsml.g:933:3: (otherlv_16= 'frequency' otherlv_17= ':' ( (lv_frequency_18_0= ruleEFloat ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==31) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCpsml.g:934:4: otherlv_16= 'frequency' otherlv_17= ':' ( (lv_frequency_18_0= ruleEFloat ) )
                    {
                    otherlv_16=(Token)match(input,31,FOLLOW_6); 

                    				newLeafNode(otherlv_16, grammarAccess.getSensorAccess().getFrequencyKeyword_15_0());
                    			
                    otherlv_17=(Token)match(input,14,FOLLOW_26); 

                    				newLeafNode(otherlv_17, grammarAccess.getSensorAccess().getColonKeyword_15_1());
                    			
                    // InternalCpsml.g:942:4: ( (lv_frequency_18_0= ruleEFloat ) )
                    // InternalCpsml.g:943:5: (lv_frequency_18_0= ruleEFloat )
                    {
                    // InternalCpsml.g:943:5: (lv_frequency_18_0= ruleEFloat )
                    // InternalCpsml.g:944:6: lv_frequency_18_0= ruleEFloat
                    {

                    						newCompositeNode(grammarAccess.getSensorAccess().getFrequencyEFloatParserRuleCall_15_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_frequency_18_0=ruleEFloat();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSensorRule());
                    						}
                    						set(
                    							current,
                    							"frequency",
                    							lv_frequency_18_0,
                    							"at.ac.tuwien.big.Cpsml.EFloat");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_19=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getSensorAccess().getRightCurlyBracketKeyword_16());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleActuator"
    // InternalCpsml.g:970:1: entryRuleActuator returns [EObject current=null] : iv_ruleActuator= ruleActuator EOF ;
    public final EObject entryRuleActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuator = null;


        try {
            // InternalCpsml.g:970:49: (iv_ruleActuator= ruleActuator EOF )
            // InternalCpsml.g:971:2: iv_ruleActuator= ruleActuator EOF
            {
             newCompositeNode(grammarAccess.getActuatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActuator=ruleActuator();

            state._fsp--;

             current =iv_ruleActuator; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActuator"


    // $ANTLR start "ruleActuator"
    // InternalCpsml.g:977:1: ruleActuator returns [EObject current=null] : (otherlv_0= 'Actuator' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'health' otherlv_4= ':' ( (lv_status_5_0= ruleStatus ) ) otherlv_6= 'topic' otherlv_7= ':' ( (lv_topic_8_0= ruleEString ) ) (otherlv_9= 'runs' otherlv_10= ':' ( (lv_runs_11_0= ruleEInt ) ) )? (otherlv_12= 'ratedRuns' otherlv_13= ':' ( (lv_ratedRuns_14_0= ruleEInt ) ) )? otherlv_15= 'functions' otherlv_16= ':' otherlv_17= '[' ( (lv_function_18_0= ruleFunction ) ) (otherlv_19= ',' ( (lv_function_20_0= ruleFunction ) ) )* otherlv_21= ']' otherlv_22= '}' ) ;
    public final EObject ruleActuator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_status_5_0 = null;

        AntlrDatatypeRuleToken lv_topic_8_0 = null;

        AntlrDatatypeRuleToken lv_runs_11_0 = null;

        AntlrDatatypeRuleToken lv_ratedRuns_14_0 = null;

        EObject lv_function_18_0 = null;

        EObject lv_function_20_0 = null;



        	enterRule();

        try {
            // InternalCpsml.g:983:2: ( (otherlv_0= 'Actuator' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'health' otherlv_4= ':' ( (lv_status_5_0= ruleStatus ) ) otherlv_6= 'topic' otherlv_7= ':' ( (lv_topic_8_0= ruleEString ) ) (otherlv_9= 'runs' otherlv_10= ':' ( (lv_runs_11_0= ruleEInt ) ) )? (otherlv_12= 'ratedRuns' otherlv_13= ':' ( (lv_ratedRuns_14_0= ruleEInt ) ) )? otherlv_15= 'functions' otherlv_16= ':' otherlv_17= '[' ( (lv_function_18_0= ruleFunction ) ) (otherlv_19= ',' ( (lv_function_20_0= ruleFunction ) ) )* otherlv_21= ']' otherlv_22= '}' ) )
            // InternalCpsml.g:984:2: (otherlv_0= 'Actuator' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'health' otherlv_4= ':' ( (lv_status_5_0= ruleStatus ) ) otherlv_6= 'topic' otherlv_7= ':' ( (lv_topic_8_0= ruleEString ) ) (otherlv_9= 'runs' otherlv_10= ':' ( (lv_runs_11_0= ruleEInt ) ) )? (otherlv_12= 'ratedRuns' otherlv_13= ':' ( (lv_ratedRuns_14_0= ruleEInt ) ) )? otherlv_15= 'functions' otherlv_16= ':' otherlv_17= '[' ( (lv_function_18_0= ruleFunction ) ) (otherlv_19= ',' ( (lv_function_20_0= ruleFunction ) ) )* otherlv_21= ']' otherlv_22= '}' )
            {
            // InternalCpsml.g:984:2: (otherlv_0= 'Actuator' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'health' otherlv_4= ':' ( (lv_status_5_0= ruleStatus ) ) otherlv_6= 'topic' otherlv_7= ':' ( (lv_topic_8_0= ruleEString ) ) (otherlv_9= 'runs' otherlv_10= ':' ( (lv_runs_11_0= ruleEInt ) ) )? (otherlv_12= 'ratedRuns' otherlv_13= ':' ( (lv_ratedRuns_14_0= ruleEInt ) ) )? otherlv_15= 'functions' otherlv_16= ':' otherlv_17= '[' ( (lv_function_18_0= ruleFunction ) ) (otherlv_19= ',' ( (lv_function_20_0= ruleFunction ) ) )* otherlv_21= ']' otherlv_22= '}' )
            // InternalCpsml.g:985:3: otherlv_0= 'Actuator' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'health' otherlv_4= ':' ( (lv_status_5_0= ruleStatus ) ) otherlv_6= 'topic' otherlv_7= ':' ( (lv_topic_8_0= ruleEString ) ) (otherlv_9= 'runs' otherlv_10= ':' ( (lv_runs_11_0= ruleEInt ) ) )? (otherlv_12= 'ratedRuns' otherlv_13= ':' ( (lv_ratedRuns_14_0= ruleEInt ) ) )? otherlv_15= 'functions' otherlv_16= ':' otherlv_17= '[' ( (lv_function_18_0= ruleFunction ) ) (otherlv_19= ',' ( (lv_function_20_0= ruleFunction ) ) )* otherlv_21= ']' otherlv_22= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getActuatorAccess().getActuatorKeyword_0());
            		
            // InternalCpsml.g:989:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCpsml.g:990:4: (lv_name_1_0= ruleEString )
            {
            // InternalCpsml.g:990:4: (lv_name_1_0= ruleEString )
            // InternalCpsml.g:991:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActuatorAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActuatorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"at.ac.tuwien.big.Cpsml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getActuatorAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getActuatorAccess().getHealthKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_14); 

            			newLeafNode(otherlv_4, grammarAccess.getActuatorAccess().getColonKeyword_4());
            		
            // InternalCpsml.g:1020:3: ( (lv_status_5_0= ruleStatus ) )
            // InternalCpsml.g:1021:4: (lv_status_5_0= ruleStatus )
            {
            // InternalCpsml.g:1021:4: (lv_status_5_0= ruleStatus )
            // InternalCpsml.g:1022:5: lv_status_5_0= ruleStatus
            {

            					newCompositeNode(grammarAccess.getActuatorAccess().getStatusStatusEnumRuleCall_5_0());
            				
            pushFollow(FOLLOW_22);
            lv_status_5_0=ruleStatus();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActuatorRule());
            					}
            					set(
            						current,
            						"status",
            						lv_status_5_0,
            						"at.ac.tuwien.big.Cpsml.Status");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,29,FOLLOW_6); 

            			newLeafNode(otherlv_6, grammarAccess.getActuatorAccess().getTopicKeyword_6());
            		
            otherlv_7=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getActuatorAccess().getColonKeyword_7());
            		
            // InternalCpsml.g:1047:3: ( (lv_topic_8_0= ruleEString ) )
            // InternalCpsml.g:1048:4: (lv_topic_8_0= ruleEString )
            {
            // InternalCpsml.g:1048:4: (lv_topic_8_0= ruleEString )
            // InternalCpsml.g:1049:5: lv_topic_8_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActuatorAccess().getTopicEStringParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_27);
            lv_topic_8_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActuatorRule());
            					}
            					set(
            						current,
            						"topic",
            						lv_topic_8_0,
            						"at.ac.tuwien.big.Cpsml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCpsml.g:1066:3: (otherlv_9= 'runs' otherlv_10= ':' ( (lv_runs_11_0= ruleEInt ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCpsml.g:1067:4: otherlv_9= 'runs' otherlv_10= ':' ( (lv_runs_11_0= ruleEInt ) )
                    {
                    otherlv_9=(Token)match(input,33,FOLLOW_6); 

                    				newLeafNode(otherlv_9, grammarAccess.getActuatorAccess().getRunsKeyword_9_0());
                    			
                    otherlv_10=(Token)match(input,14,FOLLOW_28); 

                    				newLeafNode(otherlv_10, grammarAccess.getActuatorAccess().getColonKeyword_9_1());
                    			
                    // InternalCpsml.g:1075:4: ( (lv_runs_11_0= ruleEInt ) )
                    // InternalCpsml.g:1076:5: (lv_runs_11_0= ruleEInt )
                    {
                    // InternalCpsml.g:1076:5: (lv_runs_11_0= ruleEInt )
                    // InternalCpsml.g:1077:6: lv_runs_11_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getActuatorAccess().getRunsEIntParserRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_runs_11_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActuatorRule());
                    						}
                    						set(
                    							current,
                    							"runs",
                    							lv_runs_11_0,
                    							"at.ac.tuwien.big.Cpsml.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCpsml.g:1095:3: (otherlv_12= 'ratedRuns' otherlv_13= ':' ( (lv_ratedRuns_14_0= ruleEInt ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==34) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCpsml.g:1096:4: otherlv_12= 'ratedRuns' otherlv_13= ':' ( (lv_ratedRuns_14_0= ruleEInt ) )
                    {
                    otherlv_12=(Token)match(input,34,FOLLOW_6); 

                    				newLeafNode(otherlv_12, grammarAccess.getActuatorAccess().getRatedRunsKeyword_10_0());
                    			
                    otherlv_13=(Token)match(input,14,FOLLOW_28); 

                    				newLeafNode(otherlv_13, grammarAccess.getActuatorAccess().getColonKeyword_10_1());
                    			
                    // InternalCpsml.g:1104:4: ( (lv_ratedRuns_14_0= ruleEInt ) )
                    // InternalCpsml.g:1105:5: (lv_ratedRuns_14_0= ruleEInt )
                    {
                    // InternalCpsml.g:1105:5: (lv_ratedRuns_14_0= ruleEInt )
                    // InternalCpsml.g:1106:6: lv_ratedRuns_14_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getActuatorAccess().getRatedRunsEIntParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_ratedRuns_14_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActuatorRule());
                    						}
                    						set(
                    							current,
                    							"ratedRuns",
                    							lv_ratedRuns_14_0,
                    							"at.ac.tuwien.big.Cpsml.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,30,FOLLOW_6); 

            			newLeafNode(otherlv_15, grammarAccess.getActuatorAccess().getFunctionsKeyword_11());
            		
            otherlv_16=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_16, grammarAccess.getActuatorAccess().getColonKeyword_12());
            		
            otherlv_17=(Token)match(input,15,FOLLOW_24); 

            			newLeafNode(otherlv_17, grammarAccess.getActuatorAccess().getLeftSquareBracketKeyword_13());
            		
            // InternalCpsml.g:1136:3: ( (lv_function_18_0= ruleFunction ) )
            // InternalCpsml.g:1137:4: (lv_function_18_0= ruleFunction )
            {
            // InternalCpsml.g:1137:4: (lv_function_18_0= ruleFunction )
            // InternalCpsml.g:1138:5: lv_function_18_0= ruleFunction
            {

            					newCompositeNode(grammarAccess.getActuatorAccess().getFunctionFunctionParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_8);
            lv_function_18_0=ruleFunction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActuatorRule());
            					}
            					add(
            						current,
            						"function",
            						lv_function_18_0,
            						"at.ac.tuwien.big.Cpsml.Function");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCpsml.g:1155:3: (otherlv_19= ',' ( (lv_function_20_0= ruleFunction ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==16) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalCpsml.g:1156:4: otherlv_19= ',' ( (lv_function_20_0= ruleFunction ) )
            	    {
            	    otherlv_19=(Token)match(input,16,FOLLOW_24); 

            	    				newLeafNode(otherlv_19, grammarAccess.getActuatorAccess().getCommaKeyword_15_0());
            	    			
            	    // InternalCpsml.g:1160:4: ( (lv_function_20_0= ruleFunction ) )
            	    // InternalCpsml.g:1161:5: (lv_function_20_0= ruleFunction )
            	    {
            	    // InternalCpsml.g:1161:5: (lv_function_20_0= ruleFunction )
            	    // InternalCpsml.g:1162:6: lv_function_20_0= ruleFunction
            	    {

            	    						newCompositeNode(grammarAccess.getActuatorAccess().getFunctionFunctionParserRuleCall_15_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_function_20_0=ruleFunction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getActuatorRule());
            	    						}
            	    						add(
            	    							current,
            	    							"function",
            	    							lv_function_20_0,
            	    							"at.ac.tuwien.big.Cpsml.Function");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_21=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_21, grammarAccess.getActuatorAccess().getRightSquareBracketKeyword_16());
            		
            otherlv_22=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getActuatorAccess().getRightCurlyBracketKeyword_17());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActuator"


    // $ANTLR start "entryRuleFunction"
    // InternalCpsml.g:1192:1: entryRuleFunction returns [EObject current=null] : iv_ruleFunction= ruleFunction EOF ;
    public final EObject entryRuleFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunction = null;


        try {
            // InternalCpsml.g:1192:49: (iv_ruleFunction= ruleFunction EOF )
            // InternalCpsml.g:1193:2: iv_ruleFunction= ruleFunction EOF
            {
             newCompositeNode(grammarAccess.getFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunction=ruleFunction();

            state._fsp--;

             current =iv_ruleFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunction"


    // $ANTLR start "ruleFunction"
    // InternalCpsml.g:1199:1: ruleFunction returns [EObject current=null] : ( ( ( (lv_returnDataType_0_0= ruleDataType ) ) ( (lv_hasReturn_1_0= '::' ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parameter_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameter_6_0= ruleParameter ) ) )* )? otherlv_7= ')' ) ;
    public final EObject ruleFunction() throws RecognitionException {
        EObject current = null;

        Token lv_hasReturn_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_returnDataType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_parameter_4_0 = null;

        EObject lv_parameter_6_0 = null;



        	enterRule();

        try {
            // InternalCpsml.g:1205:2: ( ( ( ( (lv_returnDataType_0_0= ruleDataType ) ) ( (lv_hasReturn_1_0= '::' ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parameter_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameter_6_0= ruleParameter ) ) )* )? otherlv_7= ')' ) )
            // InternalCpsml.g:1206:2: ( ( ( (lv_returnDataType_0_0= ruleDataType ) ) ( (lv_hasReturn_1_0= '::' ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parameter_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameter_6_0= ruleParameter ) ) )* )? otherlv_7= ')' )
            {
            // InternalCpsml.g:1206:2: ( ( ( (lv_returnDataType_0_0= ruleDataType ) ) ( (lv_hasReturn_1_0= '::' ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parameter_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameter_6_0= ruleParameter ) ) )* )? otherlv_7= ')' )
            // InternalCpsml.g:1207:3: ( ( (lv_returnDataType_0_0= ruleDataType ) ) ( (lv_hasReturn_1_0= '::' ) ) )? ( (lv_name_2_0= ruleEString ) ) otherlv_3= '(' ( ( (lv_parameter_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameter_6_0= ruleParameter ) ) )* )? otherlv_7= ')'
            {
            // InternalCpsml.g:1207:3: ( ( (lv_returnDataType_0_0= ruleDataType ) ) ( (lv_hasReturn_1_0= '::' ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=55 && LA17_0<=58)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCpsml.g:1208:4: ( (lv_returnDataType_0_0= ruleDataType ) ) ( (lv_hasReturn_1_0= '::' ) )
                    {
                    // InternalCpsml.g:1208:4: ( (lv_returnDataType_0_0= ruleDataType ) )
                    // InternalCpsml.g:1209:5: (lv_returnDataType_0_0= ruleDataType )
                    {
                    // InternalCpsml.g:1209:5: (lv_returnDataType_0_0= ruleDataType )
                    // InternalCpsml.g:1210:6: lv_returnDataType_0_0= ruleDataType
                    {

                    						newCompositeNode(grammarAccess.getFunctionAccess().getReturnDataTypeDataTypeEnumRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_returnDataType_0_0=ruleDataType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFunctionRule());
                    						}
                    						set(
                    							current,
                    							"returnDataType",
                    							lv_returnDataType_0_0,
                    							"at.ac.tuwien.big.Cpsml.DataType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCpsml.g:1227:4: ( (lv_hasReturn_1_0= '::' ) )
                    // InternalCpsml.g:1228:5: (lv_hasReturn_1_0= '::' )
                    {
                    // InternalCpsml.g:1228:5: (lv_hasReturn_1_0= '::' )
                    // InternalCpsml.g:1229:6: lv_hasReturn_1_0= '::'
                    {
                    lv_hasReturn_1_0=(Token)match(input,35,FOLLOW_3); 

                    						newLeafNode(lv_hasReturn_1_0, grammarAccess.getFunctionAccess().getHasReturnColonColonKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFunctionRule());
                    						}
                    						setWithLastConsumed(current, "hasReturn", lv_hasReturn_1_0 != null, "::");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalCpsml.g:1242:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCpsml.g:1243:4: (lv_name_2_0= ruleEString )
            {
            // InternalCpsml.g:1243:4: (lv_name_2_0= ruleEString )
            // InternalCpsml.g:1244:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFunctionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_31);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFunctionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"at.ac.tuwien.big.Cpsml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,36,FOLLOW_32); 

            			newLeafNode(otherlv_3, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_2());
            		
            // InternalCpsml.g:1265:3: ( ( (lv_parameter_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameter_6_0= ruleParameter ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=55 && LA19_0<=58)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalCpsml.g:1266:4: ( (lv_parameter_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameter_6_0= ruleParameter ) ) )*
                    {
                    // InternalCpsml.g:1266:4: ( (lv_parameter_4_0= ruleParameter ) )
                    // InternalCpsml.g:1267:5: (lv_parameter_4_0= ruleParameter )
                    {
                    // InternalCpsml.g:1267:5: (lv_parameter_4_0= ruleParameter )
                    // InternalCpsml.g:1268:6: lv_parameter_4_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getFunctionAccess().getParameterParameterParserRuleCall_3_0_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_parameter_4_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFunctionRule());
                    						}
                    						add(
                    							current,
                    							"parameter",
                    							lv_parameter_4_0,
                    							"at.ac.tuwien.big.Cpsml.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCpsml.g:1285:4: (otherlv_5= ',' ( (lv_parameter_6_0= ruleParameter ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==16) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalCpsml.g:1286:5: otherlv_5= ',' ( (lv_parameter_6_0= ruleParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,16,FOLLOW_34); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getFunctionAccess().getCommaKeyword_3_1_0());
                    	    				
                    	    // InternalCpsml.g:1290:5: ( (lv_parameter_6_0= ruleParameter ) )
                    	    // InternalCpsml.g:1291:6: (lv_parameter_6_0= ruleParameter )
                    	    {
                    	    // InternalCpsml.g:1291:6: (lv_parameter_6_0= ruleParameter )
                    	    // InternalCpsml.g:1292:7: lv_parameter_6_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getFunctionAccess().getParameterParameterParserRuleCall_3_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_33);
                    	    lv_parameter_6_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getFunctionRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameter",
                    	    								lv_parameter_6_0,
                    	    								"at.ac.tuwien.big.Cpsml.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,37,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunction"


    // $ANTLR start "entryRuleParameter"
    // InternalCpsml.g:1319:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalCpsml.g:1319:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalCpsml.g:1320:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalCpsml.g:1326:1: ruleParameter returns [EObject current=null] : ( ( (lv_dataType_0_0= ruleDataType ) ) otherlv_1= '::' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_dataType_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalCpsml.g:1332:2: ( ( ( (lv_dataType_0_0= ruleDataType ) ) otherlv_1= '::' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalCpsml.g:1333:2: ( ( (lv_dataType_0_0= ruleDataType ) ) otherlv_1= '::' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalCpsml.g:1333:2: ( ( (lv_dataType_0_0= ruleDataType ) ) otherlv_1= '::' ( (lv_name_2_0= ruleEString ) ) )
            // InternalCpsml.g:1334:3: ( (lv_dataType_0_0= ruleDataType ) ) otherlv_1= '::' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalCpsml.g:1334:3: ( (lv_dataType_0_0= ruleDataType ) )
            // InternalCpsml.g:1335:4: (lv_dataType_0_0= ruleDataType )
            {
            // InternalCpsml.g:1335:4: (lv_dataType_0_0= ruleDataType )
            // InternalCpsml.g:1336:5: lv_dataType_0_0= ruleDataType
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getDataTypeDataTypeEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_30);
            lv_dataType_0_0=ruleDataType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"dataType",
            						lv_dataType_0_0,
            						"at.ac.tuwien.big.Cpsml.DataType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonColonKeyword_1());
            		
            // InternalCpsml.g:1357:3: ( (lv_name_2_0= ruleEString ) )
            // InternalCpsml.g:1358:4: (lv_name_2_0= ruleEString )
            {
            // InternalCpsml.g:1358:4: (lv_name_2_0= ruleEString )
            // InternalCpsml.g:1359:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"at.ac.tuwien.big.Cpsml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleMessageBroker"
    // InternalCpsml.g:1380:1: entryRuleMessageBroker returns [EObject current=null] : iv_ruleMessageBroker= ruleMessageBroker EOF ;
    public final EObject entryRuleMessageBroker() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessageBroker = null;


        try {
            // InternalCpsml.g:1380:54: (iv_ruleMessageBroker= ruleMessageBroker EOF )
            // InternalCpsml.g:1381:2: iv_ruleMessageBroker= ruleMessageBroker EOF
            {
             newCompositeNode(grammarAccess.getMessageBrokerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessageBroker=ruleMessageBroker();

            state._fsp--;

             current =iv_ruleMessageBroker; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMessageBroker"


    // $ANTLR start "ruleMessageBroker"
    // InternalCpsml.g:1387:1: ruleMessageBroker returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'Position' ( (lv_position_3_0= rulePosition ) ) otherlv_4= 'topics' otherlv_5= ':' otherlv_6= '[' ( (lv_topics_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_topics_9_0= ruleEString ) ) )* otherlv_10= ']' otherlv_11= 'connectionModules' otherlv_12= ':' otherlv_13= '[' ( (lv_connectionModule_14_0= ruleConnectionModule ) ) (otherlv_15= ',' ( (lv_connectionModule_16_0= ruleConnectionModule ) ) )* otherlv_17= ']' otherlv_18= '}' ) ;
    public final EObject ruleMessageBroker() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_position_3_0 = null;

        AntlrDatatypeRuleToken lv_topics_7_0 = null;

        AntlrDatatypeRuleToken lv_topics_9_0 = null;

        EObject lv_connectionModule_14_0 = null;

        EObject lv_connectionModule_16_0 = null;



        	enterRule();

        try {
            // InternalCpsml.g:1393:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'Position' ( (lv_position_3_0= rulePosition ) ) otherlv_4= 'topics' otherlv_5= ':' otherlv_6= '[' ( (lv_topics_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_topics_9_0= ruleEString ) ) )* otherlv_10= ']' otherlv_11= 'connectionModules' otherlv_12= ':' otherlv_13= '[' ( (lv_connectionModule_14_0= ruleConnectionModule ) ) (otherlv_15= ',' ( (lv_connectionModule_16_0= ruleConnectionModule ) ) )* otherlv_17= ']' otherlv_18= '}' ) )
            // InternalCpsml.g:1394:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'Position' ( (lv_position_3_0= rulePosition ) ) otherlv_4= 'topics' otherlv_5= ':' otherlv_6= '[' ( (lv_topics_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_topics_9_0= ruleEString ) ) )* otherlv_10= ']' otherlv_11= 'connectionModules' otherlv_12= ':' otherlv_13= '[' ( (lv_connectionModule_14_0= ruleConnectionModule ) ) (otherlv_15= ',' ( (lv_connectionModule_16_0= ruleConnectionModule ) ) )* otherlv_17= ']' otherlv_18= '}' )
            {
            // InternalCpsml.g:1394:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'Position' ( (lv_position_3_0= rulePosition ) ) otherlv_4= 'topics' otherlv_5= ':' otherlv_6= '[' ( (lv_topics_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_topics_9_0= ruleEString ) ) )* otherlv_10= ']' otherlv_11= 'connectionModules' otherlv_12= ':' otherlv_13= '[' ( (lv_connectionModule_14_0= ruleConnectionModule ) ) (otherlv_15= ',' ( (lv_connectionModule_16_0= ruleConnectionModule ) ) )* otherlv_17= ']' otherlv_18= '}' )
            // InternalCpsml.g:1395:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'Position' ( (lv_position_3_0= rulePosition ) ) otherlv_4= 'topics' otherlv_5= ':' otherlv_6= '[' ( (lv_topics_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_topics_9_0= ruleEString ) ) )* otherlv_10= ']' otherlv_11= 'connectionModules' otherlv_12= ':' otherlv_13= '[' ( (lv_connectionModule_14_0= ruleConnectionModule ) ) (otherlv_15= ',' ( (lv_connectionModule_16_0= ruleConnectionModule ) ) )* otherlv_17= ']' otherlv_18= '}'
            {
            // InternalCpsml.g:1395:3: ( (lv_name_0_0= ruleEString ) )
            // InternalCpsml.g:1396:4: (lv_name_0_0= ruleEString )
            {
            // InternalCpsml.g:1396:4: (lv_name_0_0= ruleEString )
            // InternalCpsml.g:1397:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMessageBrokerAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMessageBrokerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"at.ac.tuwien.big.Cpsml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getMessageBrokerAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,23,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getMessageBrokerAccess().getPositionKeyword_2());
            		
            // InternalCpsml.g:1422:3: ( (lv_position_3_0= rulePosition ) )
            // InternalCpsml.g:1423:4: (lv_position_3_0= rulePosition )
            {
            // InternalCpsml.g:1423:4: (lv_position_3_0= rulePosition )
            // InternalCpsml.g:1424:5: lv_position_3_0= rulePosition
            {

            					newCompositeNode(grammarAccess.getMessageBrokerAccess().getPositionPositionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_35);
            lv_position_3_0=rulePosition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMessageBrokerRule());
            					}
            					set(
            						current,
            						"position",
            						lv_position_3_0,
            						"at.ac.tuwien.big.Cpsml.Position");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,38,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getMessageBrokerAccess().getTopicsKeyword_4());
            		
            otherlv_5=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getMessageBrokerAccess().getColonKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getMessageBrokerAccess().getLeftSquareBracketKeyword_6());
            		
            // InternalCpsml.g:1453:3: ( (lv_topics_7_0= ruleEString ) )
            // InternalCpsml.g:1454:4: (lv_topics_7_0= ruleEString )
            {
            // InternalCpsml.g:1454:4: (lv_topics_7_0= ruleEString )
            // InternalCpsml.g:1455:5: lv_topics_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMessageBrokerAccess().getTopicsEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_8);
            lv_topics_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMessageBrokerRule());
            					}
            					add(
            						current,
            						"topics",
            						lv_topics_7_0,
            						"at.ac.tuwien.big.Cpsml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCpsml.g:1472:3: (otherlv_8= ',' ( (lv_topics_9_0= ruleEString ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==16) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalCpsml.g:1473:4: otherlv_8= ',' ( (lv_topics_9_0= ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,16,FOLLOW_3); 

            	    				newLeafNode(otherlv_8, grammarAccess.getMessageBrokerAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalCpsml.g:1477:4: ( (lv_topics_9_0= ruleEString ) )
            	    // InternalCpsml.g:1478:5: (lv_topics_9_0= ruleEString )
            	    {
            	    // InternalCpsml.g:1478:5: (lv_topics_9_0= ruleEString )
            	    // InternalCpsml.g:1479:6: lv_topics_9_0= ruleEString
            	    {

            	    						newCompositeNode(grammarAccess.getMessageBrokerAccess().getTopicsEStringParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_topics_9_0=ruleEString();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMessageBrokerRule());
            	    						}
            	    						add(
            	    							current,
            	    							"topics",
            	    							lv_topics_9_0,
            	    							"at.ac.tuwien.big.Cpsml.EString");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_10=(Token)match(input,17,FOLLOW_18); 

            			newLeafNode(otherlv_10, grammarAccess.getMessageBrokerAccess().getRightSquareBracketKeyword_9());
            		
            otherlv_11=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_11, grammarAccess.getMessageBrokerAccess().getConnectionModulesKeyword_10());
            		
            otherlv_12=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_12, grammarAccess.getMessageBrokerAccess().getColonKeyword_11());
            		
            otherlv_13=(Token)match(input,15,FOLLOW_19); 

            			newLeafNode(otherlv_13, grammarAccess.getMessageBrokerAccess().getLeftSquareBracketKeyword_12());
            		
            // InternalCpsml.g:1513:3: ( (lv_connectionModule_14_0= ruleConnectionModule ) )
            // InternalCpsml.g:1514:4: (lv_connectionModule_14_0= ruleConnectionModule )
            {
            // InternalCpsml.g:1514:4: (lv_connectionModule_14_0= ruleConnectionModule )
            // InternalCpsml.g:1515:5: lv_connectionModule_14_0= ruleConnectionModule
            {

            					newCompositeNode(grammarAccess.getMessageBrokerAccess().getConnectionModuleConnectionModuleParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_8);
            lv_connectionModule_14_0=ruleConnectionModule();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMessageBrokerRule());
            					}
            					add(
            						current,
            						"connectionModule",
            						lv_connectionModule_14_0,
            						"at.ac.tuwien.big.Cpsml.ConnectionModule");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCpsml.g:1532:3: (otherlv_15= ',' ( (lv_connectionModule_16_0= ruleConnectionModule ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==16) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalCpsml.g:1533:4: otherlv_15= ',' ( (lv_connectionModule_16_0= ruleConnectionModule ) )
            	    {
            	    otherlv_15=(Token)match(input,16,FOLLOW_19); 

            	    				newLeafNode(otherlv_15, grammarAccess.getMessageBrokerAccess().getCommaKeyword_14_0());
            	    			
            	    // InternalCpsml.g:1537:4: ( (lv_connectionModule_16_0= ruleConnectionModule ) )
            	    // InternalCpsml.g:1538:5: (lv_connectionModule_16_0= ruleConnectionModule )
            	    {
            	    // InternalCpsml.g:1538:5: (lv_connectionModule_16_0= ruleConnectionModule )
            	    // InternalCpsml.g:1539:6: lv_connectionModule_16_0= ruleConnectionModule
            	    {

            	    						newCompositeNode(grammarAccess.getMessageBrokerAccess().getConnectionModuleConnectionModuleParserRuleCall_14_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_connectionModule_16_0=ruleConnectionModule();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMessageBrokerRule());
            	    						}
            	    						add(
            	    							current,
            	    							"connectionModule",
            	    							lv_connectionModule_16_0,
            	    							"at.ac.tuwien.big.Cpsml.ConnectionModule");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_17=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_17, grammarAccess.getMessageBrokerAccess().getRightSquareBracketKeyword_15());
            		
            otherlv_18=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getMessageBrokerAccess().getRightCurlyBracketKeyword_16());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMessageBroker"


    // $ANTLR start "entryRuleConnectionModule"
    // InternalCpsml.g:1569:1: entryRuleConnectionModule returns [EObject current=null] : iv_ruleConnectionModule= ruleConnectionModule EOF ;
    public final EObject entryRuleConnectionModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectionModule = null;


        try {
            // InternalCpsml.g:1569:57: (iv_ruleConnectionModule= ruleConnectionModule EOF )
            // InternalCpsml.g:1570:2: iv_ruleConnectionModule= ruleConnectionModule EOF
            {
             newCompositeNode(grammarAccess.getConnectionModuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConnectionModule=ruleConnectionModule();

            state._fsp--;

             current =iv_ruleConnectionModule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConnectionModule"


    // $ANTLR start "ruleConnectionModule"
    // InternalCpsml.g:1576:1: ruleConnectionModule returns [EObject current=null] : (this_WiredModule_0= ruleWiredModule | this_WirelessModule_1= ruleWirelessModule ) ;
    public final EObject ruleConnectionModule() throws RecognitionException {
        EObject current = null;

        EObject this_WiredModule_0 = null;

        EObject this_WirelessModule_1 = null;



        	enterRule();

        try {
            // InternalCpsml.g:1582:2: ( (this_WiredModule_0= ruleWiredModule | this_WirelessModule_1= ruleWirelessModule ) )
            // InternalCpsml.g:1583:2: (this_WiredModule_0= ruleWiredModule | this_WirelessModule_1= ruleWirelessModule )
            {
            // InternalCpsml.g:1583:2: (this_WiredModule_0= ruleWiredModule | this_WirelessModule_1= ruleWirelessModule )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==39) ) {
                alt22=1;
            }
            else if ( (LA22_0==44) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalCpsml.g:1584:3: this_WiredModule_0= ruleWiredModule
                    {

                    			newCompositeNode(grammarAccess.getConnectionModuleAccess().getWiredModuleParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_WiredModule_0=ruleWiredModule();

                    state._fsp--;


                    			current = this_WiredModule_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCpsml.g:1593:3: this_WirelessModule_1= ruleWirelessModule
                    {

                    			newCompositeNode(grammarAccess.getConnectionModuleAccess().getWirelessModuleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_WirelessModule_1=ruleWirelessModule();

                    state._fsp--;


                    			current = this_WirelessModule_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConnectionModule"


    // $ANTLR start "entryRuleWiredModule"
    // InternalCpsml.g:1605:1: entryRuleWiredModule returns [EObject current=null] : iv_ruleWiredModule= ruleWiredModule EOF ;
    public final EObject entryRuleWiredModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWiredModule = null;


        try {
            // InternalCpsml.g:1605:52: (iv_ruleWiredModule= ruleWiredModule EOF )
            // InternalCpsml.g:1606:2: iv_ruleWiredModule= ruleWiredModule EOF
            {
             newCompositeNode(grammarAccess.getWiredModuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWiredModule=ruleWiredModule();

            state._fsp--;

             current =iv_ruleWiredModule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWiredModule"


    // $ANTLR start "ruleWiredModule"
    // InternalCpsml.g:1612:1: ruleWiredModule returns [EObject current=null] : (otherlv_0= 'WiredModule' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'supportedProtocols' otherlv_4= ':' otherlv_5= '[' ( (lv_supportedProtocols_6_0= ruleProtocol ) ) (otherlv_7= ',' ( (lv_supportedProtocols_8_0= ruleProtocol ) ) )* otherlv_9= ']' (otherlv_10= 'connect' otherlv_11= '->' otherlv_12= '[' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ']' )? (otherlv_17= 'connectOpposite' otherlv_18= '->' otherlv_19= '[' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= ']' )? otherlv_24= '}' ) ;
    public final EObject ruleWiredModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_supportedProtocols_6_0 = null;

        Enumerator lv_supportedProtocols_8_0 = null;



        	enterRule();

        try {
            // InternalCpsml.g:1618:2: ( (otherlv_0= 'WiredModule' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'supportedProtocols' otherlv_4= ':' otherlv_5= '[' ( (lv_supportedProtocols_6_0= ruleProtocol ) ) (otherlv_7= ',' ( (lv_supportedProtocols_8_0= ruleProtocol ) ) )* otherlv_9= ']' (otherlv_10= 'connect' otherlv_11= '->' otherlv_12= '[' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ']' )? (otherlv_17= 'connectOpposite' otherlv_18= '->' otherlv_19= '[' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= ']' )? otherlv_24= '}' ) )
            // InternalCpsml.g:1619:2: (otherlv_0= 'WiredModule' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'supportedProtocols' otherlv_4= ':' otherlv_5= '[' ( (lv_supportedProtocols_6_0= ruleProtocol ) ) (otherlv_7= ',' ( (lv_supportedProtocols_8_0= ruleProtocol ) ) )* otherlv_9= ']' (otherlv_10= 'connect' otherlv_11= '->' otherlv_12= '[' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ']' )? (otherlv_17= 'connectOpposite' otherlv_18= '->' otherlv_19= '[' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= ']' )? otherlv_24= '}' )
            {
            // InternalCpsml.g:1619:2: (otherlv_0= 'WiredModule' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'supportedProtocols' otherlv_4= ':' otherlv_5= '[' ( (lv_supportedProtocols_6_0= ruleProtocol ) ) (otherlv_7= ',' ( (lv_supportedProtocols_8_0= ruleProtocol ) ) )* otherlv_9= ']' (otherlv_10= 'connect' otherlv_11= '->' otherlv_12= '[' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ']' )? (otherlv_17= 'connectOpposite' otherlv_18= '->' otherlv_19= '[' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= ']' )? otherlv_24= '}' )
            // InternalCpsml.g:1620:3: otherlv_0= 'WiredModule' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'supportedProtocols' otherlv_4= ':' otherlv_5= '[' ( (lv_supportedProtocols_6_0= ruleProtocol ) ) (otherlv_7= ',' ( (lv_supportedProtocols_8_0= ruleProtocol ) ) )* otherlv_9= ']' (otherlv_10= 'connect' otherlv_11= '->' otherlv_12= '[' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ']' )? (otherlv_17= 'connectOpposite' otherlv_18= '->' otherlv_19= '[' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= ']' )? otherlv_24= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getWiredModuleAccess().getWiredModuleKeyword_0());
            		
            // InternalCpsml.g:1624:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCpsml.g:1625:4: (lv_name_1_0= ruleEString )
            {
            // InternalCpsml.g:1625:4: (lv_name_1_0= ruleEString )
            // InternalCpsml.g:1626:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getWiredModuleAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWiredModuleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"at.ac.tuwien.big.Cpsml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getWiredModuleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,40,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getWiredModuleAccess().getSupportedProtocolsKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getWiredModuleAccess().getColonKeyword_4());
            		
            otherlv_5=(Token)match(input,15,FOLLOW_37); 

            			newLeafNode(otherlv_5, grammarAccess.getWiredModuleAccess().getLeftSquareBracketKeyword_5());
            		
            // InternalCpsml.g:1659:3: ( (lv_supportedProtocols_6_0= ruleProtocol ) )
            // InternalCpsml.g:1660:4: (lv_supportedProtocols_6_0= ruleProtocol )
            {
            // InternalCpsml.g:1660:4: (lv_supportedProtocols_6_0= ruleProtocol )
            // InternalCpsml.g:1661:5: lv_supportedProtocols_6_0= ruleProtocol
            {

            					newCompositeNode(grammarAccess.getWiredModuleAccess().getSupportedProtocolsProtocolEnumRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_supportedProtocols_6_0=ruleProtocol();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWiredModuleRule());
            					}
            					add(
            						current,
            						"supportedProtocols",
            						lv_supportedProtocols_6_0,
            						"at.ac.tuwien.big.Cpsml.Protocol");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCpsml.g:1678:3: (otherlv_7= ',' ( (lv_supportedProtocols_8_0= ruleProtocol ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==16) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalCpsml.g:1679:4: otherlv_7= ',' ( (lv_supportedProtocols_8_0= ruleProtocol ) )
            	    {
            	    otherlv_7=(Token)match(input,16,FOLLOW_37); 

            	    				newLeafNode(otherlv_7, grammarAccess.getWiredModuleAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalCpsml.g:1683:4: ( (lv_supportedProtocols_8_0= ruleProtocol ) )
            	    // InternalCpsml.g:1684:5: (lv_supportedProtocols_8_0= ruleProtocol )
            	    {
            	    // InternalCpsml.g:1684:5: (lv_supportedProtocols_8_0= ruleProtocol )
            	    // InternalCpsml.g:1685:6: lv_supportedProtocols_8_0= ruleProtocol
            	    {

            	    						newCompositeNode(grammarAccess.getWiredModuleAccess().getSupportedProtocolsProtocolEnumRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_supportedProtocols_8_0=ruleProtocol();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getWiredModuleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"supportedProtocols",
            	    							lv_supportedProtocols_8_0,
            	    							"at.ac.tuwien.big.Cpsml.Protocol");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_9=(Token)match(input,17,FOLLOW_38); 

            			newLeafNode(otherlv_9, grammarAccess.getWiredModuleAccess().getRightSquareBracketKeyword_8());
            		
            // InternalCpsml.g:1707:3: (otherlv_10= 'connect' otherlv_11= '->' otherlv_12= '[' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ']' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==41) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalCpsml.g:1708:4: otherlv_10= 'connect' otherlv_11= '->' otherlv_12= '[' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ']'
                    {
                    otherlv_10=(Token)match(input,41,FOLLOW_39); 

                    				newLeafNode(otherlv_10, grammarAccess.getWiredModuleAccess().getConnectKeyword_9_0());
                    			
                    otherlv_11=(Token)match(input,42,FOLLOW_7); 

                    				newLeafNode(otherlv_11, grammarAccess.getWiredModuleAccess().getHyphenMinusGreaterThanSignKeyword_9_1());
                    			
                    otherlv_12=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getWiredModuleAccess().getLeftSquareBracketKeyword_9_2());
                    			
                    // InternalCpsml.g:1720:4: ( ( ruleEString ) )
                    // InternalCpsml.g:1721:5: ( ruleEString )
                    {
                    // InternalCpsml.g:1721:5: ( ruleEString )
                    // InternalCpsml.g:1722:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWiredModuleRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getWiredModuleAccess().getConnectWiredModuleCrossReference_9_3_0());
                    					
                    pushFollow(FOLLOW_8);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCpsml.g:1736:4: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==16) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalCpsml.g:1737:5: otherlv_14= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,16,FOLLOW_3); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getWiredModuleAccess().getCommaKeyword_9_4_0());
                    	    				
                    	    // InternalCpsml.g:1741:5: ( ( ruleEString ) )
                    	    // InternalCpsml.g:1742:6: ( ruleEString )
                    	    {
                    	    // InternalCpsml.g:1742:6: ( ruleEString )
                    	    // InternalCpsml.g:1743:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getWiredModuleRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getWiredModuleAccess().getConnectWiredModuleCrossReference_9_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,17,FOLLOW_40); 

                    				newLeafNode(otherlv_16, grammarAccess.getWiredModuleAccess().getRightSquareBracketKeyword_9_5());
                    			

                    }
                    break;

            }

            // InternalCpsml.g:1763:3: (otherlv_17= 'connectOpposite' otherlv_18= '->' otherlv_19= '[' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= ']' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==43) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalCpsml.g:1764:4: otherlv_17= 'connectOpposite' otherlv_18= '->' otherlv_19= '[' ( ( ruleEString ) ) (otherlv_21= ',' ( ( ruleEString ) ) )* otherlv_23= ']'
                    {
                    otherlv_17=(Token)match(input,43,FOLLOW_39); 

                    				newLeafNode(otherlv_17, grammarAccess.getWiredModuleAccess().getConnectOppositeKeyword_10_0());
                    			
                    otherlv_18=(Token)match(input,42,FOLLOW_7); 

                    				newLeafNode(otherlv_18, grammarAccess.getWiredModuleAccess().getHyphenMinusGreaterThanSignKeyword_10_1());
                    			
                    otherlv_19=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_19, grammarAccess.getWiredModuleAccess().getLeftSquareBracketKeyword_10_2());
                    			
                    // InternalCpsml.g:1776:4: ( ( ruleEString ) )
                    // InternalCpsml.g:1777:5: ( ruleEString )
                    {
                    // InternalCpsml.g:1777:5: ( ruleEString )
                    // InternalCpsml.g:1778:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWiredModuleRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getWiredModuleAccess().getConnectOppositeWiredModuleCrossReference_10_3_0());
                    					
                    pushFollow(FOLLOW_8);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCpsml.g:1792:4: (otherlv_21= ',' ( ( ruleEString ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==16) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // InternalCpsml.g:1793:5: otherlv_21= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_21=(Token)match(input,16,FOLLOW_3); 

                    	    					newLeafNode(otherlv_21, grammarAccess.getWiredModuleAccess().getCommaKeyword_10_4_0());
                    	    				
                    	    // InternalCpsml.g:1797:5: ( ( ruleEString ) )
                    	    // InternalCpsml.g:1798:6: ( ruleEString )
                    	    {
                    	    // InternalCpsml.g:1798:6: ( ruleEString )
                    	    // InternalCpsml.g:1799:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getWiredModuleRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getWiredModuleAccess().getConnectOppositeWiredModuleCrossReference_10_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_23=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_23, grammarAccess.getWiredModuleAccess().getRightSquareBracketKeyword_10_5());
                    			

                    }
                    break;

            }

            otherlv_24=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getWiredModuleAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWiredModule"


    // $ANTLR start "entryRuleWirelessModule"
    // InternalCpsml.g:1827:1: entryRuleWirelessModule returns [EObject current=null] : iv_ruleWirelessModule= ruleWirelessModule EOF ;
    public final EObject entryRuleWirelessModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWirelessModule = null;


        try {
            // InternalCpsml.g:1827:55: (iv_ruleWirelessModule= ruleWirelessModule EOF )
            // InternalCpsml.g:1828:2: iv_ruleWirelessModule= ruleWirelessModule EOF
            {
             newCompositeNode(grammarAccess.getWirelessModuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWirelessModule=ruleWirelessModule();

            state._fsp--;

             current =iv_ruleWirelessModule; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWirelessModule"


    // $ANTLR start "ruleWirelessModule"
    // InternalCpsml.g:1834:1: ruleWirelessModule returns [EObject current=null] : (otherlv_0= 'WirelessModule' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'supportedProtocols' otherlv_4= ':' otherlv_5= '[' ( (lv_supportedProtocols_6_0= ruleProtocol ) ) (otherlv_7= ',' ( (lv_supportedProtocols_8_0= ruleProtocol ) ) )* otherlv_9= ']' otherlv_10= 'range' otherlv_11= ':' ( (lv_range_12_0= ruleEFloat ) ) (otherlv_13= 'connect' otherlv_14= '->' otherlv_15= '[' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ']' )? (otherlv_20= 'connectOpposite' otherlv_21= '->' otherlv_22= '[' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ']' )? otherlv_27= '}' ) ;
    public final EObject ruleWirelessModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_supportedProtocols_6_0 = null;

        Enumerator lv_supportedProtocols_8_0 = null;

        AntlrDatatypeRuleToken lv_range_12_0 = null;



        	enterRule();

        try {
            // InternalCpsml.g:1840:2: ( (otherlv_0= 'WirelessModule' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'supportedProtocols' otherlv_4= ':' otherlv_5= '[' ( (lv_supportedProtocols_6_0= ruleProtocol ) ) (otherlv_7= ',' ( (lv_supportedProtocols_8_0= ruleProtocol ) ) )* otherlv_9= ']' otherlv_10= 'range' otherlv_11= ':' ( (lv_range_12_0= ruleEFloat ) ) (otherlv_13= 'connect' otherlv_14= '->' otherlv_15= '[' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ']' )? (otherlv_20= 'connectOpposite' otherlv_21= '->' otherlv_22= '[' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ']' )? otherlv_27= '}' ) )
            // InternalCpsml.g:1841:2: (otherlv_0= 'WirelessModule' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'supportedProtocols' otherlv_4= ':' otherlv_5= '[' ( (lv_supportedProtocols_6_0= ruleProtocol ) ) (otherlv_7= ',' ( (lv_supportedProtocols_8_0= ruleProtocol ) ) )* otherlv_9= ']' otherlv_10= 'range' otherlv_11= ':' ( (lv_range_12_0= ruleEFloat ) ) (otherlv_13= 'connect' otherlv_14= '->' otherlv_15= '[' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ']' )? (otherlv_20= 'connectOpposite' otherlv_21= '->' otherlv_22= '[' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ']' )? otherlv_27= '}' )
            {
            // InternalCpsml.g:1841:2: (otherlv_0= 'WirelessModule' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'supportedProtocols' otherlv_4= ':' otherlv_5= '[' ( (lv_supportedProtocols_6_0= ruleProtocol ) ) (otherlv_7= ',' ( (lv_supportedProtocols_8_0= ruleProtocol ) ) )* otherlv_9= ']' otherlv_10= 'range' otherlv_11= ':' ( (lv_range_12_0= ruleEFloat ) ) (otherlv_13= 'connect' otherlv_14= '->' otherlv_15= '[' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ']' )? (otherlv_20= 'connectOpposite' otherlv_21= '->' otherlv_22= '[' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ']' )? otherlv_27= '}' )
            // InternalCpsml.g:1842:3: otherlv_0= 'WirelessModule' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'supportedProtocols' otherlv_4= ':' otherlv_5= '[' ( (lv_supportedProtocols_6_0= ruleProtocol ) ) (otherlv_7= ',' ( (lv_supportedProtocols_8_0= ruleProtocol ) ) )* otherlv_9= ']' otherlv_10= 'range' otherlv_11= ':' ( (lv_range_12_0= ruleEFloat ) ) (otherlv_13= 'connect' otherlv_14= '->' otherlv_15= '[' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ']' )? (otherlv_20= 'connectOpposite' otherlv_21= '->' otherlv_22= '[' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ']' )? otherlv_27= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getWirelessModuleAccess().getWirelessModuleKeyword_0());
            		
            // InternalCpsml.g:1846:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCpsml.g:1847:4: (lv_name_1_0= ruleEString )
            {
            // InternalCpsml.g:1847:4: (lv_name_1_0= ruleEString )
            // InternalCpsml.g:1848:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getWirelessModuleAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWirelessModuleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"at.ac.tuwien.big.Cpsml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getWirelessModuleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,40,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getWirelessModuleAccess().getSupportedProtocolsKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getWirelessModuleAccess().getColonKeyword_4());
            		
            otherlv_5=(Token)match(input,15,FOLLOW_37); 

            			newLeafNode(otherlv_5, grammarAccess.getWirelessModuleAccess().getLeftSquareBracketKeyword_5());
            		
            // InternalCpsml.g:1881:3: ( (lv_supportedProtocols_6_0= ruleProtocol ) )
            // InternalCpsml.g:1882:4: (lv_supportedProtocols_6_0= ruleProtocol )
            {
            // InternalCpsml.g:1882:4: (lv_supportedProtocols_6_0= ruleProtocol )
            // InternalCpsml.g:1883:5: lv_supportedProtocols_6_0= ruleProtocol
            {

            					newCompositeNode(grammarAccess.getWirelessModuleAccess().getSupportedProtocolsProtocolEnumRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_supportedProtocols_6_0=ruleProtocol();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWirelessModuleRule());
            					}
            					add(
            						current,
            						"supportedProtocols",
            						lv_supportedProtocols_6_0,
            						"at.ac.tuwien.big.Cpsml.Protocol");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCpsml.g:1900:3: (otherlv_7= ',' ( (lv_supportedProtocols_8_0= ruleProtocol ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==16) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalCpsml.g:1901:4: otherlv_7= ',' ( (lv_supportedProtocols_8_0= ruleProtocol ) )
            	    {
            	    otherlv_7=(Token)match(input,16,FOLLOW_37); 

            	    				newLeafNode(otherlv_7, grammarAccess.getWirelessModuleAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalCpsml.g:1905:4: ( (lv_supportedProtocols_8_0= ruleProtocol ) )
            	    // InternalCpsml.g:1906:5: (lv_supportedProtocols_8_0= ruleProtocol )
            	    {
            	    // InternalCpsml.g:1906:5: (lv_supportedProtocols_8_0= ruleProtocol )
            	    // InternalCpsml.g:1907:6: lv_supportedProtocols_8_0= ruleProtocol
            	    {

            	    						newCompositeNode(grammarAccess.getWirelessModuleAccess().getSupportedProtocolsProtocolEnumRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_supportedProtocols_8_0=ruleProtocol();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getWirelessModuleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"supportedProtocols",
            	    							lv_supportedProtocols_8_0,
            	    							"at.ac.tuwien.big.Cpsml.Protocol");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            otherlv_9=(Token)match(input,17,FOLLOW_41); 

            			newLeafNode(otherlv_9, grammarAccess.getWirelessModuleAccess().getRightSquareBracketKeyword_8());
            		
            otherlv_10=(Token)match(input,45,FOLLOW_6); 

            			newLeafNode(otherlv_10, grammarAccess.getWirelessModuleAccess().getRangeKeyword_9());
            		
            otherlv_11=(Token)match(input,14,FOLLOW_26); 

            			newLeafNode(otherlv_11, grammarAccess.getWirelessModuleAccess().getColonKeyword_10());
            		
            // InternalCpsml.g:1937:3: ( (lv_range_12_0= ruleEFloat ) )
            // InternalCpsml.g:1938:4: (lv_range_12_0= ruleEFloat )
            {
            // InternalCpsml.g:1938:4: (lv_range_12_0= ruleEFloat )
            // InternalCpsml.g:1939:5: lv_range_12_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getWirelessModuleAccess().getRangeEFloatParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_38);
            lv_range_12_0=ruleEFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWirelessModuleRule());
            					}
            					set(
            						current,
            						"range",
            						lv_range_12_0,
            						"at.ac.tuwien.big.Cpsml.EFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCpsml.g:1956:3: (otherlv_13= 'connect' otherlv_14= '->' otherlv_15= '[' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ']' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==41) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalCpsml.g:1957:4: otherlv_13= 'connect' otherlv_14= '->' otherlv_15= '[' ( ( ruleEString ) ) (otherlv_17= ',' ( ( ruleEString ) ) )* otherlv_19= ']'
                    {
                    otherlv_13=(Token)match(input,41,FOLLOW_39); 

                    				newLeafNode(otherlv_13, grammarAccess.getWirelessModuleAccess().getConnectKeyword_12_0());
                    			
                    otherlv_14=(Token)match(input,42,FOLLOW_7); 

                    				newLeafNode(otherlv_14, grammarAccess.getWirelessModuleAccess().getHyphenMinusGreaterThanSignKeyword_12_1());
                    			
                    otherlv_15=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getWirelessModuleAccess().getLeftSquareBracketKeyword_12_2());
                    			
                    // InternalCpsml.g:1969:4: ( ( ruleEString ) )
                    // InternalCpsml.g:1970:5: ( ruleEString )
                    {
                    // InternalCpsml.g:1970:5: ( ruleEString )
                    // InternalCpsml.g:1971:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWirelessModuleRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getWirelessModuleAccess().getConnectWirelessModuleCrossReference_12_3_0());
                    					
                    pushFollow(FOLLOW_8);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCpsml.g:1985:4: (otherlv_17= ',' ( ( ruleEString ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==16) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalCpsml.g:1986:5: otherlv_17= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_17=(Token)match(input,16,FOLLOW_3); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getWirelessModuleAccess().getCommaKeyword_12_4_0());
                    	    				
                    	    // InternalCpsml.g:1990:5: ( ( ruleEString ) )
                    	    // InternalCpsml.g:1991:6: ( ruleEString )
                    	    {
                    	    // InternalCpsml.g:1991:6: ( ruleEString )
                    	    // InternalCpsml.g:1992:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getWirelessModuleRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getWirelessModuleAccess().getConnectWirelessModuleCrossReference_12_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,17,FOLLOW_40); 

                    				newLeafNode(otherlv_19, grammarAccess.getWirelessModuleAccess().getRightSquareBracketKeyword_12_5());
                    			

                    }
                    break;

            }

            // InternalCpsml.g:2012:3: (otherlv_20= 'connectOpposite' otherlv_21= '->' otherlv_22= '[' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ']' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==43) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalCpsml.g:2013:4: otherlv_20= 'connectOpposite' otherlv_21= '->' otherlv_22= '[' ( ( ruleEString ) ) (otherlv_24= ',' ( ( ruleEString ) ) )* otherlv_26= ']'
                    {
                    otherlv_20=(Token)match(input,43,FOLLOW_39); 

                    				newLeafNode(otherlv_20, grammarAccess.getWirelessModuleAccess().getConnectOppositeKeyword_13_0());
                    			
                    otherlv_21=(Token)match(input,42,FOLLOW_7); 

                    				newLeafNode(otherlv_21, grammarAccess.getWirelessModuleAccess().getHyphenMinusGreaterThanSignKeyword_13_1());
                    			
                    otherlv_22=(Token)match(input,15,FOLLOW_3); 

                    				newLeafNode(otherlv_22, grammarAccess.getWirelessModuleAccess().getLeftSquareBracketKeyword_13_2());
                    			
                    // InternalCpsml.g:2025:4: ( ( ruleEString ) )
                    // InternalCpsml.g:2026:5: ( ruleEString )
                    {
                    // InternalCpsml.g:2026:5: ( ruleEString )
                    // InternalCpsml.g:2027:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWirelessModuleRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getWirelessModuleAccess().getConnectOppositeWirelessModuleCrossReference_13_3_0());
                    					
                    pushFollow(FOLLOW_8);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCpsml.g:2041:4: (otherlv_24= ',' ( ( ruleEString ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==16) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // InternalCpsml.g:2042:5: otherlv_24= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_24=(Token)match(input,16,FOLLOW_3); 

                    	    					newLeafNode(otherlv_24, grammarAccess.getWirelessModuleAccess().getCommaKeyword_13_4_0());
                    	    				
                    	    // InternalCpsml.g:2046:5: ( ( ruleEString ) )
                    	    // InternalCpsml.g:2047:6: ( ruleEString )
                    	    {
                    	    // InternalCpsml.g:2047:6: ( ruleEString )
                    	    // InternalCpsml.g:2048:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getWirelessModuleRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getWirelessModuleAccess().getConnectOppositeWirelessModuleCrossReference_13_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_26=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_26, grammarAccess.getWirelessModuleAccess().getRightSquareBracketKeyword_13_5());
                    			

                    }
                    break;

            }

            otherlv_27=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_27, grammarAccess.getWirelessModuleAccess().getRightCurlyBracketKeyword_14());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWirelessModule"


    // $ANTLR start "entryRuleController"
    // InternalCpsml.g:2076:1: entryRuleController returns [EObject current=null] : iv_ruleController= ruleController EOF ;
    public final EObject entryRuleController() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleController = null;


        try {
            // InternalCpsml.g:2076:51: (iv_ruleController= ruleController EOF )
            // InternalCpsml.g:2077:2: iv_ruleController= ruleController EOF
            {
             newCompositeNode(grammarAccess.getControllerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleController=ruleController();

            state._fsp--;

             current =iv_ruleController; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleController"


    // $ANTLR start "ruleController"
    // InternalCpsml.g:2083:1: ruleController returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= 'topics' otherlv_5= ':' otherlv_6= '[' ( (lv_topics_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_topics_9_0= ruleEString ) ) )* otherlv_10= ']' otherlv_11= 'subscribes' otherlv_12= ':' otherlv_13= '[' ( (lv_subscription_14_0= ruleMessagingLink ) ) (otherlv_15= ',' ( (lv_subscription_16_0= ruleMessagingLink ) ) )* otherlv_17= ']' otherlv_18= 'publishes' otherlv_19= ':' otherlv_20= '[' ( (lv_publication_21_0= ruleMessagingLink ) ) (otherlv_22= ',' ( (lv_publication_23_0= ruleMessagingLink ) ) )* otherlv_24= ']' otherlv_25= '}' ) ;
    public final EObject ruleController() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_description_3_0 = null;

        AntlrDatatypeRuleToken lv_topics_7_0 = null;

        AntlrDatatypeRuleToken lv_topics_9_0 = null;

        EObject lv_subscription_14_0 = null;

        EObject lv_subscription_16_0 = null;

        EObject lv_publication_21_0 = null;

        EObject lv_publication_23_0 = null;



        	enterRule();

        try {
            // InternalCpsml.g:2089:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= 'topics' otherlv_5= ':' otherlv_6= '[' ( (lv_topics_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_topics_9_0= ruleEString ) ) )* otherlv_10= ']' otherlv_11= 'subscribes' otherlv_12= ':' otherlv_13= '[' ( (lv_subscription_14_0= ruleMessagingLink ) ) (otherlv_15= ',' ( (lv_subscription_16_0= ruleMessagingLink ) ) )* otherlv_17= ']' otherlv_18= 'publishes' otherlv_19= ':' otherlv_20= '[' ( (lv_publication_21_0= ruleMessagingLink ) ) (otherlv_22= ',' ( (lv_publication_23_0= ruleMessagingLink ) ) )* otherlv_24= ']' otherlv_25= '}' ) )
            // InternalCpsml.g:2090:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= 'topics' otherlv_5= ':' otherlv_6= '[' ( (lv_topics_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_topics_9_0= ruleEString ) ) )* otherlv_10= ']' otherlv_11= 'subscribes' otherlv_12= ':' otherlv_13= '[' ( (lv_subscription_14_0= ruleMessagingLink ) ) (otherlv_15= ',' ( (lv_subscription_16_0= ruleMessagingLink ) ) )* otherlv_17= ']' otherlv_18= 'publishes' otherlv_19= ':' otherlv_20= '[' ( (lv_publication_21_0= ruleMessagingLink ) ) (otherlv_22= ',' ( (lv_publication_23_0= ruleMessagingLink ) ) )* otherlv_24= ']' otherlv_25= '}' )
            {
            // InternalCpsml.g:2090:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= 'topics' otherlv_5= ':' otherlv_6= '[' ( (lv_topics_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_topics_9_0= ruleEString ) ) )* otherlv_10= ']' otherlv_11= 'subscribes' otherlv_12= ':' otherlv_13= '[' ( (lv_subscription_14_0= ruleMessagingLink ) ) (otherlv_15= ',' ( (lv_subscription_16_0= ruleMessagingLink ) ) )* otherlv_17= ']' otherlv_18= 'publishes' otherlv_19= ':' otherlv_20= '[' ( (lv_publication_21_0= ruleMessagingLink ) ) (otherlv_22= ',' ( (lv_publication_23_0= ruleMessagingLink ) ) )* otherlv_24= ']' otherlv_25= '}' )
            // InternalCpsml.g:2091:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '{' otherlv_2= 'description' ( (lv_description_3_0= ruleEString ) ) otherlv_4= 'topics' otherlv_5= ':' otherlv_6= '[' ( (lv_topics_7_0= ruleEString ) ) (otherlv_8= ',' ( (lv_topics_9_0= ruleEString ) ) )* otherlv_10= ']' otherlv_11= 'subscribes' otherlv_12= ':' otherlv_13= '[' ( (lv_subscription_14_0= ruleMessagingLink ) ) (otherlv_15= ',' ( (lv_subscription_16_0= ruleMessagingLink ) ) )* otherlv_17= ']' otherlv_18= 'publishes' otherlv_19= ':' otherlv_20= '[' ( (lv_publication_21_0= ruleMessagingLink ) ) (otherlv_22= ',' ( (lv_publication_23_0= ruleMessagingLink ) ) )* otherlv_24= ']' otherlv_25= '}'
            {
            // InternalCpsml.g:2091:3: ( (lv_name_0_0= ruleEString ) )
            // InternalCpsml.g:2092:4: (lv_name_0_0= ruleEString )
            {
            // InternalCpsml.g:2092:4: (lv_name_0_0= ruleEString )
            // InternalCpsml.g:2093:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getControllerAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getControllerRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"at.ac.tuwien.big.Cpsml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_42); 

            			newLeafNode(otherlv_1, grammarAccess.getControllerAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getControllerAccess().getDescriptionKeyword_2());
            		
            // InternalCpsml.g:2118:3: ( (lv_description_3_0= ruleEString ) )
            // InternalCpsml.g:2119:4: (lv_description_3_0= ruleEString )
            {
            // InternalCpsml.g:2119:4: (lv_description_3_0= ruleEString )
            // InternalCpsml.g:2120:5: lv_description_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getControllerAccess().getDescriptionEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_35);
            lv_description_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getControllerRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_3_0,
            						"at.ac.tuwien.big.Cpsml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,38,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getControllerAccess().getTopicsKeyword_4());
            		
            otherlv_5=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getControllerAccess().getColonKeyword_5());
            		
            otherlv_6=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getControllerAccess().getLeftSquareBracketKeyword_6());
            		
            // InternalCpsml.g:2149:3: ( (lv_topics_7_0= ruleEString ) )
            // InternalCpsml.g:2150:4: (lv_topics_7_0= ruleEString )
            {
            // InternalCpsml.g:2150:4: (lv_topics_7_0= ruleEString )
            // InternalCpsml.g:2151:5: lv_topics_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getControllerAccess().getTopicsEStringParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_8);
            lv_topics_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getControllerRule());
            					}
            					add(
            						current,
            						"topics",
            						lv_topics_7_0,
            						"at.ac.tuwien.big.Cpsml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCpsml.g:2168:3: (otherlv_8= ',' ( (lv_topics_9_0= ruleEString ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==16) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalCpsml.g:2169:4: otherlv_8= ',' ( (lv_topics_9_0= ruleEString ) )
            	    {
            	    otherlv_8=(Token)match(input,16,FOLLOW_3); 

            	    				newLeafNode(otherlv_8, grammarAccess.getControllerAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalCpsml.g:2173:4: ( (lv_topics_9_0= ruleEString ) )
            	    // InternalCpsml.g:2174:5: (lv_topics_9_0= ruleEString )
            	    {
            	    // InternalCpsml.g:2174:5: (lv_topics_9_0= ruleEString )
            	    // InternalCpsml.g:2175:6: lv_topics_9_0= ruleEString
            	    {

            	    						newCompositeNode(grammarAccess.getControllerAccess().getTopicsEStringParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_topics_9_0=ruleEString();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getControllerRule());
            	    						}
            	    						add(
            	    							current,
            	    							"topics",
            	    							lv_topics_9_0,
            	    							"at.ac.tuwien.big.Cpsml.EString");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            otherlv_10=(Token)match(input,17,FOLLOW_43); 

            			newLeafNode(otherlv_10, grammarAccess.getControllerAccess().getRightSquareBracketKeyword_9());
            		
            otherlv_11=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_11, grammarAccess.getControllerAccess().getSubscribesKeyword_10());
            		
            otherlv_12=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_12, grammarAccess.getControllerAccess().getColonKeyword_11());
            		
            otherlv_13=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_13, grammarAccess.getControllerAccess().getLeftSquareBracketKeyword_12());
            		
            // InternalCpsml.g:2209:3: ( (lv_subscription_14_0= ruleMessagingLink ) )
            // InternalCpsml.g:2210:4: (lv_subscription_14_0= ruleMessagingLink )
            {
            // InternalCpsml.g:2210:4: (lv_subscription_14_0= ruleMessagingLink )
            // InternalCpsml.g:2211:5: lv_subscription_14_0= ruleMessagingLink
            {

            					newCompositeNode(grammarAccess.getControllerAccess().getSubscriptionMessagingLinkParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_8);
            lv_subscription_14_0=ruleMessagingLink();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getControllerRule());
            					}
            					add(
            						current,
            						"subscription",
            						lv_subscription_14_0,
            						"at.ac.tuwien.big.Cpsml.MessagingLink");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCpsml.g:2228:3: (otherlv_15= ',' ( (lv_subscription_16_0= ruleMessagingLink ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==16) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalCpsml.g:2229:4: otherlv_15= ',' ( (lv_subscription_16_0= ruleMessagingLink ) )
            	    {
            	    otherlv_15=(Token)match(input,16,FOLLOW_4); 

            	    				newLeafNode(otherlv_15, grammarAccess.getControllerAccess().getCommaKeyword_14_0());
            	    			
            	    // InternalCpsml.g:2233:4: ( (lv_subscription_16_0= ruleMessagingLink ) )
            	    // InternalCpsml.g:2234:5: (lv_subscription_16_0= ruleMessagingLink )
            	    {
            	    // InternalCpsml.g:2234:5: (lv_subscription_16_0= ruleMessagingLink )
            	    // InternalCpsml.g:2235:6: lv_subscription_16_0= ruleMessagingLink
            	    {

            	    						newCompositeNode(grammarAccess.getControllerAccess().getSubscriptionMessagingLinkParserRuleCall_14_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_subscription_16_0=ruleMessagingLink();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getControllerRule());
            	    						}
            	    						add(
            	    							current,
            	    							"subscription",
            	    							lv_subscription_16_0,
            	    							"at.ac.tuwien.big.Cpsml.MessagingLink");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            otherlv_17=(Token)match(input,17,FOLLOW_44); 

            			newLeafNode(otherlv_17, grammarAccess.getControllerAccess().getRightSquareBracketKeyword_15());
            		
            otherlv_18=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_18, grammarAccess.getControllerAccess().getPublishesKeyword_16());
            		
            otherlv_19=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_19, grammarAccess.getControllerAccess().getColonKeyword_17());
            		
            otherlv_20=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_20, grammarAccess.getControllerAccess().getLeftSquareBracketKeyword_18());
            		
            // InternalCpsml.g:2269:3: ( (lv_publication_21_0= ruleMessagingLink ) )
            // InternalCpsml.g:2270:4: (lv_publication_21_0= ruleMessagingLink )
            {
            // InternalCpsml.g:2270:4: (lv_publication_21_0= ruleMessagingLink )
            // InternalCpsml.g:2271:5: lv_publication_21_0= ruleMessagingLink
            {

            					newCompositeNode(grammarAccess.getControllerAccess().getPublicationMessagingLinkParserRuleCall_19_0());
            				
            pushFollow(FOLLOW_8);
            lv_publication_21_0=ruleMessagingLink();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getControllerRule());
            					}
            					add(
            						current,
            						"publication",
            						lv_publication_21_0,
            						"at.ac.tuwien.big.Cpsml.MessagingLink");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCpsml.g:2288:3: (otherlv_22= ',' ( (lv_publication_23_0= ruleMessagingLink ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==16) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalCpsml.g:2289:4: otherlv_22= ',' ( (lv_publication_23_0= ruleMessagingLink ) )
            	    {
            	    otherlv_22=(Token)match(input,16,FOLLOW_4); 

            	    				newLeafNode(otherlv_22, grammarAccess.getControllerAccess().getCommaKeyword_20_0());
            	    			
            	    // InternalCpsml.g:2293:4: ( (lv_publication_23_0= ruleMessagingLink ) )
            	    // InternalCpsml.g:2294:5: (lv_publication_23_0= ruleMessagingLink )
            	    {
            	    // InternalCpsml.g:2294:5: (lv_publication_23_0= ruleMessagingLink )
            	    // InternalCpsml.g:2295:6: lv_publication_23_0= ruleMessagingLink
            	    {

            	    						newCompositeNode(grammarAccess.getControllerAccess().getPublicationMessagingLinkParserRuleCall_20_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_publication_23_0=ruleMessagingLink();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getControllerRule());
            	    						}
            	    						add(
            	    							current,
            	    							"publication",
            	    							lv_publication_23_0,
            	    							"at.ac.tuwien.big.Cpsml.MessagingLink");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            otherlv_24=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_24, grammarAccess.getControllerAccess().getRightSquareBracketKeyword_21());
            		
            otherlv_25=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getControllerAccess().getRightCurlyBracketKeyword_22());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleController"


    // $ANTLR start "entryRuleMessagingLink"
    // InternalCpsml.g:2325:1: entryRuleMessagingLink returns [EObject current=null] : iv_ruleMessagingLink= ruleMessagingLink EOF ;
    public final EObject entryRuleMessagingLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMessagingLink = null;


        try {
            // InternalCpsml.g:2325:54: (iv_ruleMessagingLink= ruleMessagingLink EOF )
            // InternalCpsml.g:2326:2: iv_ruleMessagingLink= ruleMessagingLink EOF
            {
             newCompositeNode(grammarAccess.getMessagingLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMessagingLink=ruleMessagingLink();

            state._fsp--;

             current =iv_ruleMessagingLink; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMessagingLink"


    // $ANTLR start "ruleMessagingLink"
    // InternalCpsml.g:2332:1: ruleMessagingLink returns [EObject current=null] : (otherlv_0= '{' (otherlv_1= 'topics' otherlv_2= ':' )? otherlv_3= '[' ( (lv_topics_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_topics_6_0= ruleEString ) ) )* otherlv_7= ']' (otherlv_8= 'messageBroker' )? ( ( ruleEString ) ) otherlv_10= '}' ) ;
    public final EObject ruleMessagingLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_topics_4_0 = null;

        AntlrDatatypeRuleToken lv_topics_6_0 = null;



        	enterRule();

        try {
            // InternalCpsml.g:2338:2: ( (otherlv_0= '{' (otherlv_1= 'topics' otherlv_2= ':' )? otherlv_3= '[' ( (lv_topics_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_topics_6_0= ruleEString ) ) )* otherlv_7= ']' (otherlv_8= 'messageBroker' )? ( ( ruleEString ) ) otherlv_10= '}' ) )
            // InternalCpsml.g:2339:2: (otherlv_0= '{' (otherlv_1= 'topics' otherlv_2= ':' )? otherlv_3= '[' ( (lv_topics_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_topics_6_0= ruleEString ) ) )* otherlv_7= ']' (otherlv_8= 'messageBroker' )? ( ( ruleEString ) ) otherlv_10= '}' )
            {
            // InternalCpsml.g:2339:2: (otherlv_0= '{' (otherlv_1= 'topics' otherlv_2= ':' )? otherlv_3= '[' ( (lv_topics_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_topics_6_0= ruleEString ) ) )* otherlv_7= ']' (otherlv_8= 'messageBroker' )? ( ( ruleEString ) ) otherlv_10= '}' )
            // InternalCpsml.g:2340:3: otherlv_0= '{' (otherlv_1= 'topics' otherlv_2= ':' )? otherlv_3= '[' ( (lv_topics_4_0= ruleEString ) ) (otherlv_5= ',' ( (lv_topics_6_0= ruleEString ) ) )* otherlv_7= ']' (otherlv_8= 'messageBroker' )? ( ( ruleEString ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_45); 

            			newLeafNode(otherlv_0, grammarAccess.getMessagingLinkAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalCpsml.g:2344:3: (otherlv_1= 'topics' otherlv_2= ':' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==38) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalCpsml.g:2345:4: otherlv_1= 'topics' otherlv_2= ':'
                    {
                    otherlv_1=(Token)match(input,38,FOLLOW_6); 

                    				newLeafNode(otherlv_1, grammarAccess.getMessagingLinkAccess().getTopicsKeyword_1_0());
                    			
                    otherlv_2=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getMessagingLinkAccess().getColonKeyword_1_1());
                    			

                    }
                    break;

            }

            otherlv_3=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getMessagingLinkAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalCpsml.g:2358:3: ( (lv_topics_4_0= ruleEString ) )
            // InternalCpsml.g:2359:4: (lv_topics_4_0= ruleEString )
            {
            // InternalCpsml.g:2359:4: (lv_topics_4_0= ruleEString )
            // InternalCpsml.g:2360:5: lv_topics_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMessagingLinkAccess().getTopicsEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_topics_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMessagingLinkRule());
            					}
            					add(
            						current,
            						"topics",
            						lv_topics_4_0,
            						"at.ac.tuwien.big.Cpsml.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCpsml.g:2377:3: (otherlv_5= ',' ( (lv_topics_6_0= ruleEString ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==16) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalCpsml.g:2378:4: otherlv_5= ',' ( (lv_topics_6_0= ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_3); 

            	    				newLeafNode(otherlv_5, grammarAccess.getMessagingLinkAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalCpsml.g:2382:4: ( (lv_topics_6_0= ruleEString ) )
            	    // InternalCpsml.g:2383:5: (lv_topics_6_0= ruleEString )
            	    {
            	    // InternalCpsml.g:2383:5: (lv_topics_6_0= ruleEString )
            	    // InternalCpsml.g:2384:6: lv_topics_6_0= ruleEString
            	    {

            	    						newCompositeNode(grammarAccess.getMessagingLinkAccess().getTopicsEStringParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_topics_6_0=ruleEString();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMessagingLinkRule());
            	    						}
            	    						add(
            	    							current,
            	    							"topics",
            	    							lv_topics_6_0,
            	    							"at.ac.tuwien.big.Cpsml.EString");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            otherlv_7=(Token)match(input,17,FOLLOW_46); 

            			newLeafNode(otherlv_7, grammarAccess.getMessagingLinkAccess().getRightSquareBracketKeyword_5());
            		
            // InternalCpsml.g:2406:3: (otherlv_8= 'messageBroker' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==47) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalCpsml.g:2407:4: otherlv_8= 'messageBroker'
                    {
                    otherlv_8=(Token)match(input,47,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getMessagingLinkAccess().getMessageBrokerKeyword_6());
                    			

                    }
                    break;

            }

            // InternalCpsml.g:2412:3: ( ( ruleEString ) )
            // InternalCpsml.g:2413:4: ( ruleEString )
            {
            // InternalCpsml.g:2413:4: ( ruleEString )
            // InternalCpsml.g:2414:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMessagingLinkRule());
            					}
            				

            					newCompositeNode(grammarAccess.getMessagingLinkAccess().getMessageBrokerMessageBrokerCrossReference_7_0());
            				
            pushFollow(FOLLOW_11);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getMessagingLinkAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMessagingLink"


    // $ANTLR start "entryRulePosition"
    // InternalCpsml.g:2436:1: entryRulePosition returns [EObject current=null] : iv_rulePosition= rulePosition EOF ;
    public final EObject entryRulePosition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePosition = null;


        try {
            // InternalCpsml.g:2436:49: (iv_rulePosition= rulePosition EOF )
            // InternalCpsml.g:2437:2: iv_rulePosition= rulePosition EOF
            {
             newCompositeNode(grammarAccess.getPositionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePosition=rulePosition();

            state._fsp--;

             current =iv_rulePosition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePosition"


    // $ANTLR start "rulePosition"
    // InternalCpsml.g:2443:1: rulePosition returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'x' otherlv_2= ':' ( (lv_x_3_0= ruleEFloat ) ) otherlv_4= 'y' otherlv_5= ':' ( (lv_y_6_0= ruleEFloat ) ) otherlv_7= 'z' otherlv_8= ':' ( (lv_z_9_0= ruleEFloat ) ) otherlv_10= '}' ) ;
    public final EObject rulePosition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_x_3_0 = null;

        AntlrDatatypeRuleToken lv_y_6_0 = null;

        AntlrDatatypeRuleToken lv_z_9_0 = null;



        	enterRule();

        try {
            // InternalCpsml.g:2449:2: ( (otherlv_0= '{' otherlv_1= 'x' otherlv_2= ':' ( (lv_x_3_0= ruleEFloat ) ) otherlv_4= 'y' otherlv_5= ':' ( (lv_y_6_0= ruleEFloat ) ) otherlv_7= 'z' otherlv_8= ':' ( (lv_z_9_0= ruleEFloat ) ) otherlv_10= '}' ) )
            // InternalCpsml.g:2450:2: (otherlv_0= '{' otherlv_1= 'x' otherlv_2= ':' ( (lv_x_3_0= ruleEFloat ) ) otherlv_4= 'y' otherlv_5= ':' ( (lv_y_6_0= ruleEFloat ) ) otherlv_7= 'z' otherlv_8= ':' ( (lv_z_9_0= ruleEFloat ) ) otherlv_10= '}' )
            {
            // InternalCpsml.g:2450:2: (otherlv_0= '{' otherlv_1= 'x' otherlv_2= ':' ( (lv_x_3_0= ruleEFloat ) ) otherlv_4= 'y' otherlv_5= ':' ( (lv_y_6_0= ruleEFloat ) ) otherlv_7= 'z' otherlv_8= ':' ( (lv_z_9_0= ruleEFloat ) ) otherlv_10= '}' )
            // InternalCpsml.g:2451:3: otherlv_0= '{' otherlv_1= 'x' otherlv_2= ':' ( (lv_x_3_0= ruleEFloat ) ) otherlv_4= 'y' otherlv_5= ':' ( (lv_y_6_0= ruleEFloat ) ) otherlv_7= 'z' otherlv_8= ':' ( (lv_z_9_0= ruleEFloat ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_47); 

            			newLeafNode(otherlv_0, grammarAccess.getPositionAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,48,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getPositionAccess().getXKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getPositionAccess().getColonKeyword_2());
            		
            // InternalCpsml.g:2463:3: ( (lv_x_3_0= ruleEFloat ) )
            // InternalCpsml.g:2464:4: (lv_x_3_0= ruleEFloat )
            {
            // InternalCpsml.g:2464:4: (lv_x_3_0= ruleEFloat )
            // InternalCpsml.g:2465:5: lv_x_3_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getPositionAccess().getXEFloatParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_48);
            lv_x_3_0=ruleEFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPositionRule());
            					}
            					set(
            						current,
            						"x",
            						lv_x_3_0,
            						"at.ac.tuwien.big.Cpsml.EFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,49,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getPositionAccess().getYKeyword_4());
            		
            otherlv_5=(Token)match(input,14,FOLLOW_26); 

            			newLeafNode(otherlv_5, grammarAccess.getPositionAccess().getColonKeyword_5());
            		
            // InternalCpsml.g:2490:3: ( (lv_y_6_0= ruleEFloat ) )
            // InternalCpsml.g:2491:4: (lv_y_6_0= ruleEFloat )
            {
            // InternalCpsml.g:2491:4: (lv_y_6_0= ruleEFloat )
            // InternalCpsml.g:2492:5: lv_y_6_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getPositionAccess().getYEFloatParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_49);
            lv_y_6_0=ruleEFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPositionRule());
            					}
            					set(
            						current,
            						"y",
            						lv_y_6_0,
            						"at.ac.tuwien.big.Cpsml.EFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,50,FOLLOW_6); 

            			newLeafNode(otherlv_7, grammarAccess.getPositionAccess().getZKeyword_7());
            		
            otherlv_8=(Token)match(input,14,FOLLOW_26); 

            			newLeafNode(otherlv_8, grammarAccess.getPositionAccess().getColonKeyword_8());
            		
            // InternalCpsml.g:2517:3: ( (lv_z_9_0= ruleEFloat ) )
            // InternalCpsml.g:2518:4: (lv_z_9_0= ruleEFloat )
            {
            // InternalCpsml.g:2518:4: (lv_z_9_0= ruleEFloat )
            // InternalCpsml.g:2519:5: lv_z_9_0= ruleEFloat
            {

            					newCompositeNode(grammarAccess.getPositionAccess().getZEFloatParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_11);
            lv_z_9_0=ruleEFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPositionRule());
            					}
            					set(
            						current,
            						"z",
            						lv_z_9_0,
            						"at.ac.tuwien.big.Cpsml.EFloat");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getPositionAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePosition"


    // $ANTLR start "entryRuleEString"
    // InternalCpsml.g:2544:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalCpsml.g:2544:47: (iv_ruleEString= ruleEString EOF )
            // InternalCpsml.g:2545:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalCpsml.g:2551:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalCpsml.g:2557:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalCpsml.g:2558:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalCpsml.g:2558:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_STRING) ) {
                alt39=1;
            }
            else if ( (LA39_0==RULE_ID) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalCpsml.g:2559:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCpsml.g:2567:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEFloat"
    // InternalCpsml.g:2578:1: entryRuleEFloat returns [String current=null] : iv_ruleEFloat= ruleEFloat EOF ;
    public final String entryRuleEFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFloat = null;


        try {
            // InternalCpsml.g:2578:46: (iv_ruleEFloat= ruleEFloat EOF )
            // InternalCpsml.g:2579:2: iv_ruleEFloat= ruleEFloat EOF
            {
             newCompositeNode(grammarAccess.getEFloatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEFloat=ruleEFloat();

            state._fsp--;

             current =iv_ruleEFloat.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEFloat"


    // $ANTLR start "ruleEFloat"
    // InternalCpsml.g:2585:1: ruleEFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalCpsml.g:2591:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalCpsml.g:2592:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalCpsml.g:2592:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalCpsml.g:2593:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalCpsml.g:2593:3: (kw= '-' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==51) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalCpsml.g:2594:4: kw= '-'
                    {
                    kw=(Token)match(input,51,FOLLOW_50); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalCpsml.g:2600:3: (this_INT_1= RULE_INT )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_INT) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalCpsml.g:2601:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_51); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,52,FOLLOW_52); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEFloatAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_53); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_3());
            		
            // InternalCpsml.g:2621:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=53 && LA44_0<=54)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalCpsml.g:2622:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalCpsml.g:2622:4: (kw= 'E' | kw= 'e' )
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==53) ) {
                        alt42=1;
                    }
                    else if ( (LA42_0==54) ) {
                        alt42=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 0, input);

                        throw nvae;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalCpsml.g:2623:5: kw= 'E'
                            {
                            kw=(Token)match(input,53,FOLLOW_28); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalCpsml.g:2629:5: kw= 'e'
                            {
                            kw=(Token)match(input,54,FOLLOW_28); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalCpsml.g:2635:4: (kw= '-' )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==51) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalCpsml.g:2636:5: kw= '-'
                            {
                            kw=(Token)match(input,51,FOLLOW_52); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEFloatAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEFloatAccess().getINTTerminalRuleCall_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEFloat"


    // $ANTLR start "entryRuleEInt"
    // InternalCpsml.g:2654:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalCpsml.g:2654:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalCpsml.g:2655:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalCpsml.g:2661:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalCpsml.g:2667:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalCpsml.g:2668:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalCpsml.g:2668:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalCpsml.g:2669:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalCpsml.g:2669:3: (kw= '-' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==51) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalCpsml.g:2670:4: kw= '-'
                    {
                    kw=(Token)match(input,51,FOLLOW_52); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleDataType"
    // InternalCpsml.g:2687:1: ruleDataType returns [Enumerator current=null] : ( (enumLiteral_0= 'NULL' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'INT' ) | (enumLiteral_3= 'STRING' ) ) ;
    public final Enumerator ruleDataType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalCpsml.g:2693:2: ( ( (enumLiteral_0= 'NULL' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'INT' ) | (enumLiteral_3= 'STRING' ) ) )
            // InternalCpsml.g:2694:2: ( (enumLiteral_0= 'NULL' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'INT' ) | (enumLiteral_3= 'STRING' ) )
            {
            // InternalCpsml.g:2694:2: ( (enumLiteral_0= 'NULL' ) | (enumLiteral_1= 'BOOLEAN' ) | (enumLiteral_2= 'INT' ) | (enumLiteral_3= 'STRING' ) )
            int alt46=4;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt46=1;
                }
                break;
            case 56:
                {
                alt46=2;
                }
                break;
            case 57:
                {
                alt46=3;
                }
                break;
            case 58:
                {
                alt46=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalCpsml.g:2695:3: (enumLiteral_0= 'NULL' )
                    {
                    // InternalCpsml.g:2695:3: (enumLiteral_0= 'NULL' )
                    // InternalCpsml.g:2696:4: enumLiteral_0= 'NULL'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getNULLEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDataTypeAccess().getNULLEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCpsml.g:2703:3: (enumLiteral_1= 'BOOLEAN' )
                    {
                    // InternalCpsml.g:2703:3: (enumLiteral_1= 'BOOLEAN' )
                    // InternalCpsml.g:2704:4: enumLiteral_1= 'BOOLEAN'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDataTypeAccess().getBOOLEANEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCpsml.g:2711:3: (enumLiteral_2= 'INT' )
                    {
                    // InternalCpsml.g:2711:3: (enumLiteral_2= 'INT' )
                    // InternalCpsml.g:2712:4: enumLiteral_2= 'INT'
                    {
                    enumLiteral_2=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDataTypeAccess().getINTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalCpsml.g:2719:3: (enumLiteral_3= 'STRING' )
                    {
                    // InternalCpsml.g:2719:3: (enumLiteral_3= 'STRING' )
                    // InternalCpsml.g:2720:4: enumLiteral_3= 'STRING'
                    {
                    enumLiteral_3=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDataTypeAccess().getSTRINGEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "ruleStatus"
    // InternalCpsml.g:2730:1: ruleStatus returns [Enumerator current=null] : ( (enumLiteral_0= 'GOOD' ) | (enumLiteral_1= 'WARNING' ) | (enumLiteral_2= 'CRITICAL' ) ) ;
    public final Enumerator ruleStatus() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalCpsml.g:2736:2: ( ( (enumLiteral_0= 'GOOD' ) | (enumLiteral_1= 'WARNING' ) | (enumLiteral_2= 'CRITICAL' ) ) )
            // InternalCpsml.g:2737:2: ( (enumLiteral_0= 'GOOD' ) | (enumLiteral_1= 'WARNING' ) | (enumLiteral_2= 'CRITICAL' ) )
            {
            // InternalCpsml.g:2737:2: ( (enumLiteral_0= 'GOOD' ) | (enumLiteral_1= 'WARNING' ) | (enumLiteral_2= 'CRITICAL' ) )
            int alt47=3;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt47=1;
                }
                break;
            case 60:
                {
                alt47=2;
                }
                break;
            case 61:
                {
                alt47=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalCpsml.g:2738:3: (enumLiteral_0= 'GOOD' )
                    {
                    // InternalCpsml.g:2738:3: (enumLiteral_0= 'GOOD' )
                    // InternalCpsml.g:2739:4: enumLiteral_0= 'GOOD'
                    {
                    enumLiteral_0=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getStatusAccess().getGOODEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getStatusAccess().getGOODEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCpsml.g:2746:3: (enumLiteral_1= 'WARNING' )
                    {
                    // InternalCpsml.g:2746:3: (enumLiteral_1= 'WARNING' )
                    // InternalCpsml.g:2747:4: enumLiteral_1= 'WARNING'
                    {
                    enumLiteral_1=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getStatusAccess().getWARNINGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getStatusAccess().getWARNINGEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCpsml.g:2754:3: (enumLiteral_2= 'CRITICAL' )
                    {
                    // InternalCpsml.g:2754:3: (enumLiteral_2= 'CRITICAL' )
                    // InternalCpsml.g:2755:4: enumLiteral_2= 'CRITICAL'
                    {
                    enumLiteral_2=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getStatusAccess().getCRITICALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getStatusAccess().getCRITICALEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatus"


    // $ANTLR start "ruleProtocol"
    // InternalCpsml.g:2765:1: ruleProtocol returns [Enumerator current=null] : ( (enumLiteral_0= 'DDS' ) | (enumLiteral_1= 'MQTT' ) | (enumLiteral_2= 'SMQTT' ) ) ;
    public final Enumerator ruleProtocol() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalCpsml.g:2771:2: ( ( (enumLiteral_0= 'DDS' ) | (enumLiteral_1= 'MQTT' ) | (enumLiteral_2= 'SMQTT' ) ) )
            // InternalCpsml.g:2772:2: ( (enumLiteral_0= 'DDS' ) | (enumLiteral_1= 'MQTT' ) | (enumLiteral_2= 'SMQTT' ) )
            {
            // InternalCpsml.g:2772:2: ( (enumLiteral_0= 'DDS' ) | (enumLiteral_1= 'MQTT' ) | (enumLiteral_2= 'SMQTT' ) )
            int alt48=3;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt48=1;
                }
                break;
            case 63:
                {
                alt48=2;
                }
                break;
            case 64:
                {
                alt48=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // InternalCpsml.g:2773:3: (enumLiteral_0= 'DDS' )
                    {
                    // InternalCpsml.g:2773:3: (enumLiteral_0= 'DDS' )
                    // InternalCpsml.g:2774:4: enumLiteral_0= 'DDS'
                    {
                    enumLiteral_0=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getProtocolAccess().getDDSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getProtocolAccess().getDDSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCpsml.g:2781:3: (enumLiteral_1= 'MQTT' )
                    {
                    // InternalCpsml.g:2781:3: (enumLiteral_1= 'MQTT' )
                    // InternalCpsml.g:2782:4: enumLiteral_1= 'MQTT'
                    {
                    enumLiteral_1=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getProtocolAccess().getMQTTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getProtocolAccess().getMQTTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalCpsml.g:2789:3: (enumLiteral_2= 'SMQTT' )
                    {
                    // InternalCpsml.g:2789:3: (enumLiteral_2= 'SMQTT' )
                    // InternalCpsml.g:2790:4: enumLiteral_2= 'SMQTT'
                    {
                    enumLiteral_2=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getProtocolAccess().getSMQTTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getProtocolAccess().getSMQTTEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProtocol"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x3800000000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000110000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000108000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000C100000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008100000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0780000000000030L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080100000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0018000000000040L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000640000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0008000000000040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000440000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0780002000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000010000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0780000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0xC000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00000A0000100000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000080000100000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000004000008000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000800000000030L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0010000000000040L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0060000000000002L});

}