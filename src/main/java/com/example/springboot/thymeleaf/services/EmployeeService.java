package com.example.springboot.thymeleaf.services;

import com.example.springboot.thymeleaf.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);
}
