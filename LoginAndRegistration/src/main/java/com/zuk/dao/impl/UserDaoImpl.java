package com.zuk.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.util.DigestUtils;

import com.zuk.connection.ConnectionManager;
import com.zuk.dao.UserDao;
import com.zuk.entity.User;

public class UserDaoImpl implements UserDao {

	public User findByLogin(String login) {
		ConnectionManager cm = new ConnectionManager();
		Connection con = cm.getConnection();
		User user = null;

		if (con != null) {
			try {
				PreparedStatement pr = con.prepareStatement("SELECT * FROM database.user where Login=?");
				pr.setString(1, login);
				ResultSet resultSet = pr.executeQuery();
				if (resultSet.next()) {
					user = new User();
					user.setId(resultSet.getInt("ID"));
					user.setName(resultSet.getString("Name"));
					user.setSurname(resultSet.getString("Surname"));
					user.setLogin(login);
					user.setPassword(resultSet.getString("Password"));
					return user;
				}
				pr.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return user;
	}

	public Boolean save(User user) {
		ConnectionManager cm = new ConnectionManager();
		Connection con = cm.getConnection();

		if (con != null) {
			try {
				PreparedStatement pr = con
						.prepareStatement("insert into database.user(Name, Surname, Login, Password) values (?,?,?,?)");
				pr.setString(1, user.getName());
				pr.setString(2, user.getSurname());
				pr.setString(3, user.getLogin());
				pr.setString(4, DigestUtils.md5DigestAsHex((user.getPassword()).getBytes()));
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return false;
	}

}
