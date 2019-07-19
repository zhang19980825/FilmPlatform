package com.stylefeng.guns.rest.modular.film.vo;

import com.stylefeng.guns.api.film.vo.ActorVO;
import lombok.Data;

import java.util.List;

/**
 * @Author: ZhangYang
 * @Date: 2019/7/7 19:16
 */
@Data
public class ActorRequestVO {
    private ActorVO director;
    private List<ActorVO> actors;
}
