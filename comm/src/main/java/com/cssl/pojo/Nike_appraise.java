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
    public class Nike_appraise extends Model<Nike_appraise> {

    private static final long serialVersionUID = 1L;

            /**
            * 评价编号
            */
            @TableId(value = "na_id", type = IdType.AUTO)
    private Integer na_id;

            /**
            * 商品编号
            */
    private Integer np_id;

            /**
            * 商品留言
            */
    private String na_leave;

            /**
            * 留言时间
            */
    private Date na_date;

            /**
            * 留言图片
            */
    private String na_images;

            /**
            * 留言解释
            */
    private String na_explain;

        public Integer getNa_id() {
        return na_id;
        }

            public void setNa_id(Integer na_id) {
        this.na_id = na_id;
        }
        public Integer getNp_id() {
        return np_id;
        }

            public void setNp_id(Integer np_id) {
        this.np_id = np_id;
        }
        public String getNa_leave() {
        return na_leave;
        }

            public void setNa_leave(String na_leave) {
        this.na_leave = na_leave;
        }
        public Date getNa_date() {
        return na_date;
        }

            public void setNa_date(Date na_date) {
        this.na_date = na_date;
        }
        public String getNa_images() {
        return na_images;
        }

            public void setNa_images(String na_images) {
        this.na_images = na_images;
        }
        public String getNa_explain() {
        return na_explain;
        }

            public void setNa_explain(String na_explain) {
        this.na_explain = na_explain;
        }

    @Override
    protected Serializable pkVal() {
        return this.na_id;
    }

    @Override
    public String toString() {
    return "Nike_appraise{" +
            "na_id=" + na_id +
            ", np_id=" + np_id +
            ", na_leave=" + na_leave +
            ", na_date=" + na_date +
            ", na_images=" + na_images +
            ", na_explain=" + na_explain +
    "}";
    }
}
