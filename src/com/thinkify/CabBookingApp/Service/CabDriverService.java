package com.thinkify.CabBookingApp.Service;

import java.util.ArrayList;
import java.util.List;

import com.thinkify.CabBookingApp.Model.CabDriver;
import com.thinkify.CabBookingApp.Model.Ride;
import com.thinkify.CabBookingApp.Repository.CabDriverRepo;

public class CabDriverService {
   public void createCabDriver(CabDriverRepo cabrepo,CabDriver cabd) {
	   cabrepo.addCabDriver(cabd);
   }
    public List<CabDriver> find_ride(String username,long sourcex,long sourcey,long destx,long desty,CabDriverRepo cabrDriverRepo){
    	List<CabDriver> cabDriverlist=cabrDriverRepo.getListOfDrivers();
    	List<CabDriver> availlable_cabdriver=new ArrayList<>();
        for(CabDriver cabdrivers:cabDriverlist) {
        	long cabdriverlocx=cabdrivers.getDriver_locationx();
        	long cabdriverlocy=cabdrivers.getDriver_locationy();

        	double dist=Math.sqrt((sourcex-cabdriverlocx)*(sourcex-cabdriverlocx)+(sourcey-cabdriverlocy)*(sourcey-cabdriverlocy));
        	int distance=(int) dist;
        	if(distance<5) {
        		availlable_cabdriver.add(cabdrivers);
        	}
        }
    	return availlable_cabdriver;
    }
	public String choose_ride(String username, String drivername, List<CabDriver> availlable_cabdriver) {
		// TODO Auto-generated method stub
		for(CabDriver cabdriver:availlable_cabdriver) {
			if(cabdriver.getName()==drivername) {
			   availlable_cabdriver.remove(cabdriver);
			   return cabdriver.getName();
			}
			
		}
		return null;
	}
  
}
