package com.cssl.controller;


import com.cssl.pojo.Nike_product;
import com.cssl.service.INike_productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
@RequestMapping("/nike_product")
public class Nike_productController {

    @Autowired
    INike_productService iNike_productService;

    @RequestMapping("/findAll")
    public List<Nike_product> findAll(){
        System.out.println("进入后台nike_product的findAll方法");
        return iNike_productService.list();
    }

    @RequestMapping("/add")
    public boolean add(Nike_product nike_product){
        System.out.println("进入后台nike_product的add方法");
        return iNike_productService.save(nike_product);
    }

    @RequestMapping("/update")
    public boolean update(Nike_product nike_product){
        System.out.println("进入后台nike_product的update方法");
        return iNike_productService.updateById(nike_product);
    }

    @RequestMapping("/del")
    public boolean del(int id){
        System.out.println("进入后台nike_product的del方法");
        return iNike_productService.removeById(id);
    }
}
