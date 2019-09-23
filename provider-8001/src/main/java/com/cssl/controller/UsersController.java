package com.cssl.controller;

import com.cssl.pojo.Nike_color;
import com.cssl.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsersController {

    @Autowired
    UsersService usersService;

    @GetMapping("findAll")
    List<Nike_color> findAll(){
        System.out.println("1:"+usersService==null);
        return  usersService.findAll();
    }
}
