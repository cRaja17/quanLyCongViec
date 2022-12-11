package com.nhom6.Service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nhom6.Entity.UsersEntity;

@Service
public interface IAuthService {
	@Autowired
	public int AddAuth(UsersEntity user);
	
	public UsersEntity handleAuth(UsersEntity user);

}
