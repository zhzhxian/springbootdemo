package com.zzx.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * 测试案例
 */
@MapperScan("com.zzx.demo.**.mapper")
@EnableCaching
@SpringBootApplication
public class Springbootdemo01Application {
    public static void main(String[] args) {
        SpringApplication.run(Springbootdemo01Application.class, args);
    }

}
