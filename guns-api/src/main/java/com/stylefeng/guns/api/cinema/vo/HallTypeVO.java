package com.stylefeng.guns.api.cinema.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: ZhangYang
 * @Date: 2019/7/8 16:57
 */
@Data
public class HallTypeVO implements Serializable {
    private String halltypeId;
    private String halltypeName;
    private boolean isActive;
}
