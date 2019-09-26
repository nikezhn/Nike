package com.cssl.controller;

import com.cssl.pojo.Nike_product;
import com.cssl.service.NikeClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class Nike_productController {

    @Autowired
    NikeClientService nike_ClientService;
    //`
    //查询所有商品信息;
    @RequestMapping("/nike_product/findAll")
    public String index(){

        List<Nike_product> list=nike_ClientService.findAll();
        for (Nike_product product:list){
            System.out.println("product:"+product);
        }
        return "index";
    }


    @RequestMapping("/nike_product/product")
    public List<Nike_product> products(){

        List<Nike_product> list=nike_ClientService.sel();

        return list;
    }

}
