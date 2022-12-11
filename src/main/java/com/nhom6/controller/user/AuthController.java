package com.nhom6.controller.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.nhom6.Entity.UsersEntity;
import com.nhom6.Service.user.AuthImplService;

@Controller("AuthControllerUser")
@RequestMapping("/user")
public class AuthController {
	@Autowired
	AuthImplService authImplService = new AuthImplService();
	ModelAndView mv = new ModelAndView();
	
	@RequestMapping(value= {"/auth/register"} , method = RequestMethod.GET)
	public ModelAndView register() {
		mv.setViewName("user/register");
		mv.addObject("registerUser", new UsersEntity());
		return mv;
	}
	
	@RequestMapping(value= {"/auth/register"} , method = RequestMethod.POST)
	public ModelAndView handleRegister(@ModelAttribute("registerUser") UsersEntity usersEntity) {
		int count = authImplService.AddAuth(usersEntity);
		if(count > 0 ) {
			mv.addObject("statusRegister", "Đăng kí thành công!");
			mv.setViewName("redirect:/user/auth/login");
		} else {
			mv.addObject("statusRegister", "Đăng kí thất bại !");
		}
		return mv;

	}
	
	@RequestMapping(value= {"/auth/login"} , method = RequestMethod.GET)
	public ModelAndView login() {
		
		mv.setViewName("user/login");
		mv.addObject("loginUser", new UsersEntity());
		return mv;
	}
	
	@RequestMapping(value= {"/auth/login"} , method = RequestMethod.POST)
	public ModelAndView handleLogin(HttpSession session,@ModelAttribute("loginUser") UsersEntity users) {
		users = authImplService.handleAuth(users);
		
		if(users != null) {
			mv.setViewName("redirect:/user/home");
			session.setAttribute("IdUsers", users);

		} else {
			mv.addObject("statusLogin","Đăng nhập thất bại !");
		}
		return mv;
	}
	
	@RequestMapping(value= {"/auth/logout"} , method = RequestMethod.GET)
	public String Logout (HttpSession session , HttpServletRequest request) {
		session.removeAttribute("IdUsers");
		return "redirect:"+request.getHeader("Referer");
	}
}
