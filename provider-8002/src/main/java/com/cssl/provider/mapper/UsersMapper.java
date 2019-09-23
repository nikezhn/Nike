package com.cssl.provider.mapper;

import com.cssl.pojo.Nike_product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UsersMapper {

    List<Nike_product> listSel();//查询所有

}
