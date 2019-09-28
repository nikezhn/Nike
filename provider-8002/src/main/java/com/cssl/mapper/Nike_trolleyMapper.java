package com.cssl.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cssl.pojo.Nike_trolley;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author aguang
 * @since 2019-09-24
 */

public interface Nike_trolleyMapper extends BaseMapper<Nike_trolley> {

    //根据用户查询购物车;
    List<Nike_trolley> trolleyUn_id(int uid);

}
