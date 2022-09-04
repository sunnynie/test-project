package com.nie.mybatis2cache.controller;

import com.nie.mybatis2cache.domain.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController("userInfo")
@Slf4j(topic = "userInfo-logger")
@CacheConfig(cacheNames = "userInfo")
public class UserInfoController {

    @GetMapping("test")
    public void test() {
        log.info("test-controller");
        System.out.println("controller test");
    }
    @GetMapping("getOne/{id}")
    @Cacheable(value = "list",key = "#id")
    public UserInfo getUserInfo(@PathVariable Integer id) {
        return new UserInfo();
    }
    @CachePut(value = "list",key = "#id")
    @GetMapping("insert/{id}")
    public void insert(@PathVariable Integer id){
    }
}
