package com.stylefeng.guns.api.alipay.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: ZhangYang
 * @Date: 2019/7/11 17:00
 */
@Data
public class AliPayResultVO implements Serializable {
    private String orderId;
    private Integer orderStatus;
    private String orderMsg;
}
