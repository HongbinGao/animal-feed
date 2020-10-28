package com.animal.feed;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * Application
 *
 * @author wangyp
 * @since 27 October 2020
 */
@EnableAsync
@MapperScan(basePackages = "com.animal.feed.dao")
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
