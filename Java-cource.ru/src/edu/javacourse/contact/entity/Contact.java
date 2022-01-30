package edu.javacourse.contact.entity;

public class Contact {

	private Long contactId;
	private String firstName;
	private String lastName;
	private String phone;
	private String email;

	public Contact() {
	}

	public Contact(String firstName, String secondName, String phone, String email) {
		super();
		this.firstName = firstName;
		this.lastName = secondName;
		this.phone = phone;
		this.email = email;
	}

	public Contact(Long contactId, String firstName, String secondName, String phone, String email) {
		super();
		this.contactId = contactId;
		this.firstName = firstName;
		this.lastName = secondName;
		this.phone = phone;
		this.email = email;
	}

	public Long getContactId() {
		return contactId;
	}

	public void setContactId(Long contactId) {
		this.contactId = contactId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contact [contactId=" + contactId + ", firstName=" + firstName + ", secondName=" + lastName + ", phone="
				+ phone + ", email=" + email + "]";
	}

}
