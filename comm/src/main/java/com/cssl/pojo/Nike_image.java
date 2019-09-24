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
    public class Nike_image extends Model<Nike_image> {

    private static final long serialVersionUID = 1L;

            @TableId(value = "ni_images_id", type = IdType.AUTO)
    private Integer ni_images_id;

    private String ni_images_url;

    private Integer nc_id;

        public Integer getNi_images_id() {
        return ni_images_id;
        }

            public void setNi_images_id(Integer ni_images_id) {
        this.ni_images_id = ni_images_id;
        }
        public String getNi_images_url() {
        return ni_images_url;
        }

            public void setNi_images_url(String ni_images_url) {
        this.ni_images_url = ni_images_url;
        }
        public Integer getNc_id() {
        return nc_id;
        }

            public void setNc_id(Integer nc_id) {
        this.nc_id = nc_id;
        }

    @Override
    protected Serializable pkVal() {
        return this.ni_images_id;
    }

    @Override
    public String toString() {
    return "Nike_image{" +
            "ni_images_id=" + ni_images_id +
            ", ni_images_url=" + ni_images_url +
            ", nc_id=" + nc_id +
    "}";
    }
}
