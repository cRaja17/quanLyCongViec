package com.nhom6.Service.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nhom6.Entity.MemberEntity;

@Service
public interface IAuthServiceForMember {
	
	@Autowired
	public MemberEntity handleAuthForMember(MemberEntity member);

}
