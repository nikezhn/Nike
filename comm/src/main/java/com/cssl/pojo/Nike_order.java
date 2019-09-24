package com.cssl.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;
import java.util.Date;

/**
* <p>
    * 
    * </p>
*
* @author aguang
* @since 2019-09-24
*/
    public class Nike_order extends Model<Nike_order> {

    private static final long serialVersionUID = 1L;

            /**
            * 订单编号
            */
            @TableId(value = "no_id", type = IdType.AUTO)
    private Integer no_id;

            /**
            * 用户编号
            */
    private Integer nu_id;

            /**
            * 商品编号
            */
    private Integer np_id;

            /**
            * 订单时间
            */
    private Date no_date;

        public Integer getNo_id() {
        return no_id;
        }

            public void setNo_id(Integer no_id) {
        this.no_id = no_id;
        }
        public Integer getNu_id() {
        return nu_id;
        }

            public void setNu_id(Integer nu_id) {
        this.nu_id = nu_id;
        }
        public Integer getNp_id() {
        return np_id;
        }

            public void setNp_id(Integer np_id) {
        this.np_id = np_id;
        }
        public Date getNo_date() {
        return no_date;
        }

            public void setNo_date(Date no_date) {
        this.no_date = no_date;
        }

    @Override
    protected Serializable pkVal() {
        return this.no_id;
    }

    @Override
    public String toString() {
    return "Nike_order{" +
            "no_id=" + no_id +
            ", nu_id=" + nu_id +
            ", np_id=" + np_id +
            ", no_date=" + no_date +
    "}";
    }
}
