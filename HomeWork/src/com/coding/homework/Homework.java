package com.coding.homework;

import java.util.Scanner; 

public class Homework {
	public static void main(String[] args) {
		String name = askName();
		greet(name);
	}
	public static String askName() {
		Scanner myScan = new Scanner(System.in);
		System.out.print("What is your name : ");
		String userName = myScan.next();
		return userName;
	}
	public static void greet(String name) {
		System.out.println("Hello " + name);
	}
}
