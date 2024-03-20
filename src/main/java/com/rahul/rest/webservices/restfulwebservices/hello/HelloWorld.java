package com.rahul.rest.webservices.restfulwebservices.hello;

import com.rahul.rest.webservices.restfulwebservices.helloworld.HelloWorldBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @GetMapping(path = "/hello-world")
    public String helloworld(){
        return "Hello World!";
    }

    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloworldbean(){
        return new HelloWorldBean("Hello World!");
    }
}
