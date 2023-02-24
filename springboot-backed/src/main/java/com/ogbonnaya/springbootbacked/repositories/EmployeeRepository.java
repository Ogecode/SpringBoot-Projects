package com.ogbonnaya.springbootbacked.repositories;

import com.ogbonnaya.springbootbacked.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
