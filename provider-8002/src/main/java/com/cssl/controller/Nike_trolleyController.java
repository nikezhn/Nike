package com.cssl.controller;


import com.cssl.pojo.Nike_trolley;
import com.cssl.service.INike_trolleyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    //根据用户查询购物车;
    @RequestMapping("/trolleyUn_id")
    public List<Nike_trolley> trolleyUn_id(int uid){

        System.out.println("8002-->Nike_trolleyController-->trolleyUn_id");
        return iNike_trolleyService.trolleyUn_id(uid);
    }

}
