package com.cssl.controller;


import com.cssl.pojo.Nike_product_category;
import com.cssl.service.INike_product_categoryService;
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
@RequestMapping("/nike_product_category")
public class Nike_product_categoryController {

    @Autowired
    INike_product_categoryService iNike_product_categoryService;

    @RequestMapping("/findAll")
    public List<Nike_product_category> findAll(){
        System.out.println("进入后台nike_product_category的findAll方法");
        return iNike_product_categoryService.list();
    }

    @RequestMapping("/add")
    public boolean add(Nike_product_category nike_product_category){
        System.out.println("进入后台nike_product_category的add方法");
        return iNike_product_categoryService.save(nike_product_category);
    }

    @RequestMapping("/update")
    public boolean update(Nike_product_category nike_product_category){
        System.out.println("进入后台nike_product_category的update方法");
        return iNike_product_categoryService.updateById(nike_product_category);
    }

    @RequestMapping("/del")
    public boolean del(int id){
        System.out.println("进入后台nike_product_category的del方法");
        return iNike_product_categoryService.removeById(id);
    }
}
