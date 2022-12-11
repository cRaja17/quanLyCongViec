package com.nhom6.controller.member;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nhom6.Entity.CartEntity;
import com.nhom6.Entity.MemberEntity;
import com.nhom6.Service.member.HomeImplServiceForMember;

@Controller("HomeControllerMember")
@RequestMapping("/member")
public class HomeController {
	@Autowired
	HomeImplServiceForMember member = new HomeImplServiceForMember();
	ModelAndView mv = new ModelAndView();
	
	@RequestMapping(value= {"/","/home"} , method = RequestMethod.GET)
	public ModelAndView HomeForMember() {
		mv.setViewName("member/home");
		mv.addObject("jobs" , member.GetAllJob());
		return mv;
	}
	
	// xem chi tiết công việc
	@RequestMapping(value= {"/detail/{id}"} , method = RequestMethod.GET)
	public ModelAndView JobDetail(@PathVariable int id) {
		mv.setViewName("member/jobDetail");
		mv.addObject("job" , member.FindJobForMember(id));
		mv.addObject("crateJob", new CartEntity());
		return mv;
	}
	
	// nhận công việc
	@RequestMapping(value= {"/addjob/{id}"}, method = RequestMethod.POST)
	public ModelAndView putJob(HttpSession session,@PathVariable int id,@ModelAttribute("crateJob") CartEntity cart) {
		MemberEntity memberEntity = (MemberEntity)session.getAttribute("IdMember");
		if (member != null) {
			int idMember = memberEntity.getId();
			int count = member.addCart(id, idMember);
			if (count > 0 ) {
				mv.setViewName("redirect:/member/job/{"+id+"}");
			}
		}
		return mv;
	}
	// khi có công việc rồi không nhận được việc nữa chuyển sang thông tin công việc của mình
	@RequestMapping(value= {"/job/{id}"} , method = RequestMethod.GET)
	public ModelAndView job() {
		mv.setViewName("member/addjob");
		return mv;
	}
}
