package com.coding.oobLab;

public class Main {
	enum Status {
		HEALTHY, SLEEPY, DEAD
	}

	public static void main(String[] args) {
		Status myStatus = Status.HEALTHY;
		switch (myStatus) {
		case HEALTHY:
			System.out.println("Let go!!!");
			break;
		case SLEEPY:
			System.out.println("ZzZzZzZzzz...");
			break;
		case DEAD:
			System.out.println("RIP");
			break;
		}
	}
}
