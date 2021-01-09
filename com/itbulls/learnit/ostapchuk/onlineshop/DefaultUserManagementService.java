package com.itbulls.LearnIT.Ostapchuk.onlinestore;

import java.util.Arrays;

public class DefaultUserManagementService implements UserManagementService {
	
	public static final String NOT_UNIQUE_EMAIL_ERROR_MESSAGE = "This email is used already.";
	public static final String EMPTY_EMAIL_ERROR_MESSAGE = "Enter your email.";
	public static final String NO_ERROR_MESSAGE = "";
	
	public static final int DEFAULT_USERS_CAPACITY = 10;
	public static DefaultUserManagementService instance;
	
	private User[] users;
	private int lastUserIndex;
	private String getEmail;
	{
		users = new User[DEFAULT_USERS_CAPACITY];
	}
	private DefaultUserManagementService() {
	}

	@Override
	public String registerUser(User user) {
		if(user == null) {
			return NO_ERROR_MESSAGE;
		}
		String errorMessage = checkUniqueEmail(user.getEmail());
		if (errorMessage != null && !errorMessage.isEmpty()) {
			return errorMessage;
		}
		if (users.length <= lastUserIndex) {
			users = Arrays.copyOf(users, users.length << 1);
		}
		users[lastUserIndex++] = user;
		return NO_ERROR_MESSAGE;
	}
	private String checkUniqueEmail(String email) {
		if(email == null || email.isEmpty()) {
			return EMPTY_EMAIL_ERROR_MESSAGE;
		}
		for(User user:users) {
			getEmail = null;
			if(user !=null && 
					user.getEmail() != null &&
					getEmail.equalsIgnoreCase(email)) {
				return NOT_UNIQUE_EMAIL_ERROR_MESSAGE;
			}
		}
		return NO_ERROR_MESSAGE;
	}
	public static UserManagementService getInstance() {
		if (instance == null) {
			instance = new DefaultUserManagementService();
		}
		return instance;
	}
	@Override
	public User[] getUsers() {
		int nonNullUsersAmount = 0;
		for(User user : users) {
			if(user != null) {
				nonNullUsersAmount++;
			}
		}
		User[] nonNullUsers = new User[nonNullUsersAmount];
		int index = 0;
		for(User user : users) {
			if(user != null) {
				nonNullUsers[index++] = user;
			}
		}
		return nonNullUsers;
	}
	@Override
	public User getUserByEmail(String userEmail) {
		for(User user : users) {
			if(user != null && user.getEmail().equalsIgnoreCase(userEmail)) {
				return user;
			}
		}
		return null;
	}
	void clearServiceState() {
		lastUserIndex = 0;
		users = new User[DEFAULT_USERS_CAPACITY];
	}
}
