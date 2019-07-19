package com.stylefeng.guns.api.order.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: ZhangYang
 * @Date: 2019/7/10 11:08
 */
@Data
public class OrderServiceVO implements Serializable {
    private String orderId;
    private String filmName;
    private String fieldTime;
    private String cinemaName;
    private String seatsName;
    private String orderPrice;
    private String orderStatus;
    private String orderTimestamp;

}
