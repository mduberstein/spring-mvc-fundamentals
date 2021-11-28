package com.pluralsight.conference.controller;

import com.pluralsight.conference.model.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
public class RegistrationController {
    // @GetMapping("registration")
    @RequestMapping(value = "registration", method = RequestMethod.GET)
    public String getRegistration(@ModelAttribute("registration") Registration registration) {
        // will do internal lookup to the registration page using the rules
        // for the view resolver defined in src/main/resources/application.properties
        return "registration";
    }
}
