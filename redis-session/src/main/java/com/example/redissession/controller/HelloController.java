package com.example.redissession.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello(HttpSession session) {
        session.setAttribute("hello", "jo");
        return "hello jo";
    }
}
