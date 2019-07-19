package com.stylefeng.guns.api.user;

/**
 * @Author: ZhangYang
 * @Date: 2019/7/4 16:44
 */
public interface UserAPI {

    int login(String username, String password);

    boolean register(UserModel userModel);

    boolean checkUsername(String name);

    UserInfoModel getUserInfo(int uuid);

    UserInfoModel updateUserInfo(UserInfoModel userInfoModel);
}
