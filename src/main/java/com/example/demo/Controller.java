package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    public String sayHello() {
        return "Hi";
    }
}
