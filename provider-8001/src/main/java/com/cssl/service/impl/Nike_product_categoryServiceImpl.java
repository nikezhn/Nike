package com.cssl.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cssl.mapper.Nike_product_categoryMapper;
import com.cssl.pojo.Nike_product_category;
import com.cssl.service.INike_product_categoryService;
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
public class Nike_product_categoryServiceImpl extends ServiceImpl<Nike_product_categoryMapper, Nike_product_category> implements INike_product_categoryService {

    @Autowired
    Nike_product_categoryMapper nike_product_categoryMapper;

    public List<Nike_product_category> findNike_product_category() {

        return nike_product_categoryMapper.findNike_product_category();

    }
}
