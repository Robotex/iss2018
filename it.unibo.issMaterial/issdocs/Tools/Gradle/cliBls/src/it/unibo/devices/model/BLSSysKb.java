package it.unibo.devices.model;

public class BLSSysKb {
	
	public static enum LedColor{
		GREEN(0), RED(1), BLUE(2);
		private int Value;
		private LedColor(int Value) {
			this.Value = Value;
		}
		public int getValue() {
			return Value;
		}	
	} ;
  	/*
 	 * ARDUINO PORTS (a specification for each different OS)
 	 */
 	public static final String serialPortWindows = "COM49";
	public static final String serialPortLinux = "/dev/ttyUSB0";  
	public static final String serialPortMacOs = "/dev/tty.usbserial-A9007UX1";  
	
 	/*
 	 * The configuration is defined in the file blsConfig.properties
 	 * mock 			//the system is on a PC (GUI)
 	 * raspberry 		//the system is on Raspberry
 	 * buttonArduino 	//the button on Arduino
 	 * ledRasp 			//the led is is on Raspberry
 	 * buttonRasp 	    //the button is is remote (Arduino or Raspberry)
	 * devsRemote 		//the button and the led are remote
  	 */
	public static final String mock="mock";
	public static final String raspberry="raspberry";
	public static final String distibutedrMock="distibutedrMock";
	public static final String buttonArduino="buttonArduino";
	public static final String ledRasp="ledRasp";
	public static final String buttonRasp="buttonRasp";
	public static final String devsRemote="devsRemote";
}
