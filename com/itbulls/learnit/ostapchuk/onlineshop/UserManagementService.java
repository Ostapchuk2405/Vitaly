package com.itbulls.LearnIT.Ostapchuk.onlinestore;

public interface UserManagementService {

	String registerUser(User user);
	
	User [] getUsers();
	
	User getUserByEmail(String userEmail);
}
