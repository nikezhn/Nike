package com.cssl.controller;


import com.cssl.pojo.Nike_appraise;
import com.cssl.pojo.Nike_color;
import com.cssl.service.INike_appraiseService;
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
@RequestMapping("/nike_appraise")
public class Nike_appraiseController {

    @Autowired
    INike_appraiseService iNike_appraiseService;

    @RequestMapping("/findAll")
    public List<Nike_appraise> findAll(){
        System.out.println("进入后台nike_appraise的findAll方法");
        return iNike_appraiseService.list();
    }

    @RequestMapping("/add")
    public boolean add(Nike_appraise nike_appraise){
        System.out.println("进入后台nike_appraise的add方法");
        return iNike_appraiseService.save(nike_appraise);
    }

    @RequestMapping("/update")
    public boolean update(Nike_appraise nike_appraise){
        System.out.println("进入后台nike_appraise的update方法");
        return iNike_appraiseService.updateById(nike_appraise);
    }

    @RequestMapping("/del")
    public boolean del(int id){
        System.out.println("进入后台nike_appraise的del方法");
        return iNike_appraiseService.removeById(id);
    }
}
