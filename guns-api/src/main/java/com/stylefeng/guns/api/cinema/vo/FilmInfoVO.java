package com.stylefeng.guns.api.cinema.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: ZhangYang
 * @Date: 2019/7/8 17:01
 */
@Data
public class FilmInfoVO implements Serializable {

    private  String filmId;
    private  String filmName;
    private  String filmLength;
    private  String filmType;
    private  String filmCats;
    private  String actors;
    private  String imgAddress;
    private List<FilmFieldVO> filmFields;


}
