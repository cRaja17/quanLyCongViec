package com.nhom6.Service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nhom6.Entity.JobEntity;

@Service
public interface IHomeService {
	@Autowired
	public List<JobEntity> GetDataJob(int id);
	public JobEntity FindJobForUser(int id);
	public int addJob(JobEntity jobEntity);
	public int editJob(JobEntity jobEntity,int id);
	
}
