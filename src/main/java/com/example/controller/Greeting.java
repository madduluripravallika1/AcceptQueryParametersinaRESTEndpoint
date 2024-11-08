package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greeting {
    @GetMapping("/greet")
    public  String method1(@RequestParam String name ,@RequestParam int age){
        System.out.println("Hello ," + name +"." +"You are "+age+" years old " + "!");
      return   "Hello ," + name +"." +"You are "+age+" years old " + "!";
    }

}

//Qustion:
//Accept Query Parameters in a REST Endpoint
//Problem: Create an endpoint /greet that accepts a GET request with query parameters name and age. It should return a message like "Hello, {name}. You are {age} years old!".
//
//Objective: Understand how to handle query parameters in Spring Boot.
//
//        Curl:-curl --location 'http://localhost:8080/greet?name=Pravallika&age=12'