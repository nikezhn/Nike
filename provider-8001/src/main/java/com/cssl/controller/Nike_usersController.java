package com.cssl.controller;


import com.cssl.pojo.Nike_users;
import com.cssl.service.INike_usersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author aguang
 * @since 2019-09-24
 */
@Controller
@RequestMapping("/nike_users")
public class Nike_usersController {

    @Autowired
    INike_usersService iNike_usersService;

    @RequestMapping("/findAll")
    public List<Nike_users> findAll(){
        System.out.println("进入后台nike_size的findAll方法");
        return iNike_usersService.list();
    }

    @RequestMapping("/add")
    public boolean add(Nike_users nike_users){
        System.out.println("进入后台nike_users的add方法");
        return iNike_usersService.save(nike_users);
    }

    @RequestMapping("/update")
    public boolean update(Nike_users nike_users){
        System.out.println("进入后台nike_users的update方法");
        return iNike_usersService.updateById(nike_users);
    }

    @RequestMapping("/del")
    public boolean del(int id){
        System.out.println("进入后台nike_size的del方法");
        return iNike_usersService.removeById(id);
    }

}
