package com.example.springboot.thymeleaf.dao;

import com.example.springboot.thymeleaf.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
