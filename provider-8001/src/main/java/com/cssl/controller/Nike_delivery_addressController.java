package com.cssl.controller;


import com.cssl.pojo.Nike_delivery_address;
import com.cssl.service.INike_delivery_addressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author aguang
 * @since 2019-09-24
 */
@RestController
@RequestMapping("/nike_delivery_address")
public class Nike_delivery_addressController {

    @Autowired
    INike_delivery_addressService iNike_delivery_addressService;


    @RequestMapping("/findAll")
    public List<Nike_delivery_address> findAll(){
        System.out.println("进入后台nike_delivery_address的findAll方法");
        return iNike_delivery_addressService.list();
    }

    @RequestMapping("/add")
    public boolean add(Nike_delivery_address nike_delivery_address){
        System.out.println("进入后台nike_delivery_address的add方法");
        return iNike_delivery_addressService.save(nike_delivery_address);
    }

    @RequestMapping("/update")
    public boolean update(Nike_delivery_address nike_delivery_address){
        System.out.println("进入后台nike_delivery_address的update方法");
        return iNike_delivery_addressService.updateById(nike_delivery_address);
    }

    @RequestMapping("/del")
    public boolean del(int id){
        System.out.println("进入后台nike_delivery_address的del方法");
        return iNike_delivery_addressService.removeById(id);
    }
}
