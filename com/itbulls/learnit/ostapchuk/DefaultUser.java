package com.itbulls.LearnIT.Ostapchuk.onlinestore;

public class DefaultUser implements User {
	
	private static int userCounter = 0;
	
	private int id;
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	{
		id = ++userCounter;
	}
	public DefaultUser(String firtName, String lastName, String password, String email) {
		this.firstName = firtName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
	}

	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return this.firstName;
	}

	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return this.lastName;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return this.password;
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return this.email;
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	@Override
	public void setPassword(String password) {
		// TODO Auto-generated method stub
		if(password == null) {
			return;
		}
		this.password = password;
	}

	@Override
	public void setEmail(String newEmail) {
		// TODO Auto-generated method stub
		if(newEmail == null) {
			return;
		}
		this.email = newEmail;
	}
	void clearState() {
		userCounter = 0;
	}
}
