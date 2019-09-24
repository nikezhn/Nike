package com.cssl.service;

import com.cssl.pojo.Nike_color;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient("MICROSERVICE-DEPT")
public interface INike_colorClientService {

    @RequestMapping("/nike_color/findAll")
    public List<Nike_color> findAll();

    

}
