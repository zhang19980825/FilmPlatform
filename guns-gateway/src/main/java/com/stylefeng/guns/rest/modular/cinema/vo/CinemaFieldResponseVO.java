package com.stylefeng.guns.rest.modular.cinema.vo;

import com.stylefeng.guns.api.cinema.vo.CinemaInfoVO;
import com.stylefeng.guns.api.cinema.vo.FilmInfoVO;
import com.stylefeng.guns.api.cinema.vo.HallInfoVO;
import lombok.Data;

/**
 * @Author: ZhangYang
 * @Date: 2019/7/8 18:47
 */
@Data
public class CinemaFieldResponseVO {
    private CinemaInfoVO cinemaInfoVO;
    private FilmInfoVO filmInfoVO;
    private HallInfoVO hallInfoVO;
}
