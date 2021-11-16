package com.zuk.service.impl;

import org.springframework.util.DigestUtils;

import com.zuk.dao.impl.UserDaoImpl;
import com.zuk.entity.User;
import com.zuk.service.UserService;

public class UserServiceImpl implements UserService {

	UserDaoImpl userDao = new UserDaoImpl();

	public String login(User user) {
		User findUser = userDao.findByLogin(user.getLogin());
		if (findUser != null) {
			if (DigestUtils.md5DigestAsHex((user.getPassword()).getBytes()).equals(findUser.getPassword())) {
				return "life is beautifull," + "your id:" + findUser.getId();
			}
		}
		return "Stupid ashole";
	}

	public String registration(User user) {
		User findUser = userDao.findByLogin(user.getLogin());
		if (findUser == null) {
			userDao.save(user);
			return "registration complete";
		}
		return "Nu davai";
	}

}
