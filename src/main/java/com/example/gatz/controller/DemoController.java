package com.example.gatz.controller;

import org.springframework.boot.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {

    @RequestMapping("/hello")
    public String home() {
        return "Hello World!";
    }

}