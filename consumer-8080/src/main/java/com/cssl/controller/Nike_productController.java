package com.cssl.controller;

import com.cssl.pojo.Nike_product;
import com.cssl.service.NikeClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class Nike_productController {

    @Autowired
    NikeClientService nikeClientService;

    @ResponseBody
    @RequestMapping("/nike_product/findAll")
    public  List<Nike_product> findAll() {
        List<Nike_product> all = nikeClientService.findAll();
        System.out.println(all);
        return all;
    }
}
