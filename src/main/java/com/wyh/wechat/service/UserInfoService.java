package com.wyh.wechat.service;

import com.wyh.wechat.entity.UserInfo;

import java.util.List;

public interface UserInfoService {
    /**通过username查找用户信息;*/
    UserInfo findByUsername(String username);

    List<UserInfo> findAllByUsername(String username);

}