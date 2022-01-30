package edu.javacourse.contact.dao;

import java.util.List;

import edu.javacourse.contact.entity.Contact;

public interface ContactDAO {

	public Long addContact(Contact contact);

	public void updateContact(Contact contact);

	public void daleteContact(Long contactId);

	public Contact getContact(Long contactId);

	public List<Contact> findContacts();

}
