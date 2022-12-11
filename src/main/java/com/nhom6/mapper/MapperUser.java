package com.nhom6.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.nhom6.Entity.UsersEntity;

public class MapperUser implements RowMapper<UsersEntity>{

	public UsersEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		UsersEntity user = new UsersEntity();
		user.setId(rs.getInt("id"));
		user.setName(rs.getString("name"));
		user.setAddress(rs.getString("address"));
		user.setPhone_number(rs.getInt("phone_number"));
		user.setIdentify_card(rs.getInt("identify_card"));
		user.setPassword(rs.getString("password"));
		return user;
	}
	
}
