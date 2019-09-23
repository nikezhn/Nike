package com.cssl.controller;

import com.cssl.pojo.Nike_color;
import com.cssl.service.UsersClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsersController {

    @Autowired
    UsersClientService usersClientService;

    @RequestMapping("findAll")
    List<Nike_color> findAll(){
        System.out.println("**********"+usersClientService==null);
        List<Nike_color> list=usersClientService.findAll();
        System.out.println(list);
        return list;
    }


}
