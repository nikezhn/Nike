package com.cssl.controller;


import com.cssl.pojo.Nike_size;
import com.cssl.service.INike_sizeService;
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
@RequestMapping("/nike_size")
public class Nike_sizeController {

    @Autowired
    INike_sizeService iNike_sizeService;

    @RequestMapping("/findAll")
    public List<Nike_size> findAll(){
        System.out.println("进入后台nike_size的findAll方法");
        return iNike_sizeService.list();
    }

    @RequestMapping("/add")
    public boolean add(Nike_size nike_size){
        System.out.println("进入后台nike_size的add方法");
        return iNike_sizeService.save(nike_size);
    }

    @RequestMapping("/update")
    public boolean update(Nike_size nike_size){
        System.out.println("进入后台nike_size的update方法");
        return iNike_sizeService.updateById(nike_size);
    }

    @RequestMapping("/del")
    public boolean del(int id){
        System.out.println("进入后台nike_size的del方法");
        return iNike_sizeService.removeById(id);
    }

}
