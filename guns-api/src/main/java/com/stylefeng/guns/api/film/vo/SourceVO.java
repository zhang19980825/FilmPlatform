package com.stylefeng.guns.api.film.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: ZhangYang
 * @Date: 2019/7/6 19:26
 */

@Data
public class SourceVO implements Serializable {
    private String sourceId;
    private String sourceName;
    private boolean isActive;
}
