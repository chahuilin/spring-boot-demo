
package com.zhexinit.taobaocrbt.controller;

import com.zhexinit.taobaocrbt.entity.ZSpeaker;
import com.zhexinit.taobaocrbt.entity.ZSuberVip;
import com.zhexinit.taobaocrbt.mapper.xingbook.ZSpeakerMapper;
import com.zhexinit.taobaocrbt.mapper.xingbook_user.ZSuberVipMapper;
import com.zhexinit.taobaocrbt.service.ZSpeakerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author 12652
 */
@Controller
@RequestMapping("test")
public class WelcomeController extends BaseController {
    private static Logger logger = LoggerFactory.getLogger(WelcomeController.class);

    @Value("${application.message}")
    private String message;

    private final ZSuberVipMapper zSuberVipMapper;

    private final ZSpeakerMapper zSpeakerMapper;

    private final ZSpeakerService zSpeakerService;

    private final StringRedisTemplate template;

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    public WelcomeController(ZSpeakerMapper zSpeakerMapper, ZSuberVipMapper zSuberVipMapper, ZSpeakerService zSpeakerService, StringRedisTemplate template) {
        this.zSpeakerMapper = zSpeakerMapper;
        this.zSuberVipMapper = zSuberVipMapper;
        this.zSpeakerService = zSpeakerService;
        this.template = template;
    }

    @GetMapping("/")
    @ResponseBody
    public ZSuberVip welcome(Integer id) {
        logger.debug("application.message:{}", message);

        long count = zSpeakerMapper.countByExample(null);

        logger.debug("zSpeakerMapper计数:{}", count);

        ZSuberVip zSuberVip = zSuberVipMapper.selectByPrimaryKey(id);
        logger.debug("-------{}", zSuberVip);
        System.out.println(zSuberVip.getNickName());
        return zSuberVip;
    }

    @GetMapping("/testCache")
    @ResponseBody
    public ZSpeaker testCache(Integer id) {
        ZSpeaker zSpeaker = zSpeakerService.selectByPrimaryKey(id);
        logger.debug("-------{}", zSpeaker);
        return zSpeaker;
    }

    @GetMapping("/cacheEvict")
    @ResponseBody
    public String cacheEvict(Integer id) {
        zSpeakerService.asyc();
        zSpeakerService.cacheEvict(id);
        return "hello";
    }

    @GetMapping("/testredis")
    @ResponseBody
    public String testredis() {
        ValueOperations<String, String> ops = this.template.opsForValue();
        String key = "spring.boot.redis.test";
        if (!this.template.hasKey(key)) {
            logger.debug("-------set");
            ops.set(key, "foo");
        }
        System.out.println("Found key " + key + ", value=" + ops.get(key));
        return "hello";
    }


}
