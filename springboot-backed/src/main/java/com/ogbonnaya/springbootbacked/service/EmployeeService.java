package com.ogbonnaya.springbootbacked.service;

import com.ogbonnaya.springbootbacked.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee getEmployeeById(long Id);
    Employee updateEmployee(Employee employee, long Id);
    void deleteEmployee(long Id);

}
