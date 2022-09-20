package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping(path = "/hello-world", method = RequestMethod.GET)
    public String helloWorld(){
        return "hello-world";
    }

    @RequestMapping(path = "/hello-Sanjiv", method = RequestMethod.GET)
    public String helloSanjiv(){
        return "hello-Sanjiv";
    }
}
