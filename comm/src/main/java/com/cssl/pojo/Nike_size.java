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
    public class Nike_size extends Model<Nike_size> {

    private static final long serialVersionUID = 1L;

            /**
            * 尺码编号
            */
            @TableId(value = "ns_id", type = IdType.AUTO)
    private Integer ns_id;

            /**
            * 颜色编号
            */
    private Integer nc_id;

            /**
            * 商品尺码
            */
    private String ns_size;

            /**
            * 商品库存
            */
    private Integer ns_repertory;

        public Integer getNs_id() {
        return ns_id;
        }

            public void setNs_id(Integer ns_id) {
        this.ns_id = ns_id;
        }
        public Integer getNc_id() {
        return nc_id;
        }

            public void setNc_id(Integer nc_id) {
        this.nc_id = nc_id;
        }
        public String getNs_size() {
        return ns_size;
        }

            public void setNs_size(String ns_size) {
        this.ns_size = ns_size;
        }
        public Integer getNs_repertory() {
        return ns_repertory;
        }

            public void setNs_repertory(Integer ns_repertory) {
        this.ns_repertory = ns_repertory;
        }

    @Override
    protected Serializable pkVal() {
        return this.ns_id;
    }

    @Override
    public String toString() {
    return "Nike_size{" +
            "ns_id=" + ns_id +
            ", nc_id=" + nc_id +
            ", ns_size=" + ns_size +
            ", ns_repertory=" + ns_repertory +
    "}";
    }
}
