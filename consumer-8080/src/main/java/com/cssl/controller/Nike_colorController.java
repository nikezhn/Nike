package com.cssl.controller;

import com.cssl.pojo.Nike_color;
import com.cssl.service.NikeClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class Nike_colorController {

    @Autowired
    NikeClientService nikeClientService;

    @RequestMapping("/nike_color/findAll")
    public List<Nike_color> findAll(){
        List<Nike_color> nike_color = nikeClientService.findNike_color();
        return nike_color;
    }
}
