package com.cssl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NikeControll {

    @RequestMapping("/Nikefront")
    public String frontIndex(){return "index";}
}
