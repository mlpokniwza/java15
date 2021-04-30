package com.coding.oobLab;

import com.coding.oobLab.ICleaner;

public class OfficeCleaner extends Employee {
	public OfficeCleaner(String firstnameInput, String lastnameInput, String positionInput, int salaryInput) {
		super(firstnameInput, lastnameInput, positionInput, salaryInput);
	}

	public void Clean() {
	}

	public void KillCoachroach() {
	}

	public void DecorateRoom() {
	}

	public void WelcomeGuest() {
	}

	public void work() {
		Clean();
		KillCoachroach();
		DecorateRoom();
		WelcomeGuest();
	}
}
