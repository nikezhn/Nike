package com.cssl.service;

import com.cssl.pojo.Nike_color;
import com.cssl.pojo.Nike_product;
import com.cssl.pojo.Nike_trolley;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/*
 *
 */
@FeignClient("MICROSERVICE-DEPT")
public interface NikeClientService {

    //查询所有商品信息;
    @RequestMapping(value = "/nike_product/productLimit",method = RequestMethod.GET)
    List<Nike_product> productLimit(@RequestParam(value = "npc_two_id") int npc_two_id);

    //根据用户编号查询购物车;
    @RequestMapping(value = "/nike_trolley/trolleyUn_id",method = RequestMethod.GET)
    List<Nike_trolley> trolleyUn_id(@RequestParam(value = "uid") int uid);

    //查询颜色所有信息;
    @RequestMapping("/nike_color/colorFindAll")
    List<Nike_color> colorFindAll();

}
