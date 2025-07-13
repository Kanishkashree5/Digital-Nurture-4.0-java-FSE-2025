package com.example.coursemanagement.repository;

import com.example.coursemanagement.model.Course;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class CourseRepository {
    private final Map<Integer, Course> courses = new HashMap<>();

    public List<Course> findAll() {
        return new ArrayList<>(courses.values());
    }

    public Course findById(int id) {
        return courses.get(id);
    }

    public void save(Course course) {
        courses.put(course.getId(), course);
    }

    public void deleteById(int id) {
        courses.remove(id);
    }
}

