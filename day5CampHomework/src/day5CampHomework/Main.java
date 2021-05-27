package day5CampHomework;

import day5CampHomework.business.abstracts.UserService;
import day5CampHomework.business.concretes.UserManager;
import day5CampHomework.core.GoogleAuthManagerAdapter;
import day5CampHomework.dataAccess.concretes.HibernateUserDao;
import day5CampHomework.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		UserService userService=new UserManager(new HibernateUserDao(),new GoogleAuthManagerAdapter());
		User user=new User(1, "Özkan", "Akkaya", "ozkanakkaya@hotmail.com.tr", "123456", true);
		
		userService.register(user);
		userService.login(user);
		userService.confirm(user);
		userService.registerWithAccount(user);
		userService.loginWithAccount(user);
	}

}
