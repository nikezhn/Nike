package com.cssl.controller;

import com.cssl.pojo.Nike_product_category;
import com.cssl.service.NikeClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class Nike_product_categoryController {


    @Autowired
    NikeClientService nikeClientService;

    @RequestMapping("/nike_product_category/findAll")
    public ModelAndView findAll() {
        ModelAndView mav=new ModelAndView();
        List<Nike_product_category> nike_product_category = nikeClientService.findNike_product_category();
        mav.addObject("nike_product_category",nike_product_category);
        mav.setViewName("product_category");
        return mav;
    }
}
