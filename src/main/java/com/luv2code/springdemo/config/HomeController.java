package com.luv2code.springdemo.config;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String showPage(){
        return "main-menu";
    }
    //as you know, main-menu will be parallel to name
    //in servlet > main-menu.jsp


    @RequestMapping("/showForm")
    public String showForm(){
       return "helloworld-form";
    }



    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }
}
