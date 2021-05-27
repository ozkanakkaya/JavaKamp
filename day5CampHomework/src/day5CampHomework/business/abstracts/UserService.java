package day5CampHomework.business.abstracts;

import day5CampHomework.entities.concretes.User;

public interface UserService {
	
	void register(User user);
	void login(User user);
	void confirm(User user);

	void registerWithAccount(User user);
	void loginWithAccount(User user);
}
