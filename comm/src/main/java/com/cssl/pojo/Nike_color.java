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
    public class Nike_color extends Model<Nike_color> {

    private static final long serialVersionUID = 1L;

            /**
            * 商品颜色编号
            */
            @TableId(value = "nc_id", type = IdType.AUTO)
    private Integer nc_id;

            /**
            * 商品编号
            */
    private Integer np_id;

            /**
            * 商品颜色
            */
    private String nc_color;

            /**
            * 商品款式
            */
    private String nc_style;

            /**
            * 商品小图片
            */
    private String nc_images;

            /**
            * 商品销量
            */
    private Integer nc_sales;

        public Integer getNc_id() {
        return nc_id;
        }

            public void setNc_id(Integer nc_id) {
        this.nc_id = nc_id;
        }
        public Integer getNp_id() {
        return np_id;
        }

            public void setNp_id(Integer np_id) {
        this.np_id = np_id;
        }
        public String getNc_color() {
        return nc_color;
        }

            public void setNc_color(String nc_color) {
        this.nc_color = nc_color;
        }
        public String getNc_style() {
        return nc_style;
        }

            public void setNc_style(String nc_style) {
        this.nc_style = nc_style;
        }
        public String getNc_images() {
        return nc_images;
        }

            public void setNc_images(String nc_images) {
        this.nc_images = nc_images;
        }
        public Integer getNc_sales() {
        return nc_sales;
        }

            public void setNc_sales(Integer nc_sales) {
        this.nc_sales = nc_sales;
        }

    @Override
    protected Serializable pkVal() {
        return this.nc_id;
    }

    @Override
    public String toString() {
    return "Nike_color{" +
            "nc_id=" + nc_id +
            ", np_id=" + np_id +
            ", nc_color=" + nc_color +
            ", nc_style=" + nc_style +
            ", nc_images=" + nc_images +
            ", nc_sales=" + nc_sales +
    "}";
    }
}
