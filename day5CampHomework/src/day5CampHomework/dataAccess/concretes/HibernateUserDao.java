package day5CampHomework.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import day5CampHomework.dataAccess.abstracts.UserDao;
import day5CampHomework.entities.concretes.User;

public class HibernateUserDao implements UserDao {
	
	List<User> users=new ArrayList<User>();
	
	@Override
	public void register(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" ba�ar�l� bir �ekilde kay�t oldunuz.");
		users.add(user);
	}

	@Override
	public void login(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" giri� yapt�n�z.");		
	}

	@Override
	public void confirm(User user) {
		System.out.println(user.getEmail()+" e-mail adresiniz onayland�!");

		
	}

	@Override
	public List<User> getAll() {
		return this.users;
	}

}
