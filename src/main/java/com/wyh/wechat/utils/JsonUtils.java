package com.wyh.wechat.utils;

import com.wyh.wechat.entity.UserInfo;
import me.chanjar.weixin.mp.util.json.WxMpGsonBuilder;
import org.apache.catalina.mapper.Mapper;

/**
 * @author Binary Wang(https://github.com/binarywang)
 */
public class JsonUtils {
  public static String toJson(Object obj) {
    return WxMpGsonBuilder.create().toJson(obj);
  }

  public static String toJsonStr(Object obj) {
    return WxMpGsonBuilder.create().toJson(obj);
  }
}
