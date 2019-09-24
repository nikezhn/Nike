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
    public class Nike_order_detail extends Model<Nike_order_detail> {

    private static final long serialVersionUID = 1L;

            /**
            * 订单详情编号
            */
            @TableId(value = "nod_id", type = IdType.AUTO)
    private Integer nod_id;

            /**
            * 订单编号
            */
    private String no_id;

            /**
            * 送货地址编号
            */
    private Integer nda_id;

            /**
            * 支付状态,0:付款处理中,1:支付成功;
            */
    private String nod_state;

            /**
            * 总金额
            */
    private Double node_total_money;

        public Integer getNod_id() {
        return nod_id;
        }

            public void setNod_id(Integer nod_id) {
        this.nod_id = nod_id;
        }
        public String getNo_id() {
        return no_id;
        }

            public void setNo_id(String no_id) {
        this.no_id = no_id;
        }
        public Integer getNda_id() {
        return nda_id;
        }

            public void setNda_id(Integer nda_id) {
        this.nda_id = nda_id;
        }
        public String getNod_state() {
        return nod_state;
        }

            public void setNod_state(String nod_state) {
        this.nod_state = nod_state;
        }
        public Double getNode_total_money() {
        return node_total_money;
        }

            public void setNode_total_money(Double node_total_money) {
        this.node_total_money = node_total_money;
        }

    @Override
    protected Serializable pkVal() {
        return this.nod_id;
    }

    @Override
    public String toString() {
    return "Nike_order_detail{" +
            "nod_id=" + nod_id +
            ", no_id=" + no_id +
            ", nda_id=" + nda_id +
            ", nod_state=" + nod_state +
            ", node_total_money=" + node_total_money +
    "}";
    }
}
