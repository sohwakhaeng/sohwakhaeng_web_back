package me.shinhong.sohwakhaeng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/")
    public String main(){
        return "index";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/popup")
    public String popup(){
        return "popup";
    }

    @GetMapping("/start")
    public String start(){
        return "start";
    }

}
