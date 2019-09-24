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
    public class Nike_delivery_address extends Model<Nike_delivery_address> {

    private static final long serialVersionUID = 1L;

            /**
            * 配送地址编号
            */
            @TableId(value = "daid", type = IdType.AUTO)
    private Integer daid;

            /**
            * 用户编号
            */
    private Integer uid;

            /**
            * 用户名称
            */
    private String uname;

            /**
            * 省份
            */
    private String province;

            /**
            * 城市
            */
    private String city;

            /**
            * 区/县
            */
    private String district;

            /**
            * 地址
            */
    private String address;

            /**
            * 电话号码
            */
    private Integer phone;

        public Integer getDaid() {
        return daid;
        }

            public void setDaid(Integer daid) {
        this.daid = daid;
        }
        public Integer getUid() {
        return uid;
        }

            public void setUid(Integer uid) {
        this.uid = uid;
        }
        public String getUname() {
        return uname;
        }

            public void setUname(String uname) {
        this.uname = uname;
        }
        public String getProvince() {
        return province;
        }

            public void setProvince(String province) {
        this.province = province;
        }
        public String getCity() {
        return city;
        }

            public void setCity(String city) {
        this.city = city;
        }
        public String getDistrict() {
        return district;
        }

            public void setDistrict(String district) {
        this.district = district;
        }
        public String getAddress() {
        return address;
        }

            public void setAddress(String address) {
        this.address = address;
        }
        public Integer getPhone() {
        return phone;
        }

            public void setPhone(Integer phone) {
        this.phone = phone;
        }

    @Override
    protected Serializable pkVal() {
        return this.daid;
    }

    @Override
    public String toString() {
    return "Nike_delivery_address{" +
            "daid=" + daid +
            ", uid=" + uid +
            ", uname=" + uname +
            ", province=" + province +
            ", city=" + city +
            ", district=" + district +
            ", address=" + address +
            ", phone=" + phone +
    "}";
    }
}
