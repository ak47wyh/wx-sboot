package com.wyh.wechat.controller;

import com.wyh.wechat.entity.SysRole;
import com.wyh.wechat.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2018/1/7.
 */
@Controller
public class RoleController
{
    @Autowired
    private RoleService roleService;

    @RequestMapping(value = "/findAll")
    @ResponseBody
    public List<SysRole> findAllByRole(String role){
        return roleService.findAllByRole(role);
    }

    @RequestMapping("/roleList")
    public String roleList(){
        return "/roleList";
    }

    @RequestMapping("/roleUpd")
    public String roleUpd(){
        return "/roleUpd";
    }

    @RequestMapping("/roleAdd")
    public String roleAdd(){
        return "/roleAdd";
    }

    @RequestMapping("/roleDel")
    public String roleDel(){
        return "/roleDel";
    }
}
