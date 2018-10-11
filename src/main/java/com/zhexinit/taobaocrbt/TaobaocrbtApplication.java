package com.zhexinit.taobaocrbt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author zhahuilin
 */
@SpringBootApplication
@EnableCaching
@EnableAsync
@EnableSwagger2
public class TaobaocrbtApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaobaocrbtApplication.class, args);
    }
}
