package com.cssl.pojo;

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
    public class Nike_product_category extends Model<Nike_product_category> {

    private static final long serialVersionUID = 1L;

            /**
            * 商品分类编号
            */
    private Integer npc_id;

            /**
            * 商品分类名称
            */
    private String npc_name;

            /**
            * 商品父类编号
            */
    private Integer npc_parent_id;

        public Integer getNpc_id() {
        return npc_id;
        }

            public void setNpc_id(Integer npc_id) {
        this.npc_id = npc_id;
        }
        public String getNpc_name() {
        return npc_name;
        }

            public void setNpc_name(String npc_name) {
        this.npc_name = npc_name;
        }
        public Integer getNpc_parent_id() {
        return npc_parent_id;
        }

            public void setNpc_parent_id(Integer npc_parent_id) {
        this.npc_parent_id = npc_parent_id;
        }

    @Override
    protected Serializable pkVal() {
        return this.npc_id;
    }

    @Override
    public String toString() {
    return "Nike_product_category{" +
            "npc_id=" + npc_id +
            ", npc_name=" + npc_name +
            ", npc_parent_id=" + npc_parent_id +
    "}";
    }
}
