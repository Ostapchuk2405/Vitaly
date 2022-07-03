package online_shop.storage;

import java.util.List;

import online_shop.enteties.User;

public interface UserStoringService {

	void saveUser(User user);

	List<User> loadUsers();
}
