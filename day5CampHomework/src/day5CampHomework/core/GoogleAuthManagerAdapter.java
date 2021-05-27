package day5CampHomework.core;

import day5CampHomework.entities.concretes.User;
import day5CampHomework.googleAuth.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements AuthService {

//	GoogleAuthManager googleAuthManager;
//	
//	public GoogleAuthManagerAdapter(GoogleAuthManager googleAuthManager) {
//		super();
//		this.googleAuthManager = googleAuthManager;
//	}
	GoogleAuthManager manager=new GoogleAuthManager();
	
	@Override
	public void register(User user) {
		this.manager.register(user);
		
	}

	@Override
	public void login(User user) {
		this.manager.login(user);
		
	}

}
