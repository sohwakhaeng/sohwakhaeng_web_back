package me.shinhong.sohwakhaeng.controller;

import me.shinhong.sohwakhaeng.model.User;
import me.shinhong.sohwakhaeng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MyController {

    @Autowired
    public final UserService userService;

    public MyController(UserService userService) {
        this.userService = userService;
    }

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

    @GetMapping("/signup")
    public String signup(Model model){
        model.addAttribute("user", new User());
        return "signup";
    }

    @GetMapping("/manager")
    public String getManager(Model model){
        model.addAttribute("users", userService.getAllUsers());
        return "manager";
    }

    @PostMapping("/manager")
    public String postManager(@ModelAttribute User user, Model model){
        userService.createUser(user);
        model.addAttribute("users", userService.getAllUsers());
        return "manager";
    }

    @GetMapping(value = "/manager/delete/{id}")
    public String deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
        return "redirect:/manager";
    }


}
