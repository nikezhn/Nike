package com.cssl.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cssl.pojo.Nike_product;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author aguang
 * @since 2019-09-24
 */
public interface INike_productService extends IService<Nike_product> {

    //查询8件商品信息;
    List<Nike_product> productLimit(int npc_two_id);

}
