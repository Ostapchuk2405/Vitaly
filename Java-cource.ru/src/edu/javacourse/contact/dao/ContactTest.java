package edu.javacourse.contact.dao;

import java.util.List;

import edu.javacourse.contact.business.ContactManager;
import edu.javacourse.contact.entity.Contact;
import edu.javacourse.contact.exception.ContactBusinessException;
import edu.javacourse.contact.exception.ContactDaoException;

public class ContactTest {

	public static void main(String[] args) throws ContactBusinessException, ContactDaoException {
		ContactManager cm = new ContactManager();

		Contact c1 = new Contact("������", "�������", "+7-911-890-7766", "sokolov@yandex.ru");
		Contact c2 = new Contact("������", "������", "+7-911-890-7755", "ivanov@google.com");
		Contact c3 = new Contact("�������", "��������", "+7-911-890-1164", "semenova@mail.ru");

		System.out.println("ADD CONTACT ==============");
		Long cId1 = cm.addContact(c1);
		Long cId2 = cm.addContact(c2);
		Long cId3 = cm.addContact(c3);
		List<Contact> result1 = cm.findContacts();
		for (Contact c : result1) {
			System.out.println(c);
		}

		System.out.println("UPDATE CONTACT ==============");
		Contact change = new Contact(cId1, "�������", "�������", "+7-911-890-7766", "sokolov@yandex.ru");
		cm.updateContact(change);
		List<Contact> result2 = cm.findContacts();
		for (Contact c : result2) {
			System.out.println(c);
		}

		System.out.println("DELETE CONTACT ==============");
		cm.deleteContact(cId1);
		List<Contact> result3 = cm.findContacts();
		for (Contact c : result3) {
			System.out.println(c);
		}

		System.out.println("GET CONTACT ==============");
		Contact contact = cm.getContact(cId2);
		System.out.println(contact);
	}

}
