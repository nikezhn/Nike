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
    public class Nike_product extends Model<Nike_product> {

    private static final long serialVersionUID = 1L;

            /**
            * 商品编号
            */
            @TableId(value = "np_id", type = IdType.AUTO)
    private Integer np_id;

            /**
            * 商品名称
            */
    private String np_name;

            /**
            * 商品描述
            */
    private String np_describe;

            /**
            * 商品品牌
            */
    private String np_brand;

            /**
            * 商品价格
            */
    private Double np_price;

            /**
            * 一级分类编号
            */
    private Integer npc_id;

            /**
            * 二级分类编号
            */
    private Integer npc_two_id;

            /**
            * 三级分类编号
            */
    private Integer npc_three_id;

            /**
            * 商品图片
            */
    private String np_images;

            /**
            * 商品颜色数量
            */
    private Integer np_color_count;

        public Integer getNp_id() {
        return np_id;
        }

            public void setNp_id(Integer np_id) {
        this.np_id = np_id;
        }
        public String getNp_name() {
        return np_name;
        }

            public void setNp_name(String np_name) {
        this.np_name = np_name;
        }
        public String getNp_describe() {
        return np_describe;
        }

            public void setNp_describe(String np_describe) {
        this.np_describe = np_describe;
        }
        public String getNp_brand() {
        return np_brand;
        }

            public void setNp_brand(String np_brand) {
        this.np_brand = np_brand;
        }
        public Double getNp_price() {
        return np_price;
        }

            public void setNp_price(Double np_price) {
        this.np_price = np_price;
        }
        public Integer getNpc_id() {
        return npc_id;
        }

            public void setNpc_id(Integer npc_id) {
        this.npc_id = npc_id;
        }
        public Integer getNpc_two_id() {
        return npc_two_id;
        }

            public void setNpc_two_id(Integer npc_two_id) {
        this.npc_two_id = npc_two_id;
        }
        public Integer getNpc_three_id() {
        return npc_three_id;
        }

            public void setNpc_three_id(Integer npc_three_id) {
        this.npc_three_id = npc_three_id;
        }
        public String getNp_images() {
        return np_images;
        }

            public void setNp_images(String np_images) {
        this.np_images = np_images;
        }
        public Integer getNp_color_count() {
        return np_color_count;
        }

            public void setNp_color_count(Integer np_color_count) {
        this.np_color_count = np_color_count;
        }

    @Override
    protected Serializable pkVal() {
        return this.np_id;
    }

    @Override
    public String toString() {
    return "Nike_product{" +
            "np_id=" + np_id +
            ", np_name=" + np_name +
            ", np_describe=" + np_describe +
            ", np_brand=" + np_brand +
            ", np_price=" + np_price +
            ", npc_id=" + npc_id +
            ", npc_two_id=" + npc_two_id +
            ", npc_three_id=" + npc_three_id +
            ", np_images=" + np_images +
            ", np_color_count=" + np_color_count +
    "}";
    }
}
