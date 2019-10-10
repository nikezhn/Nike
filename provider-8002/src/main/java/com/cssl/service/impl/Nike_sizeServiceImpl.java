package com.cssl.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cssl.mapper.Nike_sizeMapper;
import com.cssl.pojo.Nike_size;
import com.cssl.service.INike_sizeService;
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
public class Nike_sizeServiceImpl extends ServiceImpl<Nike_sizeMapper, Nike_size> implements INike_sizeService {

    @Autowired
    Nike_sizeMapper nike_sizeMapper;

    //根据颜色编号查询尺码;
    public List<Nike_size> sizeList(int nc_id) {

        System.out.println("8002-->Nike_sizeServiceImpl-->sizeList");
        return nike_sizeMapper.sizeList(nc_id);
    }
}
