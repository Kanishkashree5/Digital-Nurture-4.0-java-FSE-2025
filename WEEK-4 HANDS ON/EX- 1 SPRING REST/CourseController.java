package com.example.coursemanagement.controller;

import com.example.coursemanagement.model.Course;
import com.example.coursemanagement.service.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    private final CourseService service;

    public CourseController(CourseService service) {
        this.service = service;
    }

    @GetMapping
    public List<Course> getAllCourses() {
        return service.getAllCourses();
    }

    @GetMapping("/{id}")
    public Course getCourseById(@PathVariable int id) {
        return service.getCourseById(id);
    }

    @PostMapping
    public String addCourse(@RequestBody Course course) {
        service.addCourse(course);
        return "Course added successfully!";
    }

    @DeleteMapping("/{id}")
    public String deleteCourse(@PathVariable int id) {
        service.deleteCourse(id);
        return "Course deleted successfully!";
    }
}

