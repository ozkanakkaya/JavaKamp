package day5CampHomework.business.concretes;

import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import day5CampHomework.business.abstracts.UserService;
import day5CampHomework.core.AuthService;
import day5CampHomework.dataAccess.abstracts.UserDao;
import day5CampHomework.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private AuthService authService;
	
	public UserManager() {}
	
	public UserManager(UserDao userDao, AuthService authService) {
		super();
		this.userDao = userDao;
		this.authService = authService;
	}

	@Override
	public void register(User user) {
		if (user.getPassword().length()<6) {
			System.out.println("Þifreniz en az 6 karakterden oluþmalýdýr.");
		}
		
	    final String EMAIL_PATTERN = "^(.+)@(\\S+)$";
	    final Pattern pattern = Pattern.compile(EMAIL_PATTERN);
	    Matcher matcher = pattern.matcher(user.getEmail());
	    if (!matcher.matches()) {
			System.out.println(user.getEmail()+" e-mail adresi formatýna uygun deiðldir.");
		}
	    
	    for (User users : userDao.getAll()) {
			if (users.getEmail().equals(user.getEmail())) {
				System.out.println(user.getEmail()+" bu e-mail adresi sistemde mevcuttur.");
			}
		}
	    
	    if (user.getFirstName().length()<2&&user.getLastName().length()<2) {
			System.out.println("Ad ve Soyad en az 2 karakterden oluþmalýdýr.");
		}
	    
	}

	@Override
	public void login(User user) {
		if (user.isVerify()) {
			userDao.login(user);
		}
		else {
			System.out.println("Giriþ baþarýsýz. E-mail adresinizi kontrol ediniz.");
		}
		
	}

	@Override
	public void confirm(User user) {
		if (user.isVerify()) {
			userDao.confirm(user);
			System.out.println(user.getFirstName()+" "+user.getLastName()+" e-mail adresiniz doðrulanmýþtýr.");

		}else {
			System.out.println(user.getFirstName()+" "+user.getLastName()+" e-mail adresiniz doðrulanmamýþtýr.");
		}
		
	}

	@Override
	public void registerWithAccount(User user) {
		user.setVerify(true);
		this.authService.register(user);
		
	}

	@Override
	public void loginWithAccount(User user) {
		if (user.isVerify()) {
			this.authService.login(user);
		} else {
			System.out.println("E-mail adresinizi doðrulayýnýz!");
		}
		
	}

}
