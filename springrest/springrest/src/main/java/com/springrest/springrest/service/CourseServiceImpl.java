package com.springrest.springrest.service;

import com.springrest.springrest.entity.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CourseServiceImpl implements CourseService{

    List<Course> list;

    public CourseServiceImpl(){
        list = new ArrayList<>();
        list.add(new Course(1,"C# Course","This is a C# Course"));
        list.add(new Course(2, "Java Course", " this is a java course"));
    }

    @Override
    public List<Course> getCourses() {
        return list;
    }

    @Override
    public Course getCourse(int courseId) {
        Course c= null;

        for(Course course:list){
            if(course.getId()==courseId){
                c=course;
            }
        }
        return c;
    }
}
