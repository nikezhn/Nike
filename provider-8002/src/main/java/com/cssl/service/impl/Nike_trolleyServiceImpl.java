package com.cssl.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cssl.mapper.Nike_trolleyMapper;
import com.cssl.pojo.Nike_trolley;
import com.cssl.service.INike_trolleyService;
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
public class Nike_trolleyServiceImpl extends ServiceImpl<Nike_trolleyMapper, Nike_trolley> implements INike_trolleyService {

    @Autowired
    Nike_trolleyMapper nike_trolleyMapper;

    //根据用户查询购物车;
    public List<Nike_trolley> trolleyUn_id(Integer uid) {

        System.out.println("8002-->Nike_trolleyServiceImpl-->trolleyUn_id");
        return nike_trolleyMapper.trolleyUn_id(uid);
    }

}
