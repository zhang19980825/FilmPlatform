package com.stylefeng.guns.rest.modular.cinema.vo;

import com.stylefeng.guns.api.cinema.vo.CinemaInfoVO;
import com.stylefeng.guns.api.cinema.vo.FilmInfoVO;
import lombok.Data;

import java.util.List;

/**
 * @Author: ZhangYang
 * @Date: 2019/7/8 18:37
 */
@Data
public class CinemaFieldsResponseVO {
    private CinemaInfoVO cinemaInfo;
    private List<FilmInfoVO> filmList;
}
