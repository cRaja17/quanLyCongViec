package com.nhom6.controller.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller("CartControllerMember")
@RequestMapping("/member")
public class CartController {
	
	@RequestMapping(value= {"/job"} , method = RequestMethod.GET)
	public ModelAndView CartForMember() {
		ModelAndView mv = new ModelAndView("member/job");
		return mv;
	}
}
