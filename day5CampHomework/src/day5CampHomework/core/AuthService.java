package day5CampHomework.core;

import day5CampHomework.entities.concretes.User;

public interface AuthService {
	void register(User user);
	void login(User user);
}
