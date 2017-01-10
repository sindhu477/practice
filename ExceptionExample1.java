package com.oop.practice;
//#27
public class ExceptionExample1 {
	
	public static void temperatureReport(TemperatureObject tempObj) {
		try{
			tempObj.test();
			System.out.println(tempObj.temperature + " - Perfect Temperature" );
		} catch (BadTemperature bt) {
			System.out.println(tempObj.temperature + " - " + bt.getMessage() );
		}
	} //End of temperatureReport

	public static void main(String[] args) {
		temperatureReport(new TemperatureObject(100));
		temperatureReport(new TemperatureObject(50));
		temperatureReport(new TemperatureObject(75));

	} //End of main

}//End of Class
