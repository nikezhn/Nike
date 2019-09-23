package com.cssl.mapper;

import com.cssl.pojo.Nike_color;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UsersMapper {

    List<Nike_color> findAll();

}
