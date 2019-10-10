package com.cssl.controller;


import com.cssl.pojo.Nike_image;
import com.cssl.service.INike_imageService;
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
@RequestMapping("/nike_image")
public class Nike_imageController {

    @Autowired
    INike_imageService iNike_imageService;

    //根据颜色编号查询图片;
    @RequestMapping("/imageList")
    public List<Nike_image> imageList(int np_id){

        System.out.println("8002-->Nike_imageController-->imageList");
        return iNike_imageService.imageList(np_id);
    }

}
