package com.ogbonnaya.CRUD_project.repositary;

import com.ogbonnaya.CRUD_project.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepositories extends JpaRepository<Employee, Long> {

}
