package com.example.demo.controller;

import com.example.demo.dto.HelloDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/")
    public HelloDto hello() {
        return new HelloDto("hello");
    }
}
