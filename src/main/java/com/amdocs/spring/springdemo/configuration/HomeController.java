package com.amdocs.spring.springdemo.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Home redirection to swagger api documentation 
 */
@Controller
public class HomeController {


    @RequestMapping(value = "/")
    public String index() {
        System.out.println("swagger-ui.html");
        return "index";
    }

    @GetMapping(value = "/home")
    public String home(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model){
        model.addAttribute("name", name);
        return "index";
    }
}
