package com.coding.oobLab;

public class Employee {
	public static void main(String[] args) {
		Employee[] Programmers = new Employee[2];
		Programmers[0] = new Employee("Phanyapat", "Chalermchai", "Java", 50000);
		Programmers[1] = new Employee("Puriwat", "Jitrakyol", "Python", 60000);
		System.out.println();
	}

	public String firstname;
	public String lastname;
	public String position;
	private int salary;

	public Employee() {
		this.firstname = "Anonymous";
		this.lastname = "Anonymous";
		this.position = "Anonymous";
		this.salary = 9000; // default salary
	}

	public Employee(String firstnameInput, String lastnameInput, String positionInput, int salaryInput) {
		this.firstname = firstnameInput;
		this.lastname = lastnameInput;
		this.position = positionInput;
		this.salary = salaryInput;
	}

	public int getSalary() {
		return salary;
	}

	public void checkPosition() {
		System.out.println(this.position);
	}
}
