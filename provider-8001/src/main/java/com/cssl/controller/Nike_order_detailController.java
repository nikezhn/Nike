package com.cssl.controller;


import com.cssl.pojo.Nike_order_detail;
import com.cssl.service.INike_order_detailService;
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
@RequestMapping("/nike_order_detail")
public class Nike_order_detailController {

    @Autowired
    INike_order_detailService iNike_order_detailService;

    @RequestMapping("/findAll")
    public List<Nike_order_detail> findAll(){
        System.out.println("进入后台nike_order_detail的findAll方法");
        return iNike_order_detailService.list();
    }

    @RequestMapping("/add")
    public boolean add(Nike_order_detail nike_order_detail){
        System.out.println("进入后台nike_order_detail的add方法");
        return iNike_order_detailService.save(nike_order_detail);
    }

    @RequestMapping("/update")
    public boolean update(Nike_order_detail nike_order_detail){
        System.out.println("进入后台nike_order_detail的update方法");
        return iNike_order_detailService.updateById(nike_order_detail);
    }

    @RequestMapping("/del")
    public boolean del(int id){
        System.out.println("进入后台nike_order_detail的del方法");
        return iNike_order_detailService.removeById(id);
    }

}
