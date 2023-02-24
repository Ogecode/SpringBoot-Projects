package com.ogbonnaya.SpringBootTutorial.service;

import com.ogbonnaya.SpringBootTutorial.entity.Department;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> fetchDepartmentList();


    Department fetchDepartmentById(Long departmentId);

    public void deleteDepartmentById(Long departmentId);
}
