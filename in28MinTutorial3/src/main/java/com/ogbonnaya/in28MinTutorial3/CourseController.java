package com.ogbonnaya.in28MinTutorial3;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
                new Course(2, "Learn Java", "Ogechi"),
                new Course(2, "Learn Kotlin", "Ogechi"),
                new Course(2, "Learn Nestjs", "Ogechi"),
                new Course(2, "Learn AWS", "Ogechi"),
                new Course(3, "Learn Springboot", "Ogechi"),
                new Course(4, "LearnJavascript", "Ogechi")
        );
    }
}