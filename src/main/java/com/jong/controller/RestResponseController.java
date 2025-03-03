package com.jong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RestResponseController {

    @GetMapping("/restResponse/normal")
    public ModelAndView normal(){
        return new ModelAndView("/index");
    }

    @GetMapping("/restResponse/test2")
    public @ResponseBody String responseBody(){
        return "test2";
    }

}
