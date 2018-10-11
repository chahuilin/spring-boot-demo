package com.zhexinit.taobaocrbt.controller;

import com.zhexinit.taobaocrbt.entity.ZSpeaker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WelcomeControllerTest {

    @Autowired
    private
    WelcomeController controller;

    @Test
    public void welcome() {
    }

    @Test
    public void testCache() {
        ZSpeaker zSpeaker = controller.testCache(1);
        System.out.print(zSpeaker);

        zSpeaker = controller.testCache(1);
        System.out.print(zSpeaker);
    }

    @Test
    public void cacheEvict() {
    }

    @Test
    public void testredis() {
    }
}