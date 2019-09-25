package com.cssl.pojo;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author aguang
 * @since 2019-09-25
 */
public class Authcode extends Model<Authcode> {

    private static final long serialVersionUID = 1L;

    /**
     * 验证码id
     */
    private Integer authcode_id;

    /**
     * 验证码
     */
    private Integer authcode_name;

    public Integer getAuthcode_id() {
        return authcode_id;
    }

    public void setAuthcode_id(Integer authcode_id) {
        this.authcode_id = authcode_id;
    }
    public Integer getAuthcode_name() {
        return authcode_name;
    }

    public void setAuthcode_name(Integer authcode_name) {
        this.authcode_name = authcode_name;
    }

    @Override
    protected Serializable pkVal() {
        return this.authcode_id;
    }

    @Override
    public String toString() {
        return "Authcode{" +
                "authcode_id=" + authcode_id +
                ", authcode_name=" + authcode_name +
                "}";
    }
}
