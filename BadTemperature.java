package com.oop.practice;
//#23
//example to set exceptions
class BadTemperature extends Exception{  //execption class
	
	BadTemperature(String reason) {
		super(reason); //--->here super class is exception and this method is setting the message "reason" in exception class
	}

}
