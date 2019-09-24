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
    public class Nike_trolley extends Model<Nike_trolley> {

    private static final long serialVersionUID = 1L;

            /**
            * 购物车编号
            */
            @TableId(value = "nt_id", type = IdType.AUTO)
    private Integer nt_id;

            /**
            * 商品图片
            */
    private String nt_images;

            /**
            * 商品名称
            */
    private String nt_name;

            /**
            * 商品款式
            */
    private String nt_brand;

            /**
            * 商品颜色
            */
    private String nt_color;

            /**
            * 商品尺码
            */
    private String nt_size;

            /**
            * 商品数量
            */
    private Integer nt_number;

            /**
            * 商品价格
            */
    private Integer nt_price;

        public Integer getNt_id() {
        return nt_id;
        }

            public void setNt_id(Integer nt_id) {
        this.nt_id = nt_id;
        }
        public String getNt_images() {
        return nt_images;
        }

            public void setNt_images(String nt_images) {
        this.nt_images = nt_images;
        }
        public String getNt_name() {
        return nt_name;
        }

            public void setNt_name(String nt_name) {
        this.nt_name = nt_name;
        }
        public String getNt_brand() {
        return nt_brand;
        }

            public void setNt_brand(String nt_brand) {
        this.nt_brand = nt_brand;
        }
        public String getNt_color() {
        return nt_color;
        }

            public void setNt_color(String nt_color) {
        this.nt_color = nt_color;
        }
        public String getNt_size() {
        return nt_size;
        }

            public void setNt_size(String nt_size) {
        this.nt_size = nt_size;
        }
        public Integer getNt_number() {
        return nt_number;
        }

            public void setNt_number(Integer nt_number) {
        this.nt_number = nt_number;
        }
        public Integer getNt_price() {
        return nt_price;
        }

            public void setNt_price(Integer nt_price) {
        this.nt_price = nt_price;
        }

    @Override
    protected Serializable pkVal() {
        return this.nt_id;
    }

    @Override
    public String toString() {
    return "Nike_trolley{" +
            "nt_id=" + nt_id +
            ", nt_images=" + nt_images +
            ", nt_name=" + nt_name +
            ", nt_brand=" + nt_brand +
            ", nt_color=" + nt_color +
            ", nt_size=" + nt_size +
            ", nt_number=" + nt_number +
            ", nt_price=" + nt_price +
    "}";
    }
}
