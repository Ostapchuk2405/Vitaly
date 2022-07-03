package edu.javacourse.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SimpleDB {

	public static void main(String[] args) {

		SimpleDB m = new SimpleDB();
		m.testDatabase();
	}

	private void testDatabase() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/contactdb";
			String login = "root";
			String password = "root";
			Connection con = DriverManager.getConnection(url, login, password);
			try {
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * FROM jc_contact");
				while (rs.next()) {
					String str = rs.getString("CONTACT_ID") + ": " + rs.getString(2);
					System.out.println("Contact " + str);
				}
				rs.close();
				stmt.close();
			} finally {
				con.close();
			}

		} catch (Exception e) {
			e.printStackTrace(System.out);
		}

	}
}
