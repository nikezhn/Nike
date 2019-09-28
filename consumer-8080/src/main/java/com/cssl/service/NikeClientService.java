package com.cssl.service;

import com.cssl.pojo.Nike_color;
import com.cssl.pojo.Nike_product;
import com.cssl.pojo.Nike_product_category;
import com.cssl.pojo.Nike_trolley;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("MICROSERVICE-DEPT")
public interface NikeClientService {

    @RequestMapping(value = "/nike_product/findAll",method = RequestMethod.GET)
     List<Nike_product> findNike_product(@RequestParam(value = "np_name") String np_name);

    @RequestMapping("/nike_color/findAll")
    List<Nike_color> findNike_color();

    @RequestMapping("/nike_trolley/findAll")
    List<Nike_trolley> findNike_trolley();

    @RequestMapping("/nike_product_category/findAll")
    List<Nike_product_category> findNike_product_category();


}
