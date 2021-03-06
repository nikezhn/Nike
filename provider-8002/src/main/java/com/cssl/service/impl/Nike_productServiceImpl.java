package com.cssl.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cssl.mapper.Nike_productMapper;
import com.cssl.pojo.Nike_product;
import com.cssl.service.INike_productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author aguang
 * @since 2019-09-24
 */
@Service
public class Nike_productServiceImpl extends ServiceImpl<Nike_productMapper, Nike_product> implements INike_productService {

    @Autowired
    Nike_productMapper nike_productMapper;

    //查询8件商品信息;
    public List<Nike_product> productLimit(int npc_two_id) {

        System.out.println("8002-->Nike_productServiceImpl-->productLimit");
        return nike_productMapper.productLimit(npc_two_id);
    }

    //查询所有商品信息;
    public List<Nike_product> productList(int np_id) {

        System.out.println("8002-->Nike_productServiceImpl-->productList");
        return nike_productMapper.productList(np_id);
    }

    //查询单个商品;
    public Nike_product productSingle(int np_id) {

        System.out.println("8002-->Nike_productServiceImpl-->productSingle");
        return nike_productMapper.productSingle(np_id);
    }

    //查询有关用户喜欢的商品;
    public List<Nike_product> userLikeProduct(int npc_two_id, int np_id) {

        System.out.println("8002-->Nike_productServiceImpl-->userLikeProduct");
        return nike_productMapper.userLikeProduct(npc_two_id,np_id);
    }

}
