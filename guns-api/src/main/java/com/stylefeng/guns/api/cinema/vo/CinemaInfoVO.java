package com.stylefeng.guns.api.cinema.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: ZhangYang
 * @Date: 2019/7/8 16:59
 */
@Data
public class CinemaInfoVO implements Serializable {
    private String cinemaId;
    private String imgUrl;
    private String cinemaName;
    private String cinemaAdress;
    private String cinemaPhone;
}
