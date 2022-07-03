package edu.javacourse.contact.dao;

import java.util.List;

import edu.javacourse.contact.entity.Contact;
import edu.javacourse.contact.exception.ContactDaoException;

public interface ContactDAO {

	public Long addContact(Contact contact) throws ContactDaoException;

	public void updateContact(Contact contact) throws ContactDaoException;

	public void deleteContact(Long contactId) throws ContactDaoException;

	public Contact getContact(Long contactId) throws ContactDaoException;

	public List<Contact> findContacts() throws ContactDaoException;

}
