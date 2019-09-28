package com.cssl.entity;

    import com.baomidou.mybatisplus.annotation.IdType;
    import com.baomidou.mybatisplus.extension.activerecord.Model;
    import com.baomidou.mybatisplus.annotation.TableId;
    import java.time.LocalDateTime;
    import java.io.Serializable;

/**
* <p>
    * 
    * </p>
*
* @author aguang
* @since 2019-09-28
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
            * 订单时间
            */
    private LocalDateTime no_date;

            /**
            * 地址编号
            */
    private Integer daid;

            /**
            * 支付状态,0:付款处理中,1:支付成功;
            */
    private Integer no_state;

            /**
            * 订单状态
            */
    private Integer no_status;

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
        public LocalDateTime getNo_date() {
        return no_date;
        }

            public void setNo_date(LocalDateTime no_date) {
        this.no_date = no_date;
        }
        public Integer getDaid() {
        return daid;
        }

            public void setDaid(Integer daid) {
        this.daid = daid;
        }
        public Integer getNo_state() {
        return no_state;
        }

            public void setNo_state(Integer no_state) {
        this.no_state = no_state;
        }
        public Integer getNo_status() {
        return no_status;
        }

            public void setNo_status(Integer no_status) {
        this.no_status = no_status;
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
            ", no_date=" + no_date +
            ", daid=" + daid +
            ", no_state=" + no_state +
            ", no_status=" + no_status +
    "}";
    }
}
