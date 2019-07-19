package com.stylefeng.guns.api.cinema.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: ZhangYang
 * @Date: 2019/7/8 16:35
 */
@Data
public class AreaVO implements Serializable {
    private String areaId;
    private String areaName;
    private boolean isActive;
}
