package day5CampHomework.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import day5CampHomework.dataAccess.abstracts.UserDao;
import day5CampHomework.entities.concretes.User;

public class HibernateUserDao implements UserDao {
	
	List<User> users=new ArrayList<User>();
	
	@Override
	public void register(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" baþarýlý bir þekilde kayýt oldunuz. \nLütfen üyeliðinizi doðrulamak için e-mail adresinizi kontrol ediniz.");
		users.add(user);
	}

	@Override
	public void login(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" giriþ yaptýnýz.");		
	}

	@Override
	public void confirm(User user) {
		System.out.println(user.getEmail()+" e-mail adresiniz onaylandý!");

		
	}

	@Override
	public List<User> getAll() {
		return this.users;
	}

	@Override
	public User getByEmailAndPassword(String email, String password) {
		for(User user : users) {
			if(user.getEmail() == email && user.getPassword() == password)
				return user;
		}
		return null;
	}

}
