package com.cssl.pojo;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
//商品分类表
public class Nike_product_category {

    private  int npc_id;        //商品分类编号
    private  String npc_name;   //商品分类名称
    private  int npc_parent_id;//商品父类编号
}
