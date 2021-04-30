package com.coding.oobLab;

import com.coding.oobLab.IWebsiteCreator;
import com.coding.oobLab.IWindowsInstaller;

public class Programmer extends CEO implements IWebsiteCreator, IWindowsInstaller {
	public Programmer(String firstnameInput, String lastnameInput, String positionInput, int salaryInput) {
		super(firstnameInput, lastnameInput, positionInput, salaryInput);
	}

	public void CreateWebsitet() {
	}

	public void FixPC() {
	}

	public void InstallWindows() {
	}

	public void FixPC(String serialNumber) {
		System.out.println("I'm trying to fix PC serialNumber:" + serialNumber);
	}

	public void CreateWebsite(String template, String titleName) {
		System.out.println("Setup template: " + template);
		System.out.println("Set Title name: " + titleName);
	}

	public void work() {
		CreateWebsitet();
		FixPC();
		InstallWindows();
	}

	@Override
	public void formatWindows(String drive) {
		// TODO Auto-generated method stub

	}

	@Override
	public void installWindows(String version, String productKey) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getLastInstalledWindowsVersion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void createWebsite(String template, String titleName) {
		// TODO Auto-generated method stub

	}

}
