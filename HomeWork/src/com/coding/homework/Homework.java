package com.coding.homework;

public class Homework {
	public static void main(String [] args) {
		bark();
		
		float myFloat = 13.8f;
		int myFloatToInt = (int)myFloat;
		System.out.println("My Float to Int -> " + myFloatToInt);
		
		int myInt = 50;
		float myIntToFloat = (float)myInt;
		System.out.println("My Int to Float -> " + myIntToFloat);
		
		double myDouble = 9.9;
		float myDoubleToFloat = (float)myDouble;
		System.out.println("My Double to Float -> " + myDoubleToFloat);
		
		char myChar = 'a';
		int myCharToInt = (int)myChar;
		System.out.println("My Char to Int -> " + myCharToInt);
		
		final String hello = "Hello";
		hello = "World";
	}
	public static void bark() {
		String dogName = "Kaka";
		System.out.println("The Dog name = " + dogName + " bark");
	}
}
