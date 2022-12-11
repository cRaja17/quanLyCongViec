package com.nhom6.Service.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nhom6.Dao.member.CartDao;
import com.nhom6.Dao.member.JobMemberDao;
import com.nhom6.Entity.JobEntity;

@Service
public class HomeImplServiceForMember implements IHomeServiceForMember{
	@Autowired
	JobMemberDao jobMemberDao = new JobMemberDao();
	CartDao cart = new CartDao();
	
	public List<JobEntity> GetAllJob() {
		return jobMemberDao.FindAllJobForMember();
	}
	
	public JobEntity FindJobForMember(int id){
		List<JobEntity> list = jobMemberDao.FindJobForMember(id);
		return list.get(0);
	}
	
	public int addCart(int idJob, int idMember) {
		return cart.addCart(idJob, idMember);
	}
}
