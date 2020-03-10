package com.example.hellocontroller.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping
    public String sayHello(@RequestParam(required = false, defaultValue = "World") String name){
        return String.format("Hello %s, from sayHello", name);
    }

    @GetMapping("/{name}")
    public String sayHelloPath(@PathVariable(required = false) String name){
        return String.format("Hello %s, from sayHelloPath", name == null ? "World" : name);
    }

    @PostMapping
    public String sayHelloPost(@RequestBody String name){
        return String.format("Hello %s, from sayHelloPost", name);
    }
}