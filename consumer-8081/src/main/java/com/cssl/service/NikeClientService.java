package com.cssl.service;

import com.cssl.pojo.Nike_product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient("MICROSERVICE-DEPT")
public interface NikeClientService {

    @RequestMapping("/nike_product/findAll")
    public List<Nike_product> findAll();

    @RequestMapping("/nike_product/product")
    public List<Nike_product> sel();

}
