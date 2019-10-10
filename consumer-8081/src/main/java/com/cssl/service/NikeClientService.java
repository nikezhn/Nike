package com.cssl.service;

import com.cssl.pojo.*;
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

    //查询8件商品信息;
    @RequestMapping(value = "/nike_product/productLimit",method = RequestMethod.GET)
    List<Nike_product> productLimit(@RequestParam(value = "npc_two_id") int npc_two_id);

    //根据用户编号查询购物车;
    @RequestMapping(value = "/nike_trolley/trolleyUn_id",method = RequestMethod.GET)
    List<Nike_trolley> trolleyUn_id(@RequestParam(value = "uid") int uid);

    //查询颜色所有信息;
    @RequestMapping(value = "/nike_color/colorFindAll")
    List<Nike_color> colorFindAll();

    //查询所有商品信息;
    @RequestMapping(value = "/nike_product/productList")
    List<Nike_product> productList();

    //查询单个商品;
    @RequestMapping(value = "/nike_product/productSingle",method = RequestMethod.GET)
    Nike_product productSingle(@RequestParam(value = "np_id") int np_id);

    //根据商品编号查询颜色;
    @RequestMapping(value = "/nike_color/colorSingle",method = RequestMethod.GET)
    List<Nike_color> colorSingle(@RequestParam(value = "np_id") int np_id);

    //根据颜色编号查询图片;
    @RequestMapping(value = "/nike_image/imageList",method = RequestMethod.GET)
    List<Nike_image> imageList(@RequestParam(value = "np_id") int np_id);

    //根据颜色编号查询尺码;
    @RequestMapping(value = "/nike_size/sizeList",method = RequestMethod.GET)
    List<Nike_size> sizeList(@RequestParam(value = "nc_id") int nc_id);

    //查询有关用户喜欢的商品;
    @RequestMapping(value = "/nike_product/userLikeProduct",method = RequestMethod.GET)
    List<Nike_product> userLikeProduct(@RequestParam(value = "npc_two_id") int npc_two_id,@RequestParam(value = "np_id") int np_id);

}
