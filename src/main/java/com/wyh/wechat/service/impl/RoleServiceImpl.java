package com.wyh.wechat.service.impl;

import com.wyh.wechat.dao.RoleDao;
import com.wyh.wechat.entity.SysRole;
import com.wyh.wechat.entity.UserInfo;
import com.wyh.wechat.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/1/7.
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;

    /**
     * 保存或更新角色
     * @param sysRole
     */
    public void saveUpdate(SysRole sysRole){
        roleDao.save(sysRole);
    }

    public void delById(Long id){
        roleDao.delete(id);
    }

    /**
     * 获取单个角色
     * @param id
     * @return
     */
    public SysRole getById(Long id){
        return roleDao.findOne(id);
    }

    public List<SysRole> getAll(){
        List<SysRole> roles = (List<SysRole>) roleDao.findAll();
        return roles;
    }

    @Override
    public List<SysRole> findAllByRole(String role) {
        return roleDao.findAllByRole(role);
    }
}
