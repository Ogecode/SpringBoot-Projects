package com.ogbonnaya.CRUD_project.services;

import com.ogbonnaya.CRUD_project.model.Employee;

import java.util.List;

public interface EmployeeService {


    Employee saveEmployee(Employee employee);

    // you do not need to add an argument to get all employee
    List<Employee> getAllEmployee();

    // method for get employee by ID, pass ID as the method argument

    Employee getEmployeeById(Long Id);


    //update employee method,
    Employee updateEmployee(Employee employee, Long Id);

    //Delete employee employee method

    void deleteEmployee(long id);

}
