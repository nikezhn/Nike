package com.cssl.controller;

import com.cssl.pojo.Nike_color;
import com.cssl.service.INike_colorClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UsersController {

    @Autowired
    INike_colorClientService iNike_colorClientService;

    @ResponseBody
    @RequestMapping("findAll")
    List<Nike_color> findAll(){
        List<Nike_color> list=iNike_colorClientService.findAll();
        System.out.println(list);
        return list;
    }

    @RequestMapping("user")
    String user(){
        return "user";
    }

}
