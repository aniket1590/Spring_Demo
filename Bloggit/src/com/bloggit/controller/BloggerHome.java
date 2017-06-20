package com.bloggit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
/*
 * author: Aniket
 * 
 */

@Controller
public class BloggerHome {
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
		 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello </h3> Message **********</div><br><br>";
		return new ModelAndView("welcome", "message", message);
	}

}
