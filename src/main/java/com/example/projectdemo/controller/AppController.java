package com.example.projectdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.example.projectdemo.model.User;


import java.util.ArrayList;
import java.util.List;

@Controller

public class AppController {


    @RequestMapping("/index")
    public String indexGet() {
        return "/index";
    }

    @RequestMapping("/free-check")
    public String freeCheckGet() {
        return "/free-check";
    }




}
