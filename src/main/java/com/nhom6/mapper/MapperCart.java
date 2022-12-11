package com.nhom6.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.nhom6.Entity.CartEntity;

public class MapperCart implements RowMapper<CartEntity>{
	public CartEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
		CartEntity cart = new CartEntity();
		cart.setId(rs.getInt("id"));
		cart.setJob_id(rs.getInt("job_id"));
		cart.setMember_id(rs.getInt("member_id"));
		return cart;
	}
}
