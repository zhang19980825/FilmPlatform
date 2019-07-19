package com.stylefeng.guns.rest.modular.example;

import com.stylefeng.guns.rest.common.CurrentUser;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 常规控制器
 *
 * @author fengshuonan
 * @date 2017-08-23 16:02
 */
@Controller
@RequestMapping("/hello")
public class ExampleController {

    @RequestMapping("")
    public ResponseEntity hello(/*@RequestBody SimpleObject simpleObject*/) {
        //System.out.println(simpleObject.getUser());

        System.out.println(CurrentUser.getCurrentUser());
        //userid->key->redis[userInfo]->30分钟
        //userid ->条件，去数据库取
        return ResponseEntity.ok("请求成功!");
    }
}
