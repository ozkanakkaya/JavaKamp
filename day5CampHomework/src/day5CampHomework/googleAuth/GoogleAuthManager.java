package day5CampHomework.googleAuth;

import day5CampHomework.entities.concretes.User;

public class GoogleAuthManager {
	public void register(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" Google hesabýnýz ile baþarýlý bir þekilde kayýt oldunuz.");
	}
	
	public void login(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" Google hesabýnýz ile giriþ yaptýnýz.");		
	}
}
