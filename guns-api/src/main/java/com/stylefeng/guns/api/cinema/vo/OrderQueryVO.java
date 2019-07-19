package com.stylefeng.guns.api.cinema.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: ZhangYang
 * @Date: 2019/7/10 15:28
 */
@Data
public class OrderQueryVO implements Serializable {
    private String cinemaId;
    private String filmPrice;
}
