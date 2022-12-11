package com.nhom6.controller.user;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nhom6.Entity.JobEntity;
import com.nhom6.Entity.UsersEntity;
import com.nhom6.Service.user.HomeImplService;

@Controller("HomeControllerUser")
@RequestMapping("/user")
public class HomeController {
	@Autowired
	HomeImplService homeImplService = new HomeImplService();
	
	ModelAndView mv = new ModelAndView();
	
	@RequestMapping(value = {"/","/home"} , method=RequestMethod.GET)
	public ModelAndView Index(HttpSession session) {
		mv.setViewName("user/home");
		UsersEntity user = (UsersEntity)session.getAttribute("IdUsers");
		if(user !=null) {
			int id = user.getId();
			mv.addObject("job", homeImplService.GetDataJob(id));
		}
		return mv;
	}
	
	@RequestMapping(value = {"/createJob"} , method=RequestMethod.GET)
	public ModelAndView createJob() {
		mv.setViewName("user/createJob");
		mv.addObject("job" , new JobEntity());
		return mv;
	}
	
	@RequestMapping(value = {"/createJob"} , method=RequestMethod.POST)
	public ModelAndView insertJob(@ModelAttribute("job") JobEntity jobEntity) {
		int count = homeImplService.addJob(jobEntity);
		if(count > 0 ) {
			mv.setViewName("redirect:/user/home");
		} else {
			mv.setViewName("redirect:/user/createJob");
		}
		return mv;
	}
	
//	xem chi tiết công việc
	@RequestMapping(value = {"/Jobdetail/{id}"})
	public ModelAndView jobDetail(@PathVariable int id) {
		mv.setViewName("user/jobDetail");
		mv.addObject("job" , homeImplService.FindJobForUser(id));
		return mv;
	}
	
	
	// sửa công việc
	
	@RequestMapping(value = {"/editJob/{id}"}  , method=RequestMethod.GET)
	public ModelAndView editJob(@PathVariable int id) {
		mv.setViewName("user/editJob");
		mv.addObject("job" , homeImplService.FindJobForUser(id));
		mv.addObject("editJob" , new JobEntity());
		return mv;
	}
	
	@RequestMapping(value = {"/editJob/{id}"} , method=RequestMethod.POST)
	public ModelAndView updateJob(@ModelAttribute("editJob") JobEntity jobEntity,@PathVariable int id) {
		int count = homeImplService.editJob(jobEntity, id);
		if(count > 0 ) {
			mv.setViewName("redirect:/user/home");
		} else {
			mv.setViewName("redirect:/user/editJob");
		}
		return mv;
	}
	
}
