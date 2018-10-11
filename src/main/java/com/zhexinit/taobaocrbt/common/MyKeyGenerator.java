package com.zhexinit.taobaocrbt.common;

import org.springframework.cache.interceptor.KeyGenerator;

import java.lang.reflect.Method;

public class MyKeyGenerator implements KeyGenerator {

    @Override
    public Object generate(Object target, Method method, Object... params) {
        Object key= new BaseCacheKey(target,method,params);
        return key.toString();
    }
}
