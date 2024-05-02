<?xml version="1.0" encoding="ASCII"?>
<cpsml:CPS xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:cpsml="http://big.tuwien.ac.at/cpsml" xsi:schemaLocation="http://big.tuwien.ac.at/cpsml ../../cpsml/model/cpsml.ecore" name="production">
  <environment name="ProductionFloor">
    <node name="3dPrinter" status="CRITICAL">
      <connectionModule xsi:type="cpsml:WirelessModule" name="3DPRINTER_WL" connect="//@messageBroker.0/@connectionModule.1" range="10.0">
        <supportedProtocols>DDS</supportedProtocols>
        <supportedProtocols>MQTT</supportedProtocols>
      </connectionModule>
      <connectionModule xsi:type="cpsml:WiredModule" name="3DPRINTER_W" connect="//@messageBroker.0/@connectionModule.0">
        <supportedProtocols>MQTT</supportedProtocols>
        <supportedProtocols>SMQTT</supportedProtocols>
      </connectionModule>
      <position/>
      <component xsi:type="cpsml:Actuator" name="HeatedPrintBed" status="CRITICAL" topic="temp">
        <function name="setTemperature">
          <parameter name="temperature" dataType="INT"/>
        </function>
      </component>
      <component xsi:type="cpsml:Actuator" name="Extrudor" topic="production">
        <function name="startPrint"/>
        <function name="getRemainingPrintDuration" returnDataType="INT" hasReturn="true"/>
      </component>
    </node>
    <node name="Robot">
      <connectionModule xsi:type="cpsml:WirelessModule" name="ROBOT" connect="//@messageBroker.0/@connectionModule.1" range="3.0">
        <supportedProtocols>DDS</supportedProtocols>
      </connectionModule>
      <position x="2.0" y="2.0" z="1.0"/>
      <component xsi:type="cpsml:Actuator" name="RoboticArm" topic="logistics">
        <function name="toast">
          <parameter name="duration" dataType="INT"/>
        </function>
      </component>
      <component xsi:type="cpsml:Sensor" name="InternalTemperature" topic="temp">
        <function name="getTemperature" returnDataType="INT" hasReturn="true"/>
      </component>
    </node>
  </environment>
  <environment name="ServiceRoom">
    <node name="CentralClimateControl" status="WARNING">
      <connectionModule xsi:type="cpsml:WirelessModule" name="CENTRALCLIMATECONTROL_WL" connectOpposite="//@messageBroker.0/@connectionModule.1" range="10.0">
        <supportedProtocols>DDS</supportedProtocols>
        <supportedProtocols>MQTT</supportedProtocols>
        <supportedProtocols>SMQTT</supportedProtocols>
      </connectionModule>
      <connectionModule xsi:type="cpsml:WiredModule" name="CENTRALCLIMATECONTROL_W">
        <supportedProtocols>DDS</supportedProtocols>
        <supportedProtocols>MQTT</supportedProtocols>
        <supportedProtocols>SMQTT</supportedProtocols>
      </connectionModule>
      <position x="5.0" y="5.0"/>
      <component xsi:type="cpsml:Actuator" name="Fan" status="WARNING" topic="temp" runs="70">
        <function name="turnOn"/>
        <function name="turnOff"/>
      </component>
      <component xsi:type="cpsml:Actuator" name="TemperatureRegulator" topic="temp" ratedRuns="1000">
        <function name="setTemperature">
          <parameter name="temperature" dataType="INT"/>
        </function>
      </component>
    </node>
  </environment>
  <environment name="Warehouse">
    <node name="Scaffolding">
      <connectionModule xsi:type="cpsml:WiredModule" name="SCAFFOLDING" connect="//@messageBroker.0/@connectionModule.0">
        <supportedProtocols>DDS</supportedProtocols>
      </connectionModule>
      <position x="8.0" y="8.0" z="-1.0"/>
      <component xsi:type="cpsml:Sensor" name="Scanner" topic="logistics">
        <function name="getContent" returnDataType="STRING" hasReturn="true"/>
      </component>
    </node>
    <node name="ConveyorBelt" status="CRITICAL">
      <connectionModule xsi:type="cpsml:WiredModule" name="CONVEYORBELT" connect="//@messageBroker.0/@connectionModule.0">
        <supportedProtocols>MQTT</supportedProtocols>
      </connectionModule>
      <position x="7.0" y="7.0" z="-1.0"/>
      <component xsi:type="cpsml:Actuator" name="Motor" status="CRITICAL" topic="logistics" runs="10" ratedRuns="10000">
        <function name="setSpeed">
          <parameter name="speed" dataType="INT"/>
        </function>
      </component>
    </node>
  </environment>
  <messageBroker name="Central">
    <connectionModule xsi:type="cpsml:WiredModule" name="CENTRAL_WM" connectOpposite="//@environment.2/@node.0/@connectionModule.0 //@environment.0/@node.0/@connectionModule.1 //@environment.2/@node.1/@connectionModule.0">
      <supportedProtocols>DDS</supportedProtocols>
      <supportedProtocols>MQTT</supportedProtocols>
      <supportedProtocols>SMQTT</supportedProtocols>
    </connectionModule>
    <connectionModule xsi:type="cpsml:WirelessModule" name="CENTRAL_WLM" connect="//@environment.1/@node.0/@connectionModule.0" connectOpposite="//@environment.0/@node.1/@connectionModule.0 //@environment.0/@node.0/@connectionModule.0" range="20.0">
      <supportedProtocols>DDS</supportedProtocols>
      <supportedProtocols>MQTT</supportedProtocols>
      <supportedProtocols>SMQTT</supportedProtocols>
    </connectionModule>
    <position x="3.0" y="3.0"/>
    <topics>temp</topics>
    <topics>production</topics>
    <topics>logistics</topics>
  </messageBroker>
  <controller name="Controller C1">
    <subscription messageBroker="//@messageBroker.0">
      <topics>temp</topics>
      <topics>production</topics>
      <topics>logistics</topics>
    </subscription>
    <publication messageBroker="//@messageBroker.0">
      <topics>temp</topics>
      <topics>production</topics>
      <topics>logistics</topics>
    </publication>
    <topics>temp</topics>
    <topics>production</topics>
    <topics>logistics</topics>
  </controller>
</cpsml:CPS>
