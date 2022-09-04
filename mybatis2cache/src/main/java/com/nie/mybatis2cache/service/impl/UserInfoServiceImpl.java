package com.nie.mybatis2cache.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nie.mybatis2cache.domain.UserInfo;
import com.nie.mybatis2cache.mapper.UserInfoMapper;
import com.nie.mybatis2cache.service.UserInfoService;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

}
