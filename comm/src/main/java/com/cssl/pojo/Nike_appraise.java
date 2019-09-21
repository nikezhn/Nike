package com.cssl.pojo;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
/**
 * 留言评价表
 */
public class Nike_appraise {

    private int na_id;          //评价编号
    private int np_id;          //商品编号
    private String na_leave;    //商品留言
    private Date na_date;       //留言时间
    private String na_images;   //留言图片
    private  String na_explain; //留言解释
}
