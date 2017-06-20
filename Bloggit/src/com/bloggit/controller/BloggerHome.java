package com.bloggit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import entity.UserMaster;
/*
 * author: Aniket
 * 
 */

@Controller
public class BloggerHome {
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
 
		UserMaster user = new UserMaster("firstuser");
		session.save(user);
 
		session.getTransaction().commit();
		session.close();
		 
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** Hello </h3> Message **********</div><br><br>";
		return new ModelAndView("welcome", "message", message);
	}

}
