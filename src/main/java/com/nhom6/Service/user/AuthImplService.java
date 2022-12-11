package com.nhom6.Service.user;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nhom6.Dao.user.UsersDao;
import com.nhom6.Entity.UsersEntity;

@Service
public class AuthImplService implements IAuthService{
	@Autowired
	
	UsersDao userDao = new UsersDao();
	
	public int AddAuth(UsersEntity user) {
		
		user.setPassword(BCrypt.hashpw(user.getPassword(), BCrypt.gensalt(12)));
		return userDao.AddAuth(user);
	}

	public UsersEntity handleAuth(UsersEntity user) {
		String pass = user.getPassword();
		user = userDao.getAuth(user);
		if(user != null) {
				if(BCrypt.checkpw(pass, user.getPassword())) {
					return user;
				} else {
					return null;
				}
		}
		return null;
	}
}
