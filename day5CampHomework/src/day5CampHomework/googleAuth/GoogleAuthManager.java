package day5CampHomework.googleAuth;

import day5CampHomework.entities.concretes.User;

public class GoogleAuthManager {
	public void register(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" Google hesab�n�z ile ba�ar�l� bir �ekilde kay�t oldunuz.");
	}
	
	public void login(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" Google hesab�n�z ile giri� yapt�n�z.");		
	}
}
