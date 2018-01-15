package com.wyh.wechat.dao;

import com.wyh.wechat.entity.SysPermission;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Administrator on 2018/1/7.
 */
public interface PermissionDao extends CrudRepository<SysPermission,Long> {

}
