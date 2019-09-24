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
    public class Nike_enshrine extends Model<Nike_enshrine> {

    private static final long serialVersionUID = 1L;

            /**
            * 收藏编号
            */
            @TableId(value = "ne_id", type = IdType.AUTO)
    private Integer ne_id;

            /**
            * 商品编号
            */
    private Integer np_id;

            /**
            * 用户编号
            */
    private Integer nu_id;

        public Integer getNe_id() {
        return ne_id;
        }

            public void setNe_id(Integer ne_id) {
        this.ne_id = ne_id;
        }
        public Integer getNp_id() {
        return np_id;
        }

            public void setNp_id(Integer np_id) {
        this.np_id = np_id;
        }
        public Integer getNu_id() {
        return nu_id;
        }

            public void setNu_id(Integer nu_id) {
        this.nu_id = nu_id;
        }

    @Override
    protected Serializable pkVal() {
        return this.ne_id;
    }

    @Override
    public String toString() {
    return "Nike_enshrine{" +
            "ne_id=" + ne_id +
            ", np_id=" + np_id +
            ", nu_id=" + nu_id +
    "}";
    }
}
