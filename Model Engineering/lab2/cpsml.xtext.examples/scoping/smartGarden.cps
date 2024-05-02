CPS smartGarden {
	environments : [
		balcony {
			nodes : [
				smartPot {
					health : CRITICAL
					Position { x : 0.0 y : 0.0 z : 0.0}
					
					components : [
						Actuator display {
							health : CRITICAL
							topic : "notification"
							functions : [
								setTemperature (INT :: temperature)
							]
						},
						Sensor soilMoisture {
							health : GOOD
							topic : "watering"
							functions : [
								INT :: getTemperature()
							]
						}
					]
					connectionModules : [
						WirelessModule SMARTPOT_WL {
							supportedProtocols : [DDS,MQTT]
							range : 10.0
							connect->["mb1.MB1_WL"]
						}
					]
					subscribes : [
						{topics: ["notification"] messageBroker mb1 }
					]
					publishes : [
						{topics: ["watering"] messageBroker mb1 }
					]	
				}
			]
		}
	]
	messageBrokers : [
		mb1 {
			Position { x : 3.0 y : 3.0 z : 0.0}
			topics : ["watering","notification"]
			connectionModules : [
				WiredModule MB1_W {
					supportedProtocols:[DDS,MQTT,SMQTT]
					
				},
				WiredModule MB1_W2 {
					supportedProtocols:[DDS]
					
				},
				WirelessModule MB1_WL {
					supportedProtocols:[DDS,MQTT,SMQTT]
					range : 20.0

				},
				WirelessModule MB1_WL2 {
					supportedProtocols:[DDS]
					range : 2.0
				}
			]
		}
	]
	controllers : [
		"C1" {
			description "A controller to interact with the system."
			topics : ["watering", "notification"]
			subscribes : [
				{ ["watering"] mb1 }
			]
			publishes : [
				{ ["notification"] mb1 }
			]
		}
	]
}