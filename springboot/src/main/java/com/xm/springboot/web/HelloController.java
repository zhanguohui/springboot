package com.xm.springboot.web;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello world!!!";
    }
}
