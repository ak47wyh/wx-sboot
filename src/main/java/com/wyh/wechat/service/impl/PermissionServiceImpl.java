package com.wyh.wechat.service.impl;

import com.wyh.wechat.dao.PermissionDao;
import com.wyh.wechat.entity.SysPermission;
import com.wyh.wechat.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Created by Administrator on 2018/1/7.
 */
@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionDao permissionDao;

    @Override
    public void saveUpdate(SysPermission sysPermission) {
        permissionDao.save(sysPermission);
    }

    @Override
    public void delById(Long id) {
        permissionDao.delete(id);
    }

    @Override
    public SysPermission getById(Long id) {
        return permissionDao.findOne(id);
    }

    @Override
    public List<SysPermission> getAll() {
        List<SysPermission> permissions = (List<SysPermission>) permissionDao.findAll();
        return permissions;
    }
}
