package com.stylefeng.guns.core.uuid;

import java.util.UUID;

public class UUIDUtil {

    public static String genUuid(){
        return UUID.randomUUID().toString().replace("-","");
    }

}
