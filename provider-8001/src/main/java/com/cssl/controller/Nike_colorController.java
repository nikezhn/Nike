package com.cssl.controller;


import com.cssl.pojo.Nike_color;
import com.cssl.service.INike_colorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
@Controller
@RequestMapping("/nike_color")
public class Nike_colorController {

    @Autowired
    INike_colorService iNike_colorService;

    @RequestMapping("/findAll")
    public List<Nike_color> findAll(){
        System.out.println("进入后台nike_color的findAll方法");
        return iNike_colorService.list();
    }

    @RequestMapping("/add")
    public boolean add(Nike_color nike_color){
        System.out.println("进入后台nike_color的add方法");
        return iNike_colorService.save(nike_color);
    }

    @RequestMapping("/update")
    public boolean update(Nike_color nike_color){
        System.out.println("进入后台nike_color的update方法");
        return iNike_colorService.updateById(nike_color);
    }

    @RequestMapping("/del")
    public boolean del(int id){
        System.out.println("进入后台nike_color的del方法");
        return iNike_colorService.removeById(id);
    }

}
