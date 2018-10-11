package com.zhexinit.taobaocrbt.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PerformenceMonitor {

    private static Logger logger = LoggerFactory.getLogger(PerformenceMonitor.class);

    @Pointcut("execution(* com.zhexinit.taobaocrbt.controller..*.*(..))")
    private void pointCutMethod() {
    }

    //声明环绕通知
    @Around("pointCutMethod()")
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        long begin = System.currentTimeMillis();
        Object o = pjp.proceed();
        long end = System.currentTimeMillis();
        logger.debug("{},耗时:{}毫秒",pjp.getTarget().getClass()+"."+pjp.getSignature().getName(),(end-begin));
        return o;
    }

}
