package com.stylefeng.guns.api.order;

import com.baomidou.mybatisplus.plugins.Page;
import com.stylefeng.guns.api.order.vo.OrderServiceVO;

import java.util.List;

/**
 * @Author: ZhangYang
 * @Date: 2019/7/10 11:03
 */
public interface OrderServiceAPI {

    //验证售出的票是否为真
    boolean isTrueSeats(String fieldId,String seats);
    //已经销售的座位里面有没有这些座位
    boolean isNotSoldSeats(String fieldId,String seats);
    //创建订单信息  获取登录人
    OrderServiceVO saveOrderInfo(Integer fieldId,String soldSeats,String seatsName,Integer userId);
    //使用当前登录人数获取已经购买的订单
    Page<OrderServiceVO> getOrderByUserId(Integer userId, Page<OrderServiceVO> page);
    //根据FieleId获取已经销售的座位编号
    String getSoldSeatsByFieldId(Integer fieldId);
    //根据订单编号获取订单信息
    OrderServiceVO getOrderInfoById(String orderId);

    boolean paySuccess(String orderId);

    boolean payFail(String orderId);
}
