package com.cssl.pojo;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
//商品颜色表
public class Nike_color {

    private int nc_id;          //商品颜色编号
    private int  np_id;         //商品编号
    private String nc_color;    //商品颜色
    private String nc_style;    //商品款式
    private String nc_images;   //商品小图片
     private int nc_sales;      //商品销量
}
