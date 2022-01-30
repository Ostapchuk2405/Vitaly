package edu.javacourse.contact.dao;

public class ContactDAOFactory {
	
	public static ContactDAO getContactDAO() {
		return new ContactSimpleDAO();
	}

}
