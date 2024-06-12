package com.techalv.spring_boot_cicd.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


    public class HelloController {
        @GetMapping("/welcome")
        public String getMessage(){
            return "Welcome to Tech soft !!";
        }
    }

