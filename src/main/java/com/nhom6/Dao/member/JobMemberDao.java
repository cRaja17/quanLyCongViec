package com.nhom6.Dao.member;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nhom6.Entity.JobEntity;
import com.nhom6.mapper.MapperJob;

@Repository
public class JobMemberDao {
	@Autowired
	public JdbcTemplate __jdbcTemplate;
	
	public List<JobEntity> FindAllJobForMember(){
		List<JobEntity> job = new ArrayList<JobEntity>();
		String sql = "SELECT * FROM job";
		try {
			job = __jdbcTemplate.query(sql, new MapperJob());
			return job;		
		} catch(Exception e) {
			return null;
		}
	}
	
	// xem chi tiết công việc
	public List<JobEntity> FindJobForMember(int id){
		List<JobEntity> job = new ArrayList<JobEntity>();
		String sql = "SELECT * FROM job WHERE id='"+id+"'";
		job = __jdbcTemplate.query(sql, new MapperJob());
		return job;
	}
}

