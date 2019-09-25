package com.cssl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NikeController {

    @RequestMapping("/NikeAfter")
    public String index(){
        return "index";
    }

}
