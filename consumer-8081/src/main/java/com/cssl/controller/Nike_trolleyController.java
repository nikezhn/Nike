package com.cssl.controller;

import com.cssl.pojo.Nike_trolley;
import com.cssl.service.NikeClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/*
 * 购物车;
 */
@RestController
public class Nike_trolleyController {

    @Autowired
    NikeClientService nike_ClientService;

    /*//根据用户编号查询购物车;
    @RequestMapping("/nike_trolley/trolleyUn_id")
    public List<Nike_trolley> trolleyUn_id(){

        System.out.println("8081-->Nike_trolleyController-->trolleyUn_id");
        List<Nike_trolley> list=nike_ClientService.trolleyUn_id(1);
        for (Nike_trolley trolley:list){ System.out.println("trolley:"+trolley); }
        return  list;
    }*/

}
