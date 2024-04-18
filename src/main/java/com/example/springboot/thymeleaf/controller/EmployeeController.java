package com.example.springboot.thymeleaf.controller;

import com.example.springboot.thymeleaf.model.Employee;
import com.example.springboot.thymeleaf.services.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService theEmploeeService){
        employeeService = theEmploeeService;
    }

    //add mapping for listing the employees

    @GetMapping("/list")
    public String listEmployee(Model theModel){
        //get employee from DB
        List<Employee> theEmployees = employeeService.findAll();
        //add employee to the spring model
        theModel.addAttribute("employees", theEmployees);
        return "list-employees";

    }
}
