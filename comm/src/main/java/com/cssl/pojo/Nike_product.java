package com.cssl.pojo;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
//商品表
public class Nike_product {
  private  int np_id;           //商品编号
  private  String np_name;      //商品名称
  private  String np_describe; //商品描述
  private  String np_brand;     //商品品牌
  private  double np_price;    //商品价格
  private  int npc_id;          //一级分类编号
  private  int npc_two_id;      //二级分类编号
  private  int npc_three_id;   //三级分类编号
  private  String np_images;    //商品图片
  private  int np_color;        //商品颜色数量


}
