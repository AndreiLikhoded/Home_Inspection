package com.example.homeinspection.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
    @GetMapping("services-page")
    public String products(){
        return "/services-page";
    }
}
