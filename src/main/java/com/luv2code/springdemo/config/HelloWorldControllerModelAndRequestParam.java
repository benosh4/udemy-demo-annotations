package com.luv2code.springdemo.config;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldControllerModelAndRequestParam {

    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }


    @RequestMapping("/processForm")
    public String processForm(){

        return "helloworld";
    }

    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request,Model m){

        String name = request.getParameter("studentName"); //name should be in html page
        //read  the request from html

        // convert the data
       name = name.toUpperCase();

       String result = "yo!"  + name;
        //create the message

         m.addAttribute("message", result ); //the message appear in helloworld.jsp
        //add message to the model


        return "helloworld";
    }

    //each method need a page.jsp

    //new controller method to read from data and change it and add to model


//another example is to work with requestParam

    @RequestMapping("/processFormVersionThree")
    public String processFroVersionThree(@RequestParam("studentName") String thename , Model m){

        // convert the data
        thename = thename.toUpperCase();

        String result = "yo!"  + thename;
        //create the message

        m.addAttribute("message", result ); //the message appear in helloworld.jsp
        //add message to the model


        return "helloworld";
    }



}

