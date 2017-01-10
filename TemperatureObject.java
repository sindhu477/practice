package com.oop.practice;
//#26
public class TemperatureObject {
	int temperature;
	
	TemperatureObject(int temp) {
		temperature = temp;
	}
	
	void test() throws TooHot, TooCold {   //here toohot and toocold are exception methods are like arithematic, overload exceptions 
		//and the messages down here are explanations/userfriendly msgs.
		if (temperature  < 70)
			throw new TooCold ("Very Cold");   //Here 'new' keyword is creating toohot and toocold objects.
		if (temperature > 80)
			throw new TooHot ("Very Hot");
	}

}
