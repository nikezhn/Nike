package com.cssl.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cssl.pojo.Nike_size;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author aguang
 * @since 2019-09-24
 */

public interface Nike_sizeMapper extends BaseMapper<Nike_size> {

    //根据颜色编号查询尺码;
    List<Nike_size> sizeList(int nc_id);

}
