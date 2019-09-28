package com.cssl.controller;

import com.cssl.pojo.Nike_product;
import com.cssl.service.NikeClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class Nike_productController {

    @Autowired
    NikeClientService nikeClientService;

    @RequestMapping("/nike_product/findAll")
    public ModelAndView findAll() {
        ModelAndView mav=new ModelAndView();
        List<Nike_product> nike_product = nikeClientService.findNike_product("默认");
        mav.addObject("nike_product",nike_product);
        mav.setViewName("product_list");
        return mav;
    }
}
