package com.cml.springMvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    //Controller method to show initial HTML form
        @RequestMapping("/showForm")
    public String showForm(){
        return "helloworldForm";
    }
    //Controller method to process the HTML form

    @RequestMapping("/processForm")
    public String processForm(){
        return "hello";
    }

}
