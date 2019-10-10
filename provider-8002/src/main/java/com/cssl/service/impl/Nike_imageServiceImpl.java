package com.cssl.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cssl.mapper.Nike_imageMapper;
import com.cssl.pojo.Nike_image;
import com.cssl.service.INike_imageService;
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
public class Nike_imageServiceImpl extends ServiceImpl<Nike_imageMapper, Nike_image> implements INike_imageService {

    @Autowired
    Nike_imageMapper nike_imageMapper;

    //根据颜色编号查询图片;
    public List<Nike_image> imageList(int nc_id){

        return nike_imageMapper.imageList(nc_id);
    }

}
