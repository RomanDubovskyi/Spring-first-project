package com.dev.dubovskyi.firstproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @RequestMapping("/")
    public String getHomepage() {
        return "index";
    }
}
