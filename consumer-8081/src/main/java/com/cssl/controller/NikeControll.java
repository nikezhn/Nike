package com.cssl.controller;

import com.cssl.pojo.Nike_product;
import com.cssl.pojo.Nike_trolley;
import com.cssl.service.NikeClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/*
 * 通往个个页面;
 */
@Controller
public class NikeControll {

    @Autowired
    NikeClientService nike_ClientService;

    //首页;
    @RequestMapping("/Nikefront")
    public String frontIndex(Model model){

        //查询所有商品信息;
        System.out.println("8081:Nikefront-->NikeControll-->productFindAll");
        List<Nike_product> productList=nike_ClientService.productFindAll();
        /*for (Nike_product product:productList){ System.out.println("product:"+product); }*/

        //根据用户编号查询购物车;
        System.out.println("8081:Nikefront-->NikeControll-->trolleyUn_id");
        List<Nike_trolley> trolleyList=nike_ClientService.trolleyUn_id(1);
        /*for (Nike_trolley trolley:trolleyList){ System.out.println("trolley:"+trolley); }*/

        //根据用户查询购物车数量
        model.addAttribute("count",trolleyList.size());
        model.addAttribute("productList",productList);
        model.addAttribute("trolleyList",trolleyList);


        return "index";
    }
}
