package com.example.projectdemo.controller;

import com.example.projectdemo.service.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AppController {

    @Autowired
    private UserDetailsServiceImpl userDetailsService;


    @RequestMapping("/")
    public String indexGet() {
        return "index";
    }

    @RequestMapping("/free-check")
    public String freeCheckGet(@RequestParam(name="name", required=false, defaultValue=" Unknown") String name, Model model) {
        model.addAttribute("name", name);
        return "free-check";
    }

//    @RequestMapping("/free-check")
//    public String freeCheckGet() {
//        return "/free-check";
//    }

    @RequestMapping("/sign-in")
    public String login() {
        return "sign-in";
    }
//
    @GetMapping("/userView")
    public String userView(@RequestParam(name="name") String name, Model model) {
        model.addAttribute("name", name);
        return "/userView";
    }
//

//    @RequestMapping("/userView")
//    public String userView() {
//        return "/userView";
//    }





}
