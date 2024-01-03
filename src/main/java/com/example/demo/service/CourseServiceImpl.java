package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.binding.Course;
import com.example.demo.repo.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	private CourseRepository courseRepo;

	@Override
	public String upsert(Course course) {
		courseRepo.save(course);
		return "success";
	}

	@Override
	public List<Course> getAllCorses() {
		return courseRepo.findAll();
	}

	@Override
	public Course getById(Integer cid) {
		Optional<Course> findById=  courseRepo.findById(cid);
		
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public String deleteById(Integer id) {
		if(courseRepo.existsById(id)) {
			courseRepo.deleteById(id);
			return "delete success";
		}else {
			return "NO record Found";
		}
	}

}
