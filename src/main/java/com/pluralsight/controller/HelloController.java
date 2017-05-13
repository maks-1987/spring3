package com.pluralsight.controller;

/**
 * Created by Max on 13.05.2017.
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping(value ="/greeting")
    public String sayHello (Model model) {

        model.addAttribute("greeting", "Hello World");

        return "hello";
    }
}
