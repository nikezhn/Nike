package com.cssl.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cssl.pojo.Nike_size;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author aguang
 * @since 2019-09-24
 */
public interface INike_sizeService extends IService<Nike_size> {

    //根据颜色编号查询尺码;
    List<Nike_size> sizeList(int nc_id);

}
