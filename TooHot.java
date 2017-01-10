package com.oop.practice;
//#24
public class TooHot extends BadTemperature {
	
	TooHot() {
		super ("Default message: Hot"); //if not input is provided this default message is sent to super class--
		//i.e badtemperature and from der it is passed to its super class-->exception
	}
	
	TooHot(String message) {  //if any message is passed then that message will be collected and sent as above.
		super(message);
	}
}
