package com.ogbonnaya.CRUD_project.controller;

import com.ogbonnaya.CRUD_project.model.Employee;
import com.ogbonnaya.CRUD_project.services.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {
    // add a dependency which is employee service

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        super();
        this.employeeService = employeeService;
    }
    // build create employee rest API   you use response entity class so you can provide complete  response to the class
    @PostMapping("/save")
    public ResponseEntity <Employee> saveEmployee(@RequestBody Employee employee){
        return  new ResponseEntity<Employee> (employeeService.saveEmployee(employee), HttpStatus.CREATED);
    }

    //Build get All Employee Rest Api
    //firstly make changes on the service interface
    @GetMapping("/getAll")
    public List<Employee> getAllEmployee(){
        return  employeeService.getAllEmployee();
    }

    //Get employee by Id Rest API
    //http://localhost:8086/api/v1/employee/1
    @GetMapping("{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") long employeeId){
        return new ResponseEntity<Employee>(employeeService.getEmployeeById(employeeId), HttpStatus.OK);

    }

    //build update Employee Rest API
    //http://localhost:8086/api/v1/employee/1
    @PutMapping("{id}")

    public ResponseEntity<Employee> updateEmployee(@PathVariable("id") long id
                                                  , @RequestBody Employee employee){
        return new ResponseEntity<Employee>(employeeService.updateEmployee(employee, id), HttpStatus.OK);

    }

    //build API  to delete Employee by ID
    //http://localhost:8086/api/v1/employee/1

    @DeleteMapping("/{id}")
//delete the employee from DB
    public  ResponseEntity<String> deleteEmployee(@PathVariable("id") long id){
        employeeService.deleteEmployee(id);

        return  new ResponseEntity<String>("Employee deleted successfully!", HttpStatus.OK);

    }

}
