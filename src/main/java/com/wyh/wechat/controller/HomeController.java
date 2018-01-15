package com.wyh.wechat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/1/7.
 */
@Controller
public class HomeController
{
    @RequestMapping("/services")
    public String services(){
        return "/services";
    }

    @RequestMapping("/about_us")
    public String about_us(){
        return "/about_us";
    }

    @RequestMapping("/blog")
    public String blog(){
        return "/blog";
    }

    @RequestMapping("/careers")
    public String careers(){
        return "/careers";
    }

    @RequestMapping("/products")
    public String products(){
        return "/products";
    }

    @RequestMapping("/contact_us")
    public String contact_us(){
        return "/contact_us";
    }

}
