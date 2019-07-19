package com.stylefeng.guns.api.film.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: ZhangYang
 * @Date: 2019/7/6 19:27
 */
@Data
public class YearVO implements Serializable {
    private String yearId;
    private String yearName;
    private boolean isActive;

}
