package com.example.springboot.thymeleaf.controller;

import com.example.springboot.thymeleaf.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class DemoController {

    @Value("${countries}")
    private List<String> countries;

    @Value("${languages}")
    private List<String> languages;

    @Value("${operatingSystems}")
    private List<String> operatingSystems;

    @InitBinder
    public void initBinder(WebDataBinder dataBinder){
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class,stringTrimmerEditor);
    }
    //create a mapping for "/hello"
    @GetMapping("/hello")
    public String sayHello(Model theModel) {
        theModel.addAttribute("theDate", java.time.LocalDateTime.now());
        return "helloWorld";
    }

    //need a method to show initial form
    @RequestMapping("/showForm")
    public String showForm(Model theModel) {
        Student theStudent = new Student();
        theModel.addAttribute("student", theStudent);
        theModel.addAttribute("countries", countries);
        theModel.addAttribute("languages", languages);
        theModel.addAttribute("operatingSystems",operatingSystems);
        return "helloworld-form";
    }

    //need a method to process the HTML form
    @RequestMapping("/processForm")
    public String processForm(HttpServletRequest request, Model model) {
        String studentName = request.getParameter("studentName");
        studentName = studentName.toUpperCase();
        model.addAttribute("message", studentName);
        return "helloWorld";
    }

    @RequestMapping("/processFormTwo")
    public String processFormTwo(@RequestParam("studentName") String studentName, Model model) {
        studentName = studentName.toUpperCase();
        model.addAttribute("message", studentName);
        return "helloWorld";
    }
    @RequestMapping("/processFormThree")
    public String processFormThree(@Valid @ModelAttribute("student") Student theStudent, BindingResult theBindingResult, Model theModel) {
        if(theBindingResult.hasErrors()){
            theModel.addAttribute("countries", countries);
            theModel.addAttribute("languages", languages);
            theModel.addAttribute("operatingSystems",operatingSystems);
            return "helloworld-form";
        }
        else {
            return "helloWorld";
        }
    }

}
