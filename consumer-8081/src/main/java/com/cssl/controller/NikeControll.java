package com.cssl.controller;

import com.cssl.service.NikeClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NikeControll {

    @Autowired
    NikeClientService nike_ClientService;

    @RequestMapping("/frontIndex")
    public String frontIndex(){return "index";}
}
