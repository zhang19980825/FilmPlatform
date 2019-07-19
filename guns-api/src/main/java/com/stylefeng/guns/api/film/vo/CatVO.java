package com.stylefeng.guns.api.film.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: ZhangYang
 * @Date: 2019/7/6 19:25
 */

@Data
public class CatVO implements Serializable {
    private  String catId;
    private  String catName;
    private  boolean isActive;
}
