package com.nhom6.Dao.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nhom6.Entity.MemberEntity;
import com.nhom6.mapper.MapperMember;

@Repository
public class MemberDao {
	@Autowired
	public JdbcTemplate __jdbcTemplate;
	
	public MemberEntity getAuthForMember(MemberEntity member) {
		String sql = "SELECT * FROM member WHERE phone_number = '"+member.getPhone_number()+"'";
		
		try {
			MemberEntity result = __jdbcTemplate.queryForObject(sql , new MapperMember());
			return result;
			
		} catch (Exception e) {
			return null;
		}
	}
}
