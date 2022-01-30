package edu.javacourse.contact.business;

import java.util.List;

import edu.javacourse.contact.dao.ContactDAO;
import edu.javacourse.contact.dao.ContactDAOFactory;
import edu.javacourse.contact.entity.Contact;

public class ContactManager {

	private ContactDAO dao;

	public ContactManager() {
		dao = ContactDAOFactory.getContactDAO();
	}

	public Long addContact(Contact contact) {
		return dao.addContact(contact);
	}

	public void updateContact(Contact contact) {
		dao.updateContact(contact);
	}

	public void deleteContact(Long contactId) {
		dao.daleteContact(contactId);
	}

	public Contact getContact(Long contactId) {
		return dao.getContact(contactId);
	}

	public List<Contact> findContacts() {
		return dao.findContacts();
	}

}
