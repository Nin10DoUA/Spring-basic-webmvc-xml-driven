package com.example.basicwebmvcxmldriven.controllers;


import com.example.basicwebmvcxmldriven.models.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;


@Controller
@RequestMapping("/customer")
public class CustomerController {

    @RequestMapping("/showCustomerForm")
    public String showCustomerForm(Model model)    {
        model.addAttribute("customer", new Customer());
        return "customer-form";
    }

    @RequestMapping("/processForm")
    public String customerProcessForm(@Valid @ModelAttribute("customer") Customer theCustomer, BindingResult bindingResult) {
        if(bindingResult.hasErrors())    {
            return "customer-form";
        } else {
            return "customer-confirmation";
        }
    }
}
