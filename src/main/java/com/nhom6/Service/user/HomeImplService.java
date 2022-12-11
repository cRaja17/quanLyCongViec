package com.nhom6.Service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nhom6.Dao.user.JobUserDao;
import com.nhom6.Entity.JobEntity;
@Service
public class HomeImplService implements IHomeService{
	@Autowired
	JobUserDao jobDao = new JobUserDao();
	
	public List<JobEntity> GetDataJob(int id){
		return jobDao.FindAllJobForUser(id);
	}
	
	public JobEntity FindJobForUser(int id) {
		List<JobEntity> list = jobDao.FindJobForUser(id);
		return list.get(0);
	}

	public int addJob(JobEntity jobEntity) {
		return jobDao.createJob(jobEntity);
	}	
	
	public int editJob(JobEntity jobEntity,int id) {
		return jobDao.editJob(jobEntity, id);
	}
	
	

}
