package com.cssl.controller;

import com.cssl.pojo.Nike_product;
import com.cssl.service.NikeClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/*
 *  商品;
 */
@RestController
public class Nike_productController {

    @Autowired
    NikeClientService nike_ClientService;

    //查询所有商品信息;
    /*@RequestMapping("/nike_product/productFindAll")
    public String productFindAll(){

        System.out.println("8081-->Nike_productController-->productFindAll");
        List<Nike_product> list=nike_ClientService.productFindAll();
        for (Nike_product product:list){ System.out.println("product:"+product); }
        return "index";
    }*/

}
