package com.thinkify.CabBookingApp.Service;

import com.thinkify.CabBookingApp.Model.User;
import com.thinkify.CabBookingApp.Repository.UserRepo;

public class UserService {
    public void createUser(UserRepo userRepo,User user) {
        userRepo.addUser(user);
    }
}
