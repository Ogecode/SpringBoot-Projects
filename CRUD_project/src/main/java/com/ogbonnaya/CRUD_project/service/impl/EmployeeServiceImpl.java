package com.ogbonnaya.CRUD_project.service.impl;

import com.ogbonnaya.CRUD_project.exception.ResourceNotFoundException;
import com.ogbonnaya.CRUD_project.model.Employee;
import com.ogbonnaya.CRUD_project.repositary.EmployeeRepositories;
import com.ogbonnaya.CRUD_project.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


// use the implement keyword to implement the EmployeeService interface created in service package
// @Service annotation for service class
// define your methods here amd pass the Employee object as an argument
// inject dependency
@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepositories employeeRepositories;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepositories employeeRepositories) {
        super();
        this.employeeRepositories = employeeRepositories;
    }

    @Override
    public Employee saveEmployee(Employee employee){
        return employeeRepositories.save(employee);

    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepositories.findAll();

    }

    @Override
    public Employee getEmployeeById(Long Id) {
        //option 1
//       Optional<Employee> employee = employeeRepositories.findById(Id);
//       if(employee.isPresent()){
//           return employee.get();
//       } else{
//           throw new ResourceNotFoundException("Employee", "Employee", "Id");
//       }

        // option2 lombok method
        return employeeRepositories.findById(Id).orElseThrow(() ->
                new ResourceNotFoundException("Employee", "Employee", "Id"));

    }

    @Override
    public Employee updateEmployee(Employee employee, Long Id) {
        // check if employee with Id exist in the database or not
        Employee existingEmployee = employeeRepositories.findById(Id).orElseThrow(() ->
                new ResourceNotFoundException("Employee", "Employee", "Id"));

        existingEmployee.setFirstName(employee.getFirstName());
        existingEmployee.setLastName(employee.getLastName());
        existingEmployee.setEmail(employee.getEmail());
       // save existing employee to DB

        employeeRepositories.save(existingEmployee);
        return existingEmployee;
    }

    @Override
    public void deleteEmployee(long id) {
        // check if Id  exists in the DB with the below exception
        employeeRepositories.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee", "Employee","Id"));
        employeeRepositories.deleteById(id);
    }


}
