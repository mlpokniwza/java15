package com.coding.oobLab;

import java.util.ArrayList;

public class castingTest {
	public static void main(String[] args) {
		int myInt = 5;
		float myFloat = myInt; // Widening
		System.out.println("myInt value: " + myInt);
		System.out.println("myFloat value: " + myFloat);
		float newFloat = 5.5f;
		int newInt = (int) newFloat; // Narrowing
		System.out.println("newFloat value: " + newFloat);
		System.out.println("newInt value: " + newInt);
		int otherInt = 130;
		byte myByte = (byte) otherInt; // Overflow
		System.out.println("otherInt value: " + otherInt);
		System.out.println("myByte value: " + myByte);
		
		Employee dang = new Employee("Phanyapat", "Chalermchai", "Java", 50000);
		Employee ceo = new CEO("Puriwat", "Jitrakyol", "Python", 60000);
		Programmer prog = new Programmer("Captain", "Marvel", "C++", 20000);
		CEO ceo2 = (CEO) ceo;
		ArrayList<Employee> myList = new ArrayList<>();
		myList.add(ceo2);
		myList.add(dang);
		myList.add(prog);
		CEO ceo3 = (CEO) myList.get(0);
		Employee dang2 = myList.get(1);
		Programmer prog2 = (Programmer) myList.get(2);
		dang2.checkPosition();
		ceo3.hello();
		prog2.hello();
		
		CEO ceo4 = new CEO("Phanyapat", "Chalermchai", "Java", 50000);
		IWebsiteCreator dang3 = new Programmer("Puriwat", "Jitrakyol", "Python", 60000);
		Programmer dang4 = (Programmer) dang3;
		AI alphaGo = new AI("alphaGo", "Java");
		IWebsiteCreator alphaGo2 = alphaGo;
		ceo4.orderWebsite(dang3);
		ceo4.orderWebsite(dang4);
		ceo4.orderWebsite(alphaGo);
		ceo4.orderWebsite(alphaGo2);
	}
}
