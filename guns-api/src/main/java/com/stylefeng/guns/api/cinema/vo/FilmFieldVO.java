package com.stylefeng.guns.api.cinema.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: ZhangYang
 * @Date: 2019/7/8 17:02
 */
@Data
public class FilmFieldVO implements Serializable {
    private  String fieldId;
    private  String beginTime;
    private  String endTime;
    private  String language;
    private  String hallName;
    private  String price;
}
