package com.thinkify.CabBookingApp.Repository;

import java.util.ArrayList;
import java.util.List;

import com.thinkify.CabBookingApp.Model.CabDriver;

public class CabDriverRepo {
    List<CabDriver> listOfDrivers;

	public CabDriverRepo() {
		this.listOfDrivers = new ArrayList<CabDriver>();
	}

	public List<CabDriver> getListOfDrivers() {
		return listOfDrivers;
	}

	public void setListOfDrivers(List<CabDriver> listOfDrivers) {
		this.listOfDrivers = listOfDrivers;
	}
    public void addCabDriver(CabDriver driver) {
    	this.listOfDrivers.add(driver);
    }
    
}
