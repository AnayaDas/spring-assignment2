package com.training.springassignment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COURSELIST")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="course_id")
	private int course_id;
	
	@Column(name="course_name")
	private String course_name;
	
	@Column(name="fees")
	private int fees;
	
	@Column(name="course_duration")
	private int course_duration; 
	
	@Column(name="startDate")
	private String startDate;;
	
	public Course() {
		
	}
	public Course(String course_name, int fees, int course_duration, String startDate) {
		this.course_name = course_name;
		this.fees = fees;
		this.course_duration = course_duration;
		this.startDate = startDate;
	}
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public int getCourse_duration() {
		return course_duration;
	}
	public void setCourse_duration(int course_duration) {
		this.course_duration = course_duration;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	
	
}
