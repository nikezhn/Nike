package com.cssl.controller;


import com.cssl.pojo.Nike_enshrine;
import com.cssl.service.INike_enshrineService;
import com.cssl.service.impl.Nike_enshrineServiceImpl;
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
@RequestMapping("/nike_enshrine")
public class Nike_enshrineController {

    @Autowired
    INike_enshrineService iNike_enshrineService;

    @RequestMapping("/findAll")
    public List<Nike_enshrine> findAll(){
        System.out.println("进入后台nike_enshrine的findAll方法");
        return iNike_enshrineService.list();
    }

    @RequestMapping("/add")
    public boolean add(Nike_enshrine nike_enshrine){
        System.out.println("进入后台nike_enshrine的add方法");
        return iNike_enshrineService.save(nike_enshrine);
    }

    @RequestMapping("/update")
    public boolean update(Nike_enshrine nike_enshrine){
        System.out.println("进入后台nike_enshrine的update方法");
        return iNike_enshrineService.updateById(nike_enshrine);
    }

    @RequestMapping("/del")
    public boolean del(int id){
        System.out.println("进入后台nike_enshrine的del方法");
        return iNike_enshrineService.removeById(id);
    }

}
