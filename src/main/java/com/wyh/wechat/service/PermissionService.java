package com.wyh.wechat.service;

import com.wyh.wechat.entity.SysPermission;

import java.util.List;

/**
 * Created by Administrator on 2018/1/7.
 */
public interface PermissionService {
    void saveUpdate(SysPermission sysPermission);
    void delById(Long id);
    SysPermission getById(Long id);
    List<SysPermission> getAll();
}
