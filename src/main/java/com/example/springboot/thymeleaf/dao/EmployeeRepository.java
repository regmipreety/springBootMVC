package com.example.springboot.thymeleaf.dao;

import com.example.springboot.thymeleaf.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    //sort by last name
    public List<Employee> findAllByOrderByLastNameAsc();
}
