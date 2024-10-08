package com.neotericdockerlearning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloWorld {
    @GetMapping(value = "api/hello",consumes = "application/json",produces = "application/json")
    public String getHelloWorld (){
        System.out.println("happy dasara festival");
        return "happy dasara with neoteric";
    }
}