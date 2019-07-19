package com.stylefeng.guns.api.cinema.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: ZhangYang
 * @Date: 2019/7/8 16:35
 */
@Data
public class BrandVO implements Serializable {
    private String brandId;
    private String brandName;
    private boolean isActive;
}
