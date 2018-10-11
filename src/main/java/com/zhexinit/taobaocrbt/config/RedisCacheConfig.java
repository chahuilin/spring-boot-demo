package com.zhexinit.taobaocrbt.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.cache.RedisCacheWriter;
import org.springframework.data.redis.connection.RedisConnectionFactory;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhahuilin
 */
@Configuration
public class RedisCacheConfig extends CachingConfigurerSupport {
    private static Logger logger = LoggerFactory.getLogger(RedisCacheConfig.class);

    public static final String RESOURCE_CACHE = "RESOURCE_CACHE";

    private static final String USER_CACHE = "USER_CACHE";


    @Bean
    CacheManager cacheManager(RedisConnectionFactory connectionFactory) {

        //默认配置， 默认超时时间为30分钟
        RedisCacheConfiguration defaultCacheConfig = RedisCacheConfiguration.defaultCacheConfig().entryTtl(Duration
                .ofMinutes(30L)).disableCachingNullValues();

        //设置不同cacheName的过期时间
        Map<String, RedisCacheConfiguration> cacheConfigurations = new HashMap<>(4);
        cacheConfigurations.put(RESOURCE_CACHE, RedisCacheConfiguration.defaultCacheConfig().entryTtl(Duration.ofMinutes(60L)));
        cacheConfigurations.put(USER_CACHE, RedisCacheConfiguration.defaultCacheConfig().entryTtl(Duration.ofMinutes(50L)));

        return RedisCacheManager.builder(RedisCacheWriter.lockingRedisCacheWriter
                (connectionFactory)).cacheDefaults(defaultCacheConfig).withInitialCacheConfigurations(cacheConfigurations).transactionAware().build();
    }


    @Override
    @Bean
    public KeyGenerator keyGenerator() {
        return (target, method, params) -> {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(target.getClass().getName());
            stringBuilder.append(".");
            stringBuilder.append(method.getName());
            stringBuilder.append("[");
            for (Object obj : params) {
                stringBuilder.append(obj.toString());
            }
            stringBuilder.append("]");
            logger.info("缓存key：" + stringBuilder);
            return stringBuilder.toString();
        };
    }


}
