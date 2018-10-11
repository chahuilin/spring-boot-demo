package com.zhexinit.taobaocrbt.service;

import com.zhexinit.taobaocrbt.config.RedisCacheConfig;
import com.zhexinit.taobaocrbt.entity.ZSpeaker;
import com.zhexinit.taobaocrbt.mapper.xingbook.ZSpeakerMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author zhahuilin
 */
@Service
@CacheConfig(cacheNames = RedisCacheConfig.RESOURCE_CACHE)
public class ZSpeakerService {
    private static Logger logger = LoggerFactory.getLogger(ZSpeakerService.class);

    private final ZSpeakerMapper zSpeakerMapper;

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    public ZSpeakerService(ZSpeakerMapper zSpeakerMapper) {
        this.zSpeakerMapper = zSpeakerMapper;
    }

    @Cacheable
    public ZSpeaker selectByPrimaryKey(Integer id) {
        return zSpeakerMapper.selectByPrimaryKey(id);
    }

    @CacheEvict
    public void cacheEvict(Integer id) {
        logger.debug("清除缓存:{}", id);
    }

    @Async
    public void asyc() {
        try {
            Thread.sleep(3000L);
            logger.debug("等待三秒");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}