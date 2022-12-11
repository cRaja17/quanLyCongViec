package com.nhom6.Dao.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nhom6.Entity.JobEntity;
import com.nhom6.mapper.MapperJob;

@Repository
public class JobUserDao {
	@Autowired
	public JdbcTemplate __jdbcTemplate;
	// xem danh sách công việc
	public List<JobEntity> FindAllJobForUser(int id){
		List<JobEntity> job = new ArrayList<JobEntity>();
		String sql = "SELECT * FROM job WHERE user_id='"+id+"'";
		job = __jdbcTemplate.query(sql, new MapperJob());
		return job;
	}	
	// xem chi tiết công việc
	public List<JobEntity> FindJobForUser(int id){
		List<JobEntity> job = new ArrayList<JobEntity>();
		String sql = "SELECT * FROM job WHERE id='"+id+"'";
		job = __jdbcTemplate.query(sql, new MapperJob());
		return job;
	}
	
	
	// tạo công việc
	
	public int createJob(JobEntity jobEntity) {
		StringBuffer  varname1 = new StringBuffer();
		varname1.append("INSERT INTO job ");
		varname1.append("( ");
		varname1.append("    name, ");
		varname1.append("    price, ");
		varname1.append("    address, ");
		varname1.append("    description, ");
		varname1.append("    create_at, ");
		varname1.append("    start_date, ");
		varname1.append("    end_date, ");
		varname1.append("    user_id, ");
		varname1.append("    status_job ");
		varname1.append(") ");
		varname1.append("VALUES ");
		varname1.append("( ");
		varname1.append(" '"+jobEntity.getName()+"', ");
		varname1.append(" '"+jobEntity.getPrice()+"', ");
		varname1.append(" '"+jobEntity.getAddress()+"', ");
		varname1.append(" '"+jobEntity.getDescription()+"', ");
		varname1.append(" '"+java.time.LocalDateTime.now()+"', ");
		varname1.append(" '"+jobEntity.getStart_date()+"', ");
		varname1.append(" '"+jobEntity.getEnd_date()+"', ");
		varname1.append(" '1', ");
		varname1.append(" '0' ");
		varname1.append(")");
		int insert = __jdbcTemplate.update(varname1.toString());
		return insert;
	}
	
	// edit job
	
	public int editJob(JobEntity jobEntity,int id) {
		StringBuffer  varname1 = new StringBuffer();
		varname1.append("UPDATE job SET");
		varname1.append("    name='"+jobEntity.getName()+"', ");
		varname1.append("    price='"+jobEntity.getPrice()+"', ");
		varname1.append("    address='"+jobEntity.getAddress()+"', ");
		varname1.append("    description='"+jobEntity.getDescription()+"', ");
		varname1.append("    start_date='"+jobEntity.getStart_date()+"', ");
		varname1.append("    end_date='"+jobEntity.getEnd_date()+"' ");
		varname1.append("WHERE id ='"+id+"'");
		int insert = __jdbcTemplate.update(varname1.toString());
		return insert;
	}
}
