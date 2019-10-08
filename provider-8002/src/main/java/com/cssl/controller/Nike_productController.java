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

    @RequestMapping("/productLimit")
    public List<Nike_product> productLimit(int npc_two_id){

        System.out.println("8002-->Nike_productController-->productLimit");
        return iNike_productService.productLimit(npc_two_id);
    }

}
