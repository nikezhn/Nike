package com.cssl.entity;

    import com.baomidou.mybatisplus.annotation.IdType;
    import com.baomidou.mybatisplus.extension.activerecord.Model;
    import com.baomidou.mybatisplus.annotation.TableId;
    import java.io.Serializable;

/**
* <p>
    * 
    * </p>
*
* @author aguang
* @since 2019-09-28
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
            * 商品编号
            */
    private Integer np_id;

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
        public Integer getNp_id() {
        return np_id;
        }

            public void setNp_id(Integer np_id) {
        this.np_id = np_id;
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
            ", np_id=" + np_id +
            ", node_total_money=" + node_total_money +
    "}";
    }
}
