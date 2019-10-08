package com.cssl.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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

    //分页
    public IPage<Nike_product> productPage(Page page) {

        return nike_productMapper.productPage(page);
    }

    public   Nike_product productDeatilByid(int id){
        return  nike_productMapper.productDeatilByid(id);
    }
}