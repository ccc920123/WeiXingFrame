package com.jysd.weixing.framelib.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.jysd.weixing.framelib.common.api.WxErrorExceptionHandler;
import com.jysd.weixing.framelib.common.exception.WxErrorException;


public class LogExceptionHandler implements WxErrorExceptionHandler {

  private Logger log = LoggerFactory.getLogger(WxErrorExceptionHandler.class);

  @Override
  public void handle(WxErrorException e) {

    log.error("Error happens", e);

  }

}
