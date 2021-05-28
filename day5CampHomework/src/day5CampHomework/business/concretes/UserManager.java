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
			System.out.println("�ifreniz en az 6 karakterden olu�mal�d�r.");
			return;
		}
		
	    final String EMAIL_PATTERN = "^(.+)@(\\S+)$";
	    final Pattern pattern = Pattern.compile(EMAIL_PATTERN);
	    Matcher matcher = pattern.matcher(user.getEmail());
	    if (!matcher.matches()) {
			System.out.println(user.getEmail()+" e-mail adresi format�na uygun dei�ldir.");
			return;
		}
	    
	    for (User users : userDao.getAll()) {
			if (users.getEmail().equals(user.getEmail())) {
				System.out.println(user.getEmail()+" bu e-mail adresi sistemde mevcuttur.");
			}
			return;
		}
	    
	    if (user.getFirstName().length()<2&&user.getLastName().length()<2) {
			System.out.println("Ad ve Soyad en az 2 karakterden olu�mal�d�r.");
			return;
		}
	    
	    userDao.register(user);
	    
	}

	@Override
	public void login(String email, String password) {
		
		User userToLogin = userDao.getByEmailAndPassword(email, password);
		
		if(userToLogin == null) {
			System.out.println("Giri� ba�ar�s�z. E-posta adresiniz veya �ifreniz yanl��.");
			return;
		}
		
		if(!userToLogin.isVerify()) {
			System.out.println("Giri� ba�ar�s�z. �yeli�inizi do�rulamad�n�z.");
			return;
		}
		
		System.out.println("Giri� ba�ar�l�! "+ userToLogin.getFirstName()+ " " + userToLogin.getLastName()+" Ho�geldiniz.");
	}

	@Override
	public void confirm(User user) {
		if (user.isVerify()) {
			userDao.confirm(user);

		}else {
			System.out.println(user.getFirstName()+" "+user.getLastName()+" e-mail adresiniz do�rulanmam��t�r.");
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
			System.out.println("E-mail adresinizi do�rulay�n�z!");
		}
		
	}

}
