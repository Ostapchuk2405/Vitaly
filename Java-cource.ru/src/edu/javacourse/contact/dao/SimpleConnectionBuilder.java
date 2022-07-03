package edu.javacourse.contact.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import edu.javacourse.contact.config.GlobalConfig;

public class SimpleConnectionBuilder implements ConnectionBuilder {

	public SimpleConnectionBuilder() {
		try {
			Class.forName(GlobalConfig.getProperty("com.mysql.cj.jdbc.Driver"));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Connection getConnection() throws SQLException {
		String url = GlobalConfig.getProperty("db.url");
		String login = GlobalConfig.getProperty("db.login");
		String password = GlobalConfig.getProperty("db.password");
		return DriverManager.getConnection(url, login, password);
	}

}
