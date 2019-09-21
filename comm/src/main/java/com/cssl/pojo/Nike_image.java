package com.cssl.pojo;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
/**
 * 商品图片表
 */
public class Nike_image {

    private int ni_images_id;       //图片编号
    private String ni_images_url;   //图片名称
    private int nc_id;              //商品颜色编号

}
