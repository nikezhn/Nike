package com.cssl.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
* <p>
    * 
    * </p>
*
* @author aguang
* @since 2019-09-24
*/
    public class Nike_users extends Model<Nike_users> {

    private static final long serialVersionUID = 1L;

            /**
            * 用户编号
            */
            @TableId(value = "nu_uid", type = IdType.AUTO)
    private Integer nu_uid;

            /**
            * 电话号码
            */
    private String nu_phone;

            /**
            * 用户密码
            */
    private String nu_password;

            /**
            * 邮箱
            */
    private String nu_email;

            /**
            * 权限,0:普通用户,1:管理员
            */
    private Integer nu_auth;

            /**
            * 在线状态,0:不在线,1:在线;
            */
    private Integer nu_state;

        public Integer getNu_uid() {
        return nu_uid;
        }

            public void setNu_uid(Integer nu_uid) {
        this.nu_uid = nu_uid;
        }
        public String getNu_phone() {
        return nu_phone;
        }

            public void setNu_phone(String nu_phone) {
        this.nu_phone = nu_phone;
        }
        public String getNu_password() {
        return nu_password;
        }

            public void setNu_password(String nu_password) {
        this.nu_password = nu_password;
        }
        public String getNu_email() {
        return nu_email;
        }

            public void setNu_email(String nu_email) {
        this.nu_email = nu_email;
        }
        public Integer getNu_auth() {
        return nu_auth;
        }

            public void setNu_auth(Integer nu_auth) {
        this.nu_auth = nu_auth;
        }
        public Integer getNu_state() {
        return nu_state;
        }

            public void setNu_state(Integer nu_state) {
        this.nu_state = nu_state;
        }

    @Override
    protected Serializable pkVal() {
        return this.nu_uid;
    }

    @Override
    public String toString() {
    return "Nike_users{" +
            "nu_uid=" + nu_uid +
            ", nu_phone=" + nu_phone +
            ", nu_password=" + nu_password +
            ", nu_email=" + nu_email +
            ", nu_auth=" + nu_auth +
            ", nu_state=" + nu_state +
    "}";
    }
}
