package com.cssl.controller;


import com.cssl.pojo.Nike_product;
import com.cssl.service.INike_productService;
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
@RequestMapping("/nike_product")
public class Nike_productController {

    @Autowired
    INike_productService iNike_productService;

    @RequestMapping("/findAll")
    public List<Nike_product> findAll(){

        System.out.println("进入前台nike_product的findAll方法");
        return iNike_productService.list();
    }

    @RequestMapping("/product")
    public List<Nike_product> sel(){

        System.out.println("查询方法");
        return iNike_productService.productSel();
    }

}
