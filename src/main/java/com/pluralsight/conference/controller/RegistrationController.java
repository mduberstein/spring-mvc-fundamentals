package com.pluralsight.conference.controller;

import com.pluralsight.conference.model.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class RegistrationController {
    // @GetMapping("registration") // ALT_1
    @RequestMapping(value = "registration", method = RequestMethod.GET) // ALT_2
    public String getRegistration(@ModelAttribute("registration") Registration registration) {
        // will do internal lookup to the registration page using the rules
        // for the view resolver defined in src/main/resources/application.properties
        return "registration";
    }

    @PostMapping("registration")
//    @RequestMapping(value = "registration", method = RequestMethod.POST) // ALT_2
    public String addRegistration(@Valid @ModelAttribute("registration") Registration registration,
                                  BindingResult result) {
        if(result.hasErrors()){
            System.out.println("There were errors.");
            return "registration";
        }
        System.out.println("Registration: " + registration.getName());
        return "redirect:registration";
    }
}
