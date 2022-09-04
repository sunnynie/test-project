package com.nie.mybatis2cache.domain;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("user_info")
@Data
public class UserInfo {

    @TableId(type = IdType.AUTO)
    private Integer id;
    private String userName;
    private String addrInfo;
}
