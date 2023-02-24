package com.ogbonnaya.CRUD_project2.repositaries;

import com.ogbonnaya.CRUD_project2.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepositary extends JpaRepository<Employee, Integer> {
}
