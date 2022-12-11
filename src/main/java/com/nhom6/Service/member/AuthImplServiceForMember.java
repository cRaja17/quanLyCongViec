package com.nhom6.Service.member;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nhom6.Dao.member.MemberDao;
import com.nhom6.Entity.MemberEntity;

@Service
public class AuthImplServiceForMember implements IAuthServiceForMember{
	
	@Autowired
	MemberDao memberDao = new MemberDao();
	
	public MemberEntity handleAuthForMember(MemberEntity member) {
		String pass = member.getPassword();
		member = memberDao.getAuthForMember(member);
		if(member != null) {
				if(BCrypt.checkpw(pass, member.getPassword())) {
					return member;
				} else {
					return null;
				}
		}
		return null;
	}
}	
