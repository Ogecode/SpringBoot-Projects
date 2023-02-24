package com.Ogbonnaya.Springbootfirstapp;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/student")
    public Student getStudent(){
        return  new Student("Ogechi", "Ogbonnaya", "test@gmail.com", "09088867", 7);
    }
// for list or arays, use the below method
    public List<Student> getStudents(){
        List<Student> student = new ArrayList<>();
        student.add(new Student("bukk", "Kadri", "test@gmail.com", "09045700", 90));
        student.add(new Student("Dami", "Kadri", "test@gmail.com", "09045700", 10));
        student.add(new Student("bukk", "Maria", "test@gmail.com", "09045700", 670));
        student.add(new Student("Odesola", "Kadri", "test@gmail.com", "09045700", 156));
        student.add(new Student("Funke", "Kadri", "test@gmail.com", "09045700", 34));
        student.add(new Student("bukk", "Buloki", "test@gmail.com", "09045700", 73));
        student.add(new Student("Alome", "Daniel", "test@gmail.com", "09045700", 16));
        return student;
    }

    // for path variable use the below method
    @GetMapping("/student/{firstName}/{lastName}/{email}/{telephoneNo}/{age}")
    public  Student studentPathVariable(@PathVariable("firstName") String firstName, @PathVariable("lastNAme") String lastName,
                                        @PathVariable("email") String email, @PathVariable("telephoneNo") String telephoneNo,
                                        @PathVariable("age") int age){
        return new Student(firstName, lastName, email, telephoneNo, age);
    }
}
