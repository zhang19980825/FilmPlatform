package com.stylefeng.guns.rest.modular.cinema.vo;

import com.stylefeng.guns.api.cinema.vo.AreaVO;
import com.stylefeng.guns.api.cinema.vo.BrandVO;
import com.stylefeng.guns.api.cinema.vo.HallTypeVO;
import lombok.Data;

import java.util.List;

/**
 * @Author: ZhangYang
 * @Date: 2019/7/8 18:29
 */
@Data
public class CinemaConditionRespomseVO {
    private List<BrandVO> brandList;
    private List<AreaVO> areaList;
    private List<HallTypeVO> hallTypeList;
}
