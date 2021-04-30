package com.coding.oobLab;

import com.coding.oobLab.IWebsiteCreator;

public class CEO extends Employee {
	public CEO(String firstnameInput, String lastnameInput, String positionInput, int salaryInput) {
		super(firstnameInput, lastnameInput, positionInput, salaryInput);
	}

	@Override
	public int getSalary() {
		return super.getSalary() * 2;
	}

	public void hello() {
		System.out.println("Hi, nice to meet you. " + this.firstname + "!");
	}

	public void fire(Employee employee) {
		System.out.println(employee.firstname + " has been fired!");
	}
	
	public void orderWebsite(IWebsiteCreator creator) {
		creator.createWebsite("some template", "Codecamp3");
	}

	public void Seminar() {
	}

	public void Hire() {
	}

	public void Golf() {
	}
	
	public void Fire() {
	}
	
	public void work() {
		Seminar();
		Hire();
		Golf();
		Fire();
	}
}
