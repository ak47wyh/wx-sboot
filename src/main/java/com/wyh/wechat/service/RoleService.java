package com.wyh.wechat.service;

import com.wyh.wechat.entity.SysRole;
import com.wyh.wechat.entity.UserInfo;

import java.util.List;

/**
 * Created by Administrator on 2018/1/7.
 */
public interface RoleService {
    void saveUpdate(SysRole sysRole);
    void delById(Long id);
    SysRole getById(Long id);
    List<SysRole> getAll();

    List<SysRole> findAllByRole(String role);
}
