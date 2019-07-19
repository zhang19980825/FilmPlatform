package com.stylefeng.guns.api.film.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: ZhangYang
 * @Date: 2019/7/6 16:05
 */
@Data
public class BannerVO implements Serializable {

    private String bannerId;
    private String bannerAddress;
    private String bannerUrl;
}
