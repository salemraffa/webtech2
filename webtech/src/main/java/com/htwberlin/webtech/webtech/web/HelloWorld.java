package com.htwberlin.webtech.webtech.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloWorld {
    @GetMapping("/")
    public ModelAndView index() {
        return new ModelAndView("helloworld");
    }

}

