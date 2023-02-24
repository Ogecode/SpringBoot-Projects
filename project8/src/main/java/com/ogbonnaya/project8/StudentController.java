package com.ogbonnaya.project8;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/student")
    public Student getStudent(){
        return  new Student("oge", "ogbonnaya","test@gmail.com", "23049888");

    }
  @GetMapping("/students")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("bukk", "Kadri", "test@gmail.com", "09045700"));
        students.add(new Student("Dami", "Kadri", "test@gmail.com", "09045700"));
        students.add(new Student("bukk", "Maria", "test@gmail.com", "09045700"));
        students.add(new Student("Odesola", "Kadri", "test@gmail.com", "09045700"));
        students.add(new Student("Funke", "Kadri", "test@gmail.com", "09045700"));
        students.add(new Student("bukk", "Buloki", "test@gmail.com", "09045700"));
        students.add(new Student("Alome", "Daniel", "test@gmail.com", "09045700"));
        return students;
    }
    // for pathVariable
    // http://localhost:8080/ogechi/ogbonnaya
    @GetMapping("{firstName}/{lastName}")
    public Student studentPathvariable(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName){
        return new Student(firstName,lastName);
    }

    //rest rest API to handle query parameters
    //http://localhost:8080/student2/query?firstNmae=Ogechi&lastName=Ogbonnaya(run it like so on the browser)
    @GetMapping("/student/query")
    public Student studentQueryParam(@RequestParam(name ="firstName") String firstName,
                                     @RequestParam(name = "lastName") String lastName){
        return new Student(firstName, lastName);
    }
}
