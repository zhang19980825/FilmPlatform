package com.stylefeng.guns.rest.modular.cinema.vo;

import com.stylefeng.guns.api.cinema.vo.CinemaVO;
import lombok.Data;

import javax.validation.constraints.Size;
import java.util.List;

/**
 * @Author: ZhangYang
 * @Date: 2019/7/8 18:22
 */
@Data
public class CinemaListResponseVO {
    private List<CinemaVO> cinemas;
}
