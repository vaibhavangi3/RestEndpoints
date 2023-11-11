package com.springrest.springrest.controller;

import com.springrest.springrest.entity.Course;
import com.springrest.springrest.service.CourseService;
import com.springrest.springrest.service.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    public CourseService GetService;

    @GetMapping("/home")
    public String Home(){
        return "This is my Home";
    }

    @GetMapping("/courses")
    public List<Course> getCourses(){
        return this.GetService.getCourses();
    }

    @GetMapping("/courses/{courseId}")
    public Course getSingleCourse(@PathVariable int courseId){
        return this.GetService.getCourse(courseId);
    }
}
