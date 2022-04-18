package com.training.springassignment.controller;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.training.springassignment.model.Course;
import com.training.springassignment.model.User;
import com.training.springassignment.service.CourseService;
import com.training.springassignment.service.UserService;
@Controller
public class UserController {
	@Autowired
	UserService service;
	
	@Autowired
	CourseService courseService;

	@GetMapping("/")
	public ModelAndView homePage() {
		ModelAndView mav = new ModelAndView("home");
		return mav;
	}
	
	@GetMapping("/login")
	public ModelAndView loginPage() {
		ModelAndView mav = new ModelAndView("login");
		return mav;
	}
	
	@GetMapping("/register")
	public ModelAndView registrationPage() {
		ModelAndView mav = new ModelAndView("registration");
		return mav;
	}
	
	@PostMapping("/save")
	public ModelAndView saveUser(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("success");
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		User user = new User(userName,password);
		service.saveUser(user);
		return mav;
	}
	
	@PostMapping("/courses")
	public ModelAndView showCourses(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("fail");
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		if(service.validateUser(userName, password)) {
			mav.setViewName("courses");
			List<Course> courseList = courseService.getCourseList();
			System.out.println("CourseList");
			mav.addObject("courseList",courseList);
		}
		return mav;
	}

}
