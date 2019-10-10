package com.cssl.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cssl.pojo.Nike_color;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author aguang
 * @since 2019-09-24
 */
public interface INike_colorService extends IService<Nike_color> {

    //根据商品编号查询颜色;
    List<Nike_color> colorSingle(int np_id);

}
