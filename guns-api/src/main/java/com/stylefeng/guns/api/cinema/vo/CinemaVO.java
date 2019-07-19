package com.stylefeng.guns.api.cinema.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: ZhangYang
 * @Date: 2019/7/8 16:34
 */
@Data
public class CinemaVO implements Serializable {
    private String uuid;
    private String cinemaName;
    private String address;
    private String minimumPrice;
}
