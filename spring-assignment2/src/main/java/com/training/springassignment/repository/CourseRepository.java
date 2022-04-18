package com.training.springassignment.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.training.springassignment.model.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course, Integer>{

}
