package com.cssl.pojo;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
/**
 * 订单表
 */
public class Nike_order {

    private int no_id;      //订单编号
    private int nu_id;      //用户编号
    private int np_id;      //商品编号
    private Date no_date;   //下单时间
}
