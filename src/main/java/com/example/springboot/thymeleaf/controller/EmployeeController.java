package com.example.springboot.thymeleaf.controller;

import com.example.springboot.thymeleaf.model.Employee;
import com.example.springboot.thymeleaf.services.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        return "employees/list-employees";

    }
    @GetMapping("/addEmployee")
    public String addEmployee(Model theModel){
        Employee theEmployee = new Employee();
        theModel.addAttribute(theEmployee);
        return "employees/add-employee";
    }
    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employee") Employee theEmployee){
        employeeService.save(theEmployee);
        return "redirect:/employees/list";
    }
    @GetMapping("/edit")
    public String editForm(@RequestParam("employeeId") int theId, Model theModel){
        Employee theEmployee = employeeService.findById(theId);
        theModel.addAttribute("employee", theEmployee);
        return "employees/employee-form";
    }
    @GetMapping("/delete")
    public String deleteEmployee(@RequestParam("employeeId") int id){
        employeeService.deleteById(id);
        return "redirect:/employees/list";
    }
}
