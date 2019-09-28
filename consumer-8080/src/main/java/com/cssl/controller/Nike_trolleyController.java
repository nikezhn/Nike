package com.cssl.controller;

import com.cssl.pojo.Nike_trolley;
import com.cssl.service.NikeClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class Nike_trolleyController {


    @Autowired
    NikeClientService nikeClientService;

    @ResponseBody
    @RequestMapping("/nike_trolley/findAll")
    public List<Nike_trolley> findAll() {
        List<Nike_trolley> nike_trolley = nikeClientService.findNike_trolley();
        return nike_trolley;
    }
}
