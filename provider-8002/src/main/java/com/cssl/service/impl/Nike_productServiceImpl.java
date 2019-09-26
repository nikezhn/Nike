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
    //查询商品所有信息;
    public List<Nike_product> productSel() {

        return nike_productMapper.productSel();
    }
}
