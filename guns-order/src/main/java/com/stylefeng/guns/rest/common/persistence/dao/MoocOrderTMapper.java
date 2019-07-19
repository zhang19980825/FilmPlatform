package com.stylefeng.guns.rest.common.persistence.dao;

import com.baomidou.mybatisplus.plugins.Page;
import com.stylefeng.guns.api.order.vo.OrderServiceVO;
import com.stylefeng.guns.rest.common.persistence.model.MoocOrderT;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 订单信息表 Mapper 接口
 * </p>
 *
 * @author jiangzh
 * @since 2018-09-20
 */
public interface MoocOrderTMapper extends BaseMapper<MoocOrderT> {

    String getSeatsByFieldId(@Param("fieldId") String fieldId);

    OrderServiceVO getOrderInfoById(@Param("orderId") String orderId);

    List<OrderServiceVO> getOrdersByUserId(@Param("userId") Integer userId, Page<OrderServiceVO> page);

    String getSoldSeatsByFieldId(@Param("fieldId") Integer fieldId);

}
