package com.nhom6.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.nhom6.Entity.JobEntity;

public class MapperJob implements RowMapper<JobEntity>{

	public JobEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
		JobEntity job = new JobEntity();
		job.setId(rs.getInt("id"));
		job.setName(rs.getString("name"));
		job.setPrice(rs.getInt("price"));
		job.setAddress(rs.getString("address"));
		job.setDescription(rs.getString("description"));
		job.setCreate_at(rs.getTimestamp("create_at"));
		job.setStart_date(rs.getString("start_date"));
		job.setEnd_date(rs.getString("end_date"));
		job.setUser_id(rs.getInt("user_id"));
		job.setStatus_job(rs.getInt("status_job"));
		return job;
	}
	
}
