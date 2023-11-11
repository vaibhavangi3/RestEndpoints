package com.springrest.springrest.service;

import com.springrest.springrest.entity.Course;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CourseService {
    public List<Course> getCourses();

    public Course getCourse(int courseId);
}
