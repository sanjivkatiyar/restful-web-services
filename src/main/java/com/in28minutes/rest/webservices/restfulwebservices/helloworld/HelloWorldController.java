package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @RequestMapping(path = "/hello-world", method = RequestMethod.GET)
    public String helloWorld(){
        return "hello-world";
    }

    @GetMapping(path = "/hello-Sanjiv")
    public String helloSanjiv(){
        return "hello-Sanjiv";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("hello-world");
    }

    @GetMapping(path = "/hello-world/pathvariable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name){
        return new HelloWorldBean(String.format("hello-world %s", name));
    }
}
