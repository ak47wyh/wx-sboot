package com.wyh.wechat.service.impl;

import com.wyh.wechat.dao.UserInfoDao;
import com.wyh.wechat.entity.UserInfo;
import com.wyh.wechat.service.UserInfoService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    private UserInfoDao userInfoDao;

    @Override
    public UserInfo findByUsername(String username) {
        return userInfoDao.findByUsername(username);
    }

    @Override
    public List<UserInfo> findAllByUsername(String username) {
        System.out.println("UserInfoServiceImpl.findAllByUsername()");
        List<UserInfo> userInfos;
        if(StringUtils.isEmpty(username)){
            userInfos = (List<UserInfo>) userInfoDao.findAll();
        }else {
            userInfos = userInfoDao.findAllByUsername(username);
        }
        return userInfos;
    }

}