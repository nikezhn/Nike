package com.cssl.pojo;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
//订单表
public class Nike_order_detail {
    private int nod_id;         //订单详情编号
    private String no_id;        //订单编号
    private int nda_id;         //送货地址编号
    private  String nod_state;  //支付状态,0:付款处理中,1:支付成功;
    private  double node_total;//总金额
}
