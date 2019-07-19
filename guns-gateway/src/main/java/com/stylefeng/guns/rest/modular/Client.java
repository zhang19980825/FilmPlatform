package com.stylefeng.guns.rest.modular;

import com.stylefeng.guns.api.user.UserAPI;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.stereotype.Component;

/**
 * @Author: ZhangYang
 * @Date: 2019/7/4 19:05
 */
@Component
public class Client {
    @Reference
    private UserAPI userAPI;

    public void run(){
        userAPI.login("admin","admin");
    }
}
