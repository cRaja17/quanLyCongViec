package com.nhom6.Dao.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nhom6.Entity.UsersEntity;
import com.nhom6.mapper.MapperUser;

@Repository
public class UsersDao {
	@Autowired
	public JdbcTemplate __jdbcTemplate;
	
	public int AddAuth(UsersEntity user) {
		StringBuffer  sql = new StringBuffer();
		sql.append("INSERT INTO users ");
		sql.append("( ");
		sql.append("    name, ");
		sql.append("    address, ");
		sql.append("    phone_number, ");
		sql.append("    identify_card, ");
		sql.append("    password ");
		sql.append(") ");
		sql.append("VALUES ");
		sql.append("( ");
		sql.append("    '"+user.getName()+"', ");
		sql.append("    '"+user.getAddress()+"', ");
		sql.append("    '"+user.getPhone_number()+"', ");
		sql.append("    '"+user.getIdentify_card()+"', ");
		sql.append("    '"+user.getPassword()+"' ");
		sql.append(")");
		int insert = __jdbcTemplate.update(sql.toString());
		return insert;
	}
	
	public UsersEntity getAuth(UsersEntity user) {
		String sql = "SELECT * FROM users WHERE phone_number = '"+user.getPhone_number()+"'";
		try {
			UsersEntity result = __jdbcTemplate.queryForObject(sql , new MapperUser());
			return result;		
		} catch(Exception e) {
			return null;
		}	
	}
}
