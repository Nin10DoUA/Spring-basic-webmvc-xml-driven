package com.example.basicwebmvcxmldriven.controllers;


import com.example.basicwebmvcxmldriven.models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/showForm")
    public String showForm(Model theModel)    {
        Student theStudent = new Student();
        theModel.addAttribute("student", theStudent);
        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student theStudent) {
        System.out.println(theStudent.getFirstName());
        System.out.println(theStudent.getLastName());
        System.out.println(theStudent.getCountry());
        System.out.println(theStudent.getCountryDropDown());
        return "student-confirmation";
    }

}
