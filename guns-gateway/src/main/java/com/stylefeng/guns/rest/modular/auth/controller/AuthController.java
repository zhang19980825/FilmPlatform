package com.stylefeng.guns.rest.modular.auth.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.stylefeng.guns.api.user.UserAPI;
import com.stylefeng.guns.core.exception.GunsException;
import com.stylefeng.guns.rest.common.exception.BizExceptionEnum;
import com.stylefeng.guns.rest.modular.auth.controller.dto.AuthRequest;
import com.stylefeng.guns.rest.modular.auth.controller.dto.AuthResponse;
import com.stylefeng.guns.rest.modular.auth.util.JwtTokenUtil;
import com.stylefeng.guns.rest.modular.auth.validator.IReqValidator;
import com.stylefeng.guns.rest.modular.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 请求验证的
 *
 * @author fengshuonan
 * @Date 2017/8/24 14:22
 */
@RestController
public class AuthController {

    @Reference(interfaceClass = UserAPI.class,check = false)
    private UserAPI userAPI;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    /*@Resource(name = "simpleValidator")
    private IReqValidator reqValidator;*/

    @RequestMapping(value = "${jwt.auth-path}")
    public ResponseVO<?> createAuthenticationToken(AuthRequest authRequest) {
        boolean validate = true;

        //去掉guns自带的用户名密码验证机制  使用自定义的
        int userId = userAPI.login(authRequest.getUserName(),authRequest.getPassword());
        if(userId==0){
            validate=false;
        }

       /* boolean validate = reqValidator.validate(authRequest);*/

        if (validate) {
            //random和key的token的生成
            final String randomKey = jwtTokenUtil.getRandomKey();
            final String token = jwtTokenUtil.generateToken(""+userId, randomKey);;
            //返回值
            return ResponseVO.success(new AuthResponse(token, randomKey));
            //return ResponseEntity.ok(new AuthResponse(token, randomKey));

        } else {
            return ResponseVO.serviceFail("用户名或密码错误");
            //throw new GunsException(BizExceptionEnum.AUTH_REQUEST_ERROR);
        }
    }
}
