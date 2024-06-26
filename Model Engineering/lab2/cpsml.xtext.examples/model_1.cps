CPS model {
	environments : [
		ProductionFloor {
			nodes : [
				Printer {
					health : CRITICAL
					Position { x : 0.0 y : 0.0 z : 0.0}
					
					components : [
						Actuator HeatedPrintBed {
							health : CRITICAL
							topic : "temp"
							functions : [
								setTemperature (INT :: temperature)
							]
						},
						Actuator Extrudor {
							health : GOOD
							topic : "production"
							runs : 100
							ratedRuns : 10000	
							functions : [
								startPrint(),
								INT :: getRemainingPrintDuration()
							]		
						}
					]
					connectionModules : [
						WiredModule PRINTER_W {
							supportedProtocols : [MQTT,SMQTT]
							connect -> ["Central.CENTRAL_W"]
						},
						WirelessModule PRINTER_WL {
							supportedProtocols : [DDS,MQTT]
							range : 10.0
							connect->["Central.CENTRAL_WL"]
						}
					]
					subscribes : [
						{topics : ["temp", "production"] messageBroker Central}
					]
					publishes : [
						{topics: ["temp", "production"] messageBroker Central },
						{["production"] Central}
					]
				},
				Robot {
					health : GOOD
					Position { x : 2.0 y : 2.0 z : 1.0}
					components : [
						Actuator RoboticArm {
							health : GOOD
							topic:"logistics"
							functions : [
								grab(INT::strength, INT::velocity)
							]
						},
						Sensor InternalTemperature {
							health : GOOD
							topic : "temp"
							functions : [
								INT :: getTemperature()
							]
						}
					]
					connectionModules : [
						WirelessModule ROBOT_WL {
							supportedProtocols : [DDS]
							range : 3.0
							connect -> ["Central.CENTRAL_WL"]
						}
					]
					subscribes : [
						{ ["temp"] Central}
					]
					publishes : [
						{ topics : ["temp"] Central}
					]
				}
			]
		}
	]
	messageBrokers : [
		Central {
			Position { x : 3.0 y : 3.0 z : 0.0}
			topics : ["temp", "production", "logistics"]
			connectionModules : [
				WiredModule CENTRAL_W {
					supportedProtocols:[DDS,MQTT,SMQTT]
				},
				WiredModule CENTRAL_W2 {
					supportedProtocols:[DDS]
				},
				WirelessModule CENTRAL_WL {
					supportedProtocols:[DDS,MQTT,SMQTT]
					range : 20.0
				},
				WirelessModule CENTRAL_WL2 {
					supportedProtocols:[DDS]
					range : 2.0
				}
			]
		}
	]
	controllers : [
		"Controller C1" {
			description "A controller to interact with the system"
			topics : ["temp", "production", "logistics"]
			subscribes : [
				{["temp", "production", "logistics"] Central}
			]
			publishes : [
				{["temp", "production", "logistics"] Central}
			]
		}
	]
}