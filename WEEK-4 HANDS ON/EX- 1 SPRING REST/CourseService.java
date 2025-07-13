package com.example.coursemanagement.service;

import com.example.coursemanagement.model.Course;
import com.example.coursemanagement.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    private final CourseRepository repository;

    public CourseService(CourseRepository repository) {
        this.repository = repository;
    }

    public List<Course> getAllCourses() {
        return repository.findAll();
    }

    public Course getCourseById(int id) {
        return repository.findById(id);
    }

    public void addCourse(Course course) {
        repository.save(course);
    }

    public void deleteCourse(int id) {
        repository.deleteById(id);
    }
}
