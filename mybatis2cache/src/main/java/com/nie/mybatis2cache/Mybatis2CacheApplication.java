package com.nie.mybatis2cache;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("com.nie.*.mapper")
@EnableCaching
public class Mybatis2CacheApplication {
    public static void main(String[] args) {
        SpringApplication.run(Mybatis2CacheApplication.class, args);
        System.out.println("mybatis2cache 启动成功");
    }
}
