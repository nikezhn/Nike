package com.cssl.pojo;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
/**
 * 配送地址表
 */
public class Nike_delivery_address {

    private int daid;           //配送地址编号
    private int uid;            //用户编号
    private String uname;       //用户名称
    private String province;   //省份
    private String city;       // 城市
    private String district;   //区/县
    private String address;    //地址
    private int phone;         //电话号码

}
