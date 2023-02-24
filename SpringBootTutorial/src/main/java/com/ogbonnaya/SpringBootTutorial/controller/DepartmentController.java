package com.ogbonnaya.SpringBootTutorial.controller;

import com.ogbonnaya.SpringBootTutorial.entity.Department;
import com.ogbonnaya.SpringBootTutorial.service.DepartmentService;
import com.ogbonnaya.SpringBootTutorial.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;
    private Object department;


    @PostMapping("/api/v1/departments")
public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);
}
@GetMapping("/api/v1/all")
public List<Department> fetchDepartmentList(){
       return departmentService.fetchDepartmentList();
}

@GetMapping("{id}")
public Department fetchDepartmentById(@PathVariable Long departmentId){
        return departmentService.fetchDepartmentById(departmentId);

}
@DeleteMapping("")
    public String deleteDepartmentByID(@PathVariable("id")Long departmentId){
        departmentService.deleteDepartmentById(departmentId);
      return "Department deleted succussfully";
}
}
