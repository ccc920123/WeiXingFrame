package com.jysd.weixing.framelib.common.api;

import com.jysd.weixing.framelib.common.exception.WxErrorException;


/**
 * WxErrorException处理器
 */
public interface WxErrorExceptionHandler {

  public void handle(WxErrorException e);

}
