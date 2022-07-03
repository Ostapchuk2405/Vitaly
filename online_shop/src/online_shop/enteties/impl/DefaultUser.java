package online_shop.enteties.impl;

import online_shop.enteties.User;

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

	public DefaultUser() {
	}

	public DefaultUser(String firstName, String lastName, String password, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
	}

	public DefaultUser(int id, String firstName, String lastName, String password, String email) {
		this.id = id;
		userCounter--;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
	}

	@Override
	public String getFirstName() {
		return this.firstName;
	}

	@Override
	public String getLastName() {
		return this.lastName;
	}

	@Override
	public String getPassword() {
		return this.password;
	}

	@Override
	public String getEmail() {
		return this.email;
	}

	@Override
	public int getId() {
		return this.id;
	}

	@Override
	public void setPassword(String newPassword) {
		if (newPassword == null) {
			return;
		}
		this.password = newPassword;
	}

	@Override
	public void setEmail(String newEmail) {
		if (newEmail == null) {
			return;
		}
		this.email = newEmail;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", password=" + password	+ ", email=" + email + "]";
	}

	void clearState() {
		userCounter = 0;
	}

	public static void setCounter(int updatedCounter) {
		userCounter = updatedCounter;
	}

}
