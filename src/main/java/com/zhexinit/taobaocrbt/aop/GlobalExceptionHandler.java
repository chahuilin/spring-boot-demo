package com.zhexinit.taobaocrbt.aop;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author zhahuilin
 **/
@ControllerAdvice("com.zhexinit.taobaocrbt.controller")
@Log4j2
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler(Exception.class)
    @ResponseStatus
    public String handleException(Exception e) {
        log.error("服务运行异常:{}", e);
        return "服务运行异常";
    }
}
