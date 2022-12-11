package com.nhom6.Dao.member;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nhom6.Entity.CartEntity;
import com.nhom6.mapper.MapperCart;

@Repository
public class CartDao {
	@Autowired
	public JdbcTemplate __jdbcTemplate;
	
	public List<CartEntity> GetFirstJobForMember(CartEntity cart){
		
		List<CartEntity> job = new ArrayList<CartEntity>();
		String sql = "SELECT * FROM job WHERE user_id = '"+cart.getMember_id()+"'";
		try {
			job = __jdbcTemplate.query(sql, new MapperCart());
			return job;			
		} catch(Exception e) {
			return null;
		}
	}
	
	// nhận công việc
	
	public int addCart(int idJob, int idMember) {
		String sql = "INSERT INTO `cart`(`job_id`, `member_id`) VALUES ('"+idJob+"','"+idMember+"')";
		int insert = __jdbcTemplate.update(sql);
		return insert;
	}
}
