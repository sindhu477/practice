package com.oop.practice;
//#17
import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		String str = "I think I am so pretty";
		
		System.out.println("String: " + str);
		StringTokenizer tokens = new StringTokenizer(str); //So str string from above will be broken into tokens
		
		// observe no delimeter is given here -->space is taken by default
		
		System.out.println("Tokens: " + tokens.countTokens());
		while (tokens.hasMoreTokens()) //==>as long as their are tokens, keep reading all those tokens
			System.out.println(tokens.nextToken());
		{
			
		}
	}

}
