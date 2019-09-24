package com.cssl.service;

import com.cssl.pojo.Nike_product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient("MICROSERVICE-DEPT")
public interface INike_productClientService {

    @RequestMapping("/nike_color/findAll")
    public List<Nike_product> findAll();

}
