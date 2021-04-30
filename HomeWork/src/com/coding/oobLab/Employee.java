package com.coding.oobLab;

public class Employee {
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
