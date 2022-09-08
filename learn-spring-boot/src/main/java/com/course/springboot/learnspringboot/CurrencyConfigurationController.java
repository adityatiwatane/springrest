package com.course.springboot.learnspringboot;

import java.util.Arrays;

@RestController
public class CurrencyControllerConfiguration {
    public List<Course> retriveAllCourses() {

        @RequestMapping("/courses")
        public List<Course> retriveAllCourses() {
            return Arrays.asList(
                new Course(1,"Learn AWS", "course"),
                new Course(2,"Learn Devops", "course"),
                new Course(3,"Learn Learn Azure", "course"),
                new Course(4,"Learn GCP", "course")
            );
        }
    }
}