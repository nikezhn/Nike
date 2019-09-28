package com.cssl.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cssl.pojo.Nike_product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author aguang
 * @since 2019-09-24
 */

public interface Nike_productMapper extends BaseMapper<Nike_product> {

     List<Nike_product> findNike_product(String np_name);

}
