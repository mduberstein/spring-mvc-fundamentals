package com.pluralsight.conference.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller()
public class GreetingController {
    @GetMapping("greeting")
    public String greeting (Map<String, Object> model) {
        // will display "Hello Bryan" instead of ${message} in the greeting.jsp page
        model.put("message", "Hello from Greetings Controller, Bryan");
        // this will cause greeting.jsp page to be displayed
        return "greeting";
    }

    @GetMapping("thyme")
    public String thyme (Map<String, Object> model) {
        // will display "Hello from Greetings Controller, Thymeleaf" instead of ${message} in the thyme.html page
        model.put("message", "Hello from Greetings Controller, Thymeleaf");
        // this will cause greeting.jsp page to be displayed
        return "thyme";
    }

}
