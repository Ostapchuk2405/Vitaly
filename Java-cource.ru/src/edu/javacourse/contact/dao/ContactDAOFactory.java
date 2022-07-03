package edu.javacourse.contact.dao;

import edu.javacourse.contact.config.GlobalConfig;

public class ContactDAOFactory {

	public static ContactDAO getContactDAO() {
		try {
			Class dao = Class.forName(GlobalConfig.getProperty("dao.class"));
			return (ContactDAO) dao.newInstance();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}

}
