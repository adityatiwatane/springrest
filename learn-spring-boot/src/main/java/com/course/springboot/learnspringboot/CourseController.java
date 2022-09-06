package com.course.springboot.learnspringboot;
import java.util.Arrays;
import java.util.List; 

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
publuic class CourseController {

    //courses
    @RequestMapping("/courses")
   public List<Course> retrieveAllCourses() {
        return Arrays.asList(
            new Course(1,"Learn AWS", "course")
            new Course(2,"Learn DevOps", "course")
        );
   }
}