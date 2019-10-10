package com.cssl.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cssl.pojo.Nike_product;
import org.apache.ibatis.annotations.Param;

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

    /**
     * <p>
     * 查询 : 根据state状态查询用户列表，分页显示
     * 注意!!: 如果入参是有多个,需要加注解指定参数名才能在xml中取值
     * </p>
     *
     * @param page 分页对象,xml中可以从里面进行取值,传递参数 Page 即自动分页,必须放在第一位(你可以继承Page实现自己的分页对象)
     * @param state 状态
     * @return 分页对象
     */
    //查询8件商品信息;
    List<Nike_product> productLimit(int npc_two_id);

    //查询所有商品信息;
    List<Nike_product> productList(int np_id);

    //查询单个商品;
    Nike_product productSingle(int np_id);

    //查询有关用户喜欢的商品;
    List<Nike_product> userLikeProduct(@Param("npc_two_id") int npc_two_id,@Param("np_id") int np_id);

}
