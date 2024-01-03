package com.example.demo.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event.ID;

import com.example.demo.binding.Course;

public interface CourseRepository extends JpaRepository<Course, Serializable> {

}
