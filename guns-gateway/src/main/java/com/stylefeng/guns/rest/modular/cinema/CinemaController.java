package com.stylefeng.guns.rest.modular.cinema;

import com.alibaba.dubbo.config.annotation.Reference;

import com.baomidou.mybatisplus.plugins.Page;
import com.stylefeng.guns.api.cinema.CinemaServiceAPI;
import com.stylefeng.guns.api.cinema.vo.*;
import com.stylefeng.guns.api.order.OrderServiceAPI;
import com.stylefeng.guns.rest.modular.cinema.vo.CinemaConditionRespomseVO;
import com.stylefeng.guns.rest.modular.cinema.vo.CinemaFieldResponseVO;
import com.stylefeng.guns.rest.modular.cinema.vo.CinemaFieldsResponseVO;
import com.stylefeng.guns.rest.modular.vo.ResponseVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: ZhangYang
 * @Date: 2019/7/8 16:09
 */
@Slf4j
@RestController
@RequestMapping("/cinema/")
public class CinemaController {
    private static final String IMG_PRE="http://www.zahng19980825.top";

    @Reference(interfaceClass = CinemaServiceAPI.class,
            connections = 10,cache = "lru",check = false)
    private CinemaServiceAPI cinemaServiceAPI;


    @Reference(interfaceClass = OrderServiceAPI.class,check = false)
    private OrderServiceAPI orderServiceAPI;

    @RequestMapping("getCinemas")
    public ResponseVO getCinemas(CinemaQueryVO cinemaQueryVO){
        try {
            //按照五个条件进行筛选
            Page<CinemaVO> cinemas=cinemaServiceAPI.getCinemas(cinemaQueryVO);
            //判断是否有满足条件的影院
            if(cinemas.getRecords()==null||cinemas.getRecords().size()==0){
                return ResponseVO.success("没有影院可查");
            }else{
                return ResponseVO.success(cinemas.getCurrent(),(int)cinemas.getPages(),"",cinemas.getRecords());
            }
        } catch (Exception e) {
           log.error("获取影院列表异常");
           return ResponseVO.serviceFail("获取影院列表失败");
        }
    }

    //获取影院的查询条件
    /*
    * 1. 热点数据 ---》缓存处理
    * */
    @RequestMapping("getCondition")
    public ResponseVO getCondition(CinemaQueryVO cinemaQueryVO){
        try {
            //获取三个集合封装成一个对象返回即可
            List<BrandVO> brands= cinemaServiceAPI.getBrands(cinemaQueryVO.getBrandId());
            List<AreaVO> areas=cinemaServiceAPI.getAreas(cinemaQueryVO.getDistrictId());
            List<HallTypeVO> hallTypes=cinemaServiceAPI.getHallTypes(cinemaQueryVO.getHallType());
            CinemaConditionRespomseVO cinemaConditionRespomseVO=new CinemaConditionRespomseVO();
            cinemaConditionRespomseVO.setAreaList(areas);
            cinemaConditionRespomseVO.setBrandList(brands);
            cinemaConditionRespomseVO.setHallTypeList(hallTypes);
            return ResponseVO.success(cinemaConditionRespomseVO);
        } catch (Exception e) {
            log.error("获取条件列表异常");
            return ResponseVO.serviceFail("获取条件列表失败");
        }
    }

    @RequestMapping("getFields")
    public ResponseVO getFields(Integer cinemaId){
        try {
            CinemaInfoVO cinemaInfoVO=cinemaServiceAPI.getCinemaInfoById(cinemaId);
            List<FilmInfoVO> filmInfoByCinemaId=cinemaServiceAPI.getFilmInfoByCinemaId(cinemaId);
            CinemaFieldsResponseVO cinemaFieldResponseVO=new CinemaFieldsResponseVO();
            cinemaFieldResponseVO.setCinemaInfo(cinemaInfoVO);
            cinemaFieldResponseVO.setFilmList(filmInfoByCinemaId);
            return ResponseVO.success(IMG_PRE,cinemaFieldResponseVO);
        } catch (Exception e) {
            log.error("获取播放场次异常");
            return ResponseVO.serviceFail("获取播放场次失败");
        }
    }

    @RequestMapping(value = "getFieldInfo",method = RequestMethod.POST)
    public ResponseVO getFieldInfo(Integer cinemaId,Integer fieldId){
        try {
            CinemaInfoVO cinemaInfoVO=cinemaServiceAPI.getCinemaInfoById(cinemaId);
            FilmInfoVO filmInfoVO=cinemaServiceAPI.getFilmInfoByFieldId(cinemaId);
            HallInfoVO hallInfoVO=cinemaServiceAPI.getFilmFieldInfo(fieldId);

            //先造一点技术局  后续对接订单服务
            hallInfoVO.setSoldSeats(orderServiceAPI.getSoldSeatsByFieldId(fieldId));
            CinemaFieldResponseVO cinemaFieldsResponseVO=new CinemaFieldResponseVO();
            cinemaFieldsResponseVO.setCinemaInfoVO(cinemaInfoVO);
            cinemaFieldsResponseVO.setFilmInfoVO(filmInfoVO);
            cinemaFieldsResponseVO.setHallInfoVO(hallInfoVO);
            return ResponseVO.success(IMG_PRE,cinemaFieldsResponseVO);

        } catch (Exception e) {
            log.error("获取选座信息异常");
            return ResponseVO.serviceFail("获取选座信息失败");
        }
    }

}
