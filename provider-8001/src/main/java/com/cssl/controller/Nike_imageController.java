package com.cssl.controller;


import com.cssl.pojo.Nike_image;
import com.cssl.service.INike_imageService;
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
@RequestMapping("/nike_image")
public class Nike_imageController {

    @Autowired
    INike_imageService iNike_imageService;

    @RequestMapping("/findAll")
    public List<Nike_image> findAll(){
        System.out.println("进入后台nike_image的findAll方法");
        return iNike_imageService.list();
    }

    @RequestMapping("/add")
    public boolean add(Nike_image nike_image){
        System.out.println("进入后台nike_image的add方法");
        return iNike_imageService.save(nike_image);
    }

    @RequestMapping("/update")
    public boolean update(Nike_image nike_image){
        System.out.println("进入后台nike_image的update方法");
        return iNike_imageService.updateById(nike_image);
    }

    @RequestMapping("/del")
    public boolean del(int id){
        System.out.println("进入后台nike_image的del方法");
        return iNike_imageService.removeById(id);
    }
}
