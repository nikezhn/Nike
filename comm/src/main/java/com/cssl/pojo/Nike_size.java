package com.cssl.pojo;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
//尺寸表
public class Nike_size {
    private  int ns_id;          //尺码编号
    private  int nc_id;          //颜色编号
    private  String ns_size;     //商品尺码
    private  int ns_repertory;  //商品库存
}
