package com.nhom6.Service.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nhom6.Entity.JobEntity;

@Service
public interface IHomeServiceForMember {
	@Autowired
	public List<JobEntity> GetAllJob();
	public JobEntity FindJobForMember(int id);
	public int addCart(int idJob, int idMember);
}
