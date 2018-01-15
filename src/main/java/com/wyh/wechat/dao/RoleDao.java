package com.wyh.wechat.dao;

import com.wyh.wechat.entity.SysRole;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RoleDao extends CrudRepository<SysRole,Long> {
    List<SysRole> findAllByRole(String role);
}