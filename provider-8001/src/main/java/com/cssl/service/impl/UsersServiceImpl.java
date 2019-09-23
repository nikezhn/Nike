package com.cssl.service.impl;

import com.cssl.mapper.UsersMapper;
import com.cssl.pojo.Nike_color;
import com.cssl.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    UsersMapper usersMapper;

    public List<Nike_color> findAll() {

        System.out.println("findAll.............................."+usersMapper==null);
        return usersMapper.findAll();
    }

}
