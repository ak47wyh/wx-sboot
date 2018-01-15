package com.wyh.wechat.controller;

import com.wyh.wechat.entity.UserInfo;
import com.wyh.wechat.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2018/1/7.
 */
@Controller
public class UserController
{
    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping(value = "/findAllByUsername")
    @ResponseBody
    public List<UserInfo> findAllByUsername(String username){
        List<UserInfo> userInfos = userInfoService.findAllByUsername(username);
        return userInfos;
    }

    @RequestMapping("/userList")
    public String userList(){
        return "/userList";
    }

    @RequestMapping("/userUpd")
    public String userUpd(){
        return "/userUpd";
    }

    @RequestMapping("/userAdd")
    public String userAdd(){
        return "/userAdd";
    }

    @RequestMapping("/userDel")
    public String userDel(){
        return "/userDel";
    }
}
