package com.training.springassignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.springassignment.model.Course;
import com.training.springassignment.repository.CourseRepository;

@Service
public class CourseService {
	@Autowired
	CourseRepository repository;
	
	public List<Course> getCourseList(){
		return (List<Course>)repository.findAll();
	}

}
