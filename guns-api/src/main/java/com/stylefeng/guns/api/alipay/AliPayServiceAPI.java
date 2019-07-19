package com.stylefeng.guns.api.alipay;

import com.stylefeng.guns.api.alipay.vo.AliPayInfoVO;
import com.stylefeng.guns.api.alipay.vo.AliPayResultVO;

/**
 * @Author: ZhangYang
 * @Date: 2019/7/11 16:57
 */
public interface AliPayServiceAPI {

    AliPayInfoVO getQRCode(String orderId);

    AliPayResultVO getOrderStatus(String orderId);
}
