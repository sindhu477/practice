package com.oop.practice;
//#25
public class TooCold extends BadTemperature {
	TooCold() {
		super ("Default message: Hot");
	}
	
	TooCold(String message) {  
		super(message);
	}
}
