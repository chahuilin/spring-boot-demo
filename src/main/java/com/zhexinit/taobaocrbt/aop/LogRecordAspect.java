package com.zhexinit.taobaocrbt.aop;


import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * 用aop记录controller所有请求的参数，响应结果，执行时间
 *
 * @author 12652
 */
@Aspect
@Configuration
@Log4j2
public class LogRecordAspect {

    @Around("execution(* com.zhexinit.taobaocrbt.controller..*.*(..))")
    public Object doAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long begin = System.currentTimeMillis();
        Object[] args = proceedingJoinPoint.getArgs();
        log.debug("请求执行方法：{}.{}", proceedingJoinPoint.getTarget().getClass(), proceedingJoinPoint.getSignature().getName());
        log.debug("方法参数：{}", Arrays.toString(args));
        Object o = proceedingJoinPoint.proceed();
        long end = System.currentTimeMillis();
        log.debug("执行结果：{}", o);
        log.debug("执行耗时:{} ms", (end - begin));
        return o;
    }
}
