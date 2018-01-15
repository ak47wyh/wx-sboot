package com.wyh.wechat.dao;

import com.wyh.wechat.entity.UserInfo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserInfoDao extends CrudRepository<UserInfo,Long> {
    /**通过username查找用户信息;*/
    UserInfo findByUsername(String username);

    List<UserInfo> findAllByUsername(String username);
}