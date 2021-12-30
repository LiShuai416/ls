package com.ls;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动类
 *
 */

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class LsApplication {
    public static void main(String[] args) {
        SpringApplication.run(LsApplication.class, args);
        System.out.println("  启动成功  ");
    }
}
