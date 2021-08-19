package com.example.basicwebmvcxmldriven.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm()    {
        return "my-form";
    }


    @RequestMapping("/processForm")
    public String processForm(@RequestParam ("studentName") String theName, Model model)    {
        theName=theName.toUpperCase();
        model.addAttribute("message", theName);
        return "process-form";
    }
}
