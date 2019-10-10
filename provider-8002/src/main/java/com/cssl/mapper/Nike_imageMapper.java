package com.cssl.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cssl.pojo.Nike_image;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author aguang
 * @since 2019-09-24
 */

public interface Nike_imageMapper extends BaseMapper<Nike_image> {

    //根据颜色编号查询图片;
    List<Nike_image> imageList(int nc_id);

}
