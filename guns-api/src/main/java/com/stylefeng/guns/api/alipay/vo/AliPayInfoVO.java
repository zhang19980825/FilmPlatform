package com.stylefeng.guns.api.alipay.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: ZhangYang
 * @Date: 2019/7/11 16:59
 */
@Data
public class AliPayInfoVO implements Serializable {
    private String orderId;
    private String QRCodeAddress;
}
