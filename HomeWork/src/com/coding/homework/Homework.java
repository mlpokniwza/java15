package com.coding.homework;

public class Homework {
	public static void main(String [] args) {
		int score = 55;
		
		if (score >= 80) {
			System.out.println("Grade : A");
		}
		else if (score >= 70) {
			System.out.println("Grade : B");
		}
		else if (score >= 60) {
			System.out.println("Grade : C");
		}
		else if (score >= 50) {
			System.out.println("Grade : D");
		}
		else if (score >= 40) {
			System.out.println("Grade : F");
		}
		else {
			System.out.println("Grade : E");
		}
	}
}
