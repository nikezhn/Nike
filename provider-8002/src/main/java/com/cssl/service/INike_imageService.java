package com.cssl.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cssl.pojo.Nike_image;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author aguang
 * @since 2019-09-24
 */
public interface INike_imageService extends IService<Nike_image> {

    //根据颜色编号查询图片;
    List<Nike_image> imageList(int nc_id);

}
