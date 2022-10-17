package com.thinkify.driver;

import java.util.ArrayList;
import java.util.List;

import com.thinkify.CabBookingApp.Model.CabDriver;
import com.thinkify.CabBookingApp.Model.Ride;
import com.thinkify.CabBookingApp.Model.User;
import com.thinkify.CabBookingApp.Repository.CabDriverRepo;
import com.thinkify.CabBookingApp.Repository.UserRepo;
import com.thinkify.CabBookingApp.Service.CabDriverService;
import com.thinkify.CabBookingApp.Service.UserService;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user1=new User();
		user1.setName("Abhishek");
		user1.setGender("M");
		user1.setAge(23);
	
		User user2=new User();
		user2.setName("Rahul");
		user2.setGender("M");
		user2.setAge(29);
		User user3=new User();
		user3.setName("Nandini");
		user3.setGender("F");
		user3.setAge(22);
		UserRepo userRepo=new UserRepo();
		UserService userService=new UserService();
		userService.createUser(userRepo, user1);
		userService.createUser(userRepo, user2);
		userService.createUser(userRepo, user3);
		
		CabDriver cabDriver1=new CabDriver();
		cabDriver1.setName("Driver1");
		cabDriver1.setGender("M");
		cabDriver1.setAge(24);
		cabDriver1.setVehicle_details("Swift, KA-01-12345");
		cabDriver1.setDriver_locationx(10);
		cabDriver1.setDriver_locationy(1);
	
		CabDriver cabDriver2=new CabDriver();
		cabDriver2.setName("Driver2");
		cabDriver2.setGender("M");
		cabDriver2.setAge(23);
		cabDriver2.setVehicle_details("Swift, KA-01-12345");
		cabDriver2.setDriver_locationx(11);
		cabDriver2.setDriver_locationy(10);

		//cabDriver2.setVehicle_details("Swift, KA-01-12345");
		CabDriver cabDriver3=new CabDriver();
		cabDriver3.setName("Driver3");
		cabDriver3.setGender("M");
		cabDriver3.setAge(28);
		cabDriver3.setDriver_locationx(5);
		cabDriver3.setDriver_locationy(3);
		cabDriver3.setVehicle_details("Swift, KA-01-12345");
         
		CabDriverRepo cabRepo=new CabDriverRepo();
		CabDriverService cabService=new CabDriverService();
		cabService.createCabDriver(cabRepo, cabDriver1);
		cabService.createCabDriver(cabRepo, cabDriver2);
		cabService.createCabDriver(cabRepo, cabDriver3);
	    Ride ride1=new Ride();
	    ride1.setUsername("Abhishek");
	    ride1.setUser_sourcex(0);
	    ride1.setUser_sourcey(0);
	    ride1.setUser_destx(20);
	    ride1.setUser_desty(1);
	    
	    List<CabDriver> aviallable_ride=new ArrayList<>();
	    aviallable_ride=cabService.find_ride("Abhishek",0,0,20,1,cabRepo);
	    if(aviallable_ride.size()==0) {
	    	System.out.println("No ride found");
	    }
	    aviallable_ride=cabService.find_ride("Abhishek",10,0,15,3,cabRepo);
	    if(aviallable_ride.size()==0) {
	    	System.out.println("No ride found");
	    }
	    else {
	    	for(CabDriver availlable:aviallable_ride) {
	    		System.out.println(availlable.getName()+"[Available]");
	    	}
	    }
	    String availlable_driver=cabService.choose_ride("Abhishek","Driver1",aviallable_ride);
		if(availlable_driver!=null) {
			System.out.println(availlable_driver);
		}
		else {
			System.out.println("No driver found");
		}
		  aviallable_ride=cabService.find_ride("Nandini",15,6,20,4,cabRepo);
		  if(aviallable_ride.size()==0) {
		    	System.out.println("No ride found");
		    }
		    else {
		    	for(CabDriver availlable:aviallable_ride) {
		    		System.out.println(availlable.getName()+"[Available]");
		    	}
		    }
	}

}
