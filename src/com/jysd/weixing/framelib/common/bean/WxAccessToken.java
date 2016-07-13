package com.jysd.weixing.framelib.common.bean;


import java.io.Serializable;

import com.jysd.weixing.framelib.common.util.json.WxGsonBuilder;

public class WxAccessToken implements Serializable {

  private String accessToken;
  
  private int expiresIn = -1;

  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public int getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(int expiresIn) {
    this.expiresIn = expiresIn;
  }

  public static WxAccessToken fromJson(String json) {
    return WxGsonBuilder.create().fromJson(json, WxAccessToken.class);
  }
  
}
