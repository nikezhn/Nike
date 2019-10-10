package com.cssl.controller;

import com.cssl.pojo.Nike_product;
import com.cssl.service.INike_productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author aguang
 * @since 2019-09-24
 */
@RestController
@RequestMapping("/nike_product")
public class Nike_productController {

    @Autowired
    INike_productService iNike_productService;

    //查询8件商品信息;
    @RequestMapping("/productLimit")
    public List<Nike_product> productLimit(int npc_two_id){

        System.out.println("8002-->Nike_productController-->productLimit");
        return iNike_productService.productLimit(npc_two_id);
    }

    //查询所有商品信息;
    @RequestMapping("/productList")
    public List<Nike_product> productList() {

        System.out.println("8002-->Nike_productController-->productList");
        return iNike_productService.list();
    }

    //查询单个商品;
    @RequestMapping("/productSingle")
    public Nike_product productSingle(int np_id) {

        System.out.println("8002-->Nike_productController-->productSingle");
        return iNike_productService.productSingle(np_id);
    }

    //查询有关用户喜欢的商品;
    @RequestMapping("/userLikeProduct")
    public List<Nike_product> userLikeProduct(int npc_two_id, int np_id) {

        System.out.println("8002-->Nike_productController-->userLikeProduct");
        return iNike_productService.userLikeProduct(npc_two_id,np_id);
    }

}
