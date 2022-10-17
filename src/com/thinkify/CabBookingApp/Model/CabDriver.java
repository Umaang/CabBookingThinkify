package com.thinkify.CabBookingApp.Model;

public class CabDriver {
	String name;
	String gender;
	int age;
	String vehicle_details;
	long driver_locationx;
	long driver_locationy;

	public String getName() {
		return name;
	}

	public long getDriver_locationx() {
		return driver_locationx;
	}

	public void setDriver_locationx(long driver_locationx) {
		this.driver_locationx = driver_locationx;
	}

	public long getDriver_locationy() {
		return driver_locationy;
	}

	public void setDriver_locationy(long driver_locationy) {
		this.driver_locationy = driver_locationy;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getVehicle_details() {
		return vehicle_details;
	}

	public void setVehicle_details(String vehicle_details) {
		this.vehicle_details = vehicle_details;
	}


}
