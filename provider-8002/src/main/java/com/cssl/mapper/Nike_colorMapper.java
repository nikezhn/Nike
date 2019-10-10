package com.cssl.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cssl.pojo.Nike_color;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author aguang
 * @since 2019-09-24
 */

public interface Nike_colorMapper extends BaseMapper<Nike_color> {

    //根据商品编号查询颜色;
    List<Nike_color> colorSingle(int np_id);

}
