package com.cssl.pojo;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
//用户表
public class Nike_users {
    private  int nu_uid;            //用户编号
    private  String nu_phone;       //电话号码
    private  String nu_password;   //用户密码
    private  String nu_email;       //邮箱
    private  int nu_auth;           //权限,0:普通用户,1:管理员
    private  int nu_state;          //在线状态,0:不在线,1:在线;
}
