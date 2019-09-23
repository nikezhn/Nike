package com.cssl.service;

import com.cssl.pojo.Nike_color;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@FeignClient(value = "MICROSERVICE-DEPT")
public interface UsersClientService {

    @GetMapping("findAll")
    List<Nike_color> findAll();

}
