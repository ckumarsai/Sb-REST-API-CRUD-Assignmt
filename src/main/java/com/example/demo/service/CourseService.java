package com.example.demo.service;

import java.util.List;

import com.example.demo.binding.Course;

public interface CourseService {
	public String upsert(Course course);
	public List<Course> getAllCorses();
	public Course getById(Integer cid);
	public String deleteById(Integer id);

}
