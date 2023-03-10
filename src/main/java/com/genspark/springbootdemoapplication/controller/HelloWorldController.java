package com.genspark.springbootdemoapplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("world")
    public String home(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "<h1>Hello, " + name + "!</h1>";
    }
}
