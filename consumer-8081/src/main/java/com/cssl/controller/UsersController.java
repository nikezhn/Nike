package com.cssl.controller;

import com.cssl.pojo.Nike_color;
import com.cssl.service.INike_colorClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
public class UsersController {

    @Autowired
    INike_colorClientService iNike_colorClientService;

    @RequestMapping("/findAll")
    String findAll(){
        List<Nike_color> list=iNike_colorClientService.findAll();
        System.out.println(list);
        return "index";
    }

    @RequestMapping("user")
    String user(){
        return "user";
    }

}
