package com.cssl.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cssl.pojo.Nike_trolley;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author aguang
 * @since 2019-09-24
 */
public interface INike_trolleyService extends IService<Nike_trolley> {

    //根据用户查询购物车;
    List<Nike_trolley> trolleyUn_id(Integer uid);

}
