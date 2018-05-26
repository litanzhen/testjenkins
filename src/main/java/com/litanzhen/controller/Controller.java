package com.litanzhen.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/test")
    public String testJenkins(){
        return "testJenkins";
    }
}
