package com.cssl.controller;


import com.cssl.pojo.Nike_order;
import com.cssl.service.INike_orderService;
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
@RequestMapping("/nike_order")
public class Nike_orderController {

    @Autowired
    INike_orderService iNike_orderService;

    @RequestMapping("/findAll")
    public List<Nike_order> findAll(){
        System.out.println("进入后台nike_order 的findAll方法");
        return iNike_orderService.list();
    }

    @RequestMapping("/add")
    public boolean add(Nike_order nike_order){
        System.out.println("进入后台nike_order的add方法");
        return iNike_orderService.save(nike_order);
    }

    @RequestMapping("/update")
    public boolean update(Nike_order nike_order){
        System.out.println("进入后台nike_order的update方法");
        return iNike_orderService.updateById(nike_order);
    }

    @RequestMapping("/del")
    public boolean del(int id){
        System.out.println("进入后台nike_order的del方法");
        return iNike_orderService.removeById(id);
    }

}
