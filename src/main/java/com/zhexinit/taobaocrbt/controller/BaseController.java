
package com.zhexinit.taobaocrbt.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;


public class BaseController {

    /**
     * controller错误统一处理
     */
    @ExceptionHandler({Exception.class})
    @ResponseBody
    public Object Exception(Exception e) {
        e.printStackTrace();
        HashMap<Object, Object> map = new HashMap<>();
        map.put("code", -1);
        map.put("msg", e.toString());
        return map;
    }

}
