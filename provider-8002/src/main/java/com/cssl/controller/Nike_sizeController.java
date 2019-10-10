package com.cssl.controller;


import com.cssl.pojo.Nike_size;
import com.cssl.service.INike_sizeService;
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
@RequestMapping("/nike_size")
public class Nike_sizeController {

    @Autowired
    INike_sizeService iNike_sizeService;

    //根据颜色编号查询尺码;
    @RequestMapping("/sizeList")
    public List<Nike_size> sizeList(int nc_id) {

        System.out.println("8002-->Nike_sizeServiceImpl-->sizeList");
        return iNike_sizeService.sizeList(nc_id);
    }

}
