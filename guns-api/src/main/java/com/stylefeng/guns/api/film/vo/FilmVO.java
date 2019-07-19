package com.stylefeng.guns.api.film.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: ZhangYang
 * @Date: 2019/7/6 16:34
 */

@Data
public class FilmVO implements Serializable {

    private int filmNum;
    private List<FilmInfo> filmInfo;
    private int totalPage;
    private int nowPage;
}
