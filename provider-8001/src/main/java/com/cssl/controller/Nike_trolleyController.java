package com.cssl.controller;


import com.cssl.pojo.Nike_trolley;
import com.cssl.service.INike_trolleyService;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/nike_trolley")
public class Nike_trolleyController {

    @Autowired
    INike_trolleyService iNike_trolleyService;

    @RequestMapping("/findAll")
    public List<Nike_trolley> findAll(){
        System.out.println("进入后台nike_trolley的findAll方法");
        return iNike_trolleyService.list();
    }

    @RequestMapping("/add")
    public boolean add(Nike_trolley nike_trolley){
        System.out.println("进入后台nike_trolley的add方法");
        return iNike_trolleyService.save(nike_trolley);
    }

    @RequestMapping("/update")
    public boolean update(Nike_trolley nike_trolley){
        System.out.println("进入后台nike_trolley的update方法");
        return iNike_trolleyService.updateById(nike_trolley);
    }

    @RequestMapping("/del")
    public boolean del(int id){
        System.out.println("进入后台nike_trolley的del方法");
        return iNike_trolleyService.removeById(id);
    }


}
