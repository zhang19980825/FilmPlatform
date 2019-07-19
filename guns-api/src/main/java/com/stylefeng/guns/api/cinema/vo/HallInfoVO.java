package com.stylefeng.guns.api.cinema.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: ZhangYang
 * @Date: 2019/7/8 17:06
 */
@Data
public class HallInfoVO implements Serializable {
    private String hallFieldId;
    private String hallName;
    private String price;
    private String seatFile;
    private String soldSeats;


}
