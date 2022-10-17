package com.thinkify.CabBookingApp.Repository;

import java.util.ArrayList;
import java.util.List;

import com.thinkify.CabBookingApp.Model.User;

public class UserRepo {
	List<User> listOfUsers;

	public UserRepo() {
		this.listOfUsers = new ArrayList<User>();
	}

	public List<User> getListOfUsers() {
		return listOfUsers;
	}

	public void setListOfUsers(List<User> listOfUsers) {
		this.listOfUsers = listOfUsers;
	}
	public void addUser(User user) {
		this.listOfUsers.add(user);
	}

}
