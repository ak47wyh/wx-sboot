package com.wyh.wechat;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.google.gson.Gson;
import com.wyh.wechat.dao.PermissionDao;
import com.wyh.wechat.dao.RoleDao;
import com.wyh.wechat.dao.UserInfoDao;
import com.wyh.wechat.entity.UserInfo;
import com.wyh.wechat.service.PermissionService;
import com.wyh.wechat.service.RoleService;
import com.wyh.wechat.service.UserInfoService;
import com.wyh.wechat.utils.JsonUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {

  @Test
  public void contextLoads() {
  }

  @Autowired
  private UserInfoDao userInfoDao;
  @Autowired
  private RoleDao roleDao;
  @Autowired
  private PermissionDao permissionDao;

  @Test
  public void testDao(){
    Object object = userInfoDao.findAll();
//    Object object = roleDao.findAll();
//    Object object = permissionDao.findAll();
    System.out.println("-------------------------start");
    System.out.println(JSONObject.toJSONString(object));

    System.out.println("-------------------------end");
  }

  @Autowired
  private UserInfoService userInfoService;
  @Autowired
  private RoleService roleService;
  @Autowired
  private PermissionService permissionService;
  @Test
  public void testService(){
//    Object object = userInfoService.findByUsername("admin");
//    Object object = roleService.getAll();
    Object object = permissionService.getAll();
    System.out.println(object);
  }

}