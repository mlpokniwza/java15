package com.coding.oobLab;

public class obbTest {
	public static void main(String[] args) {
		Employee dang = new Employee("Phanyapat", "Chalermchai", "Java", 50000);
		Employee ceo = new CEO("Puriwat", "Jitrakyol", "Python", 60000);
		Programmer prog = new Programmer("Captain", "Marvel", "C++", 20000);
		prog.checkPosition();
		dang.checkPosition();
		ceo.checkPosition();
	}
}
