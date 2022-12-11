package com.nhom6.controller.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nhom6.Entity.MemberEntity;
import com.nhom6.Entity.UsersEntity;
import com.nhom6.Service.member.AuthImplServiceForMember;

@Controller("AuthControllerMember")
@RequestMapping("/member")
public class AuthController {
	@Autowired
	AuthImplServiceForMember authImplServiceForMember = new AuthImplServiceForMember();
	ModelAndView mv = new ModelAndView();

	@RequestMapping(value= {"/auth/login"} , method = RequestMethod.GET)
	public ModelAndView loginForMember() {
		mv.addObject("member", new UsersEntity());
		mv.setViewName("member/login");
		return mv;
	}
	
	@RequestMapping(value= {"/auth/login"} , method = RequestMethod.POST)
	public ModelAndView handleLoginForMember(HttpSession session,@ModelAttribute("member") MemberEntity member) {
		member = authImplServiceForMember.handleAuthForMember(member);
		
		if(member != null) {
			mv.setViewName("redirect:/member/home");
			session.setAttribute("IdMember", member);
		} else {
			mv.addObject("statusLogin","Đăng nhập thất bại !");
		}
		return mv;
	}
	
	@RequestMapping(value= {"/auth/logout"} , method = RequestMethod.GET)
	public String Logout (HttpSession session , HttpServletRequest request) {
		session.removeAttribute("IdMember");
		return "redirect:"+request.getHeader("Referer");
	}
}
	

