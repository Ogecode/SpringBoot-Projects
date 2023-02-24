package com.ogbonnaya.springbootbacked.impl;

import com.ogbonnaya.springbootbacked.model.Employee;
import com.ogbonnaya.springbootbacked.repositories.EmployeeRepository;
import com.ogbonnaya.springbootbacked.service.EmployeeService;
import jakarta.annotation.Resource;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;


@Service
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeRepository employeeRepository;
    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
        super();
        this.employeeRepository= employeeRepository;

    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(long Id) {
        return employeeRepository.findById(Id).orElseThrow();

    }

    @Override
    public Employee updateEmployee(Employee employee, long Id) {
        return null;
    }

    @Override
    public void deleteEmployee(long Id) {

    }
}
