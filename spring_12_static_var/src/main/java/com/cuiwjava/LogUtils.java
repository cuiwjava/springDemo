package com.cuiwjava;

import com.cuiwjava.service.SysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LogUtils {
private static SysLogService sysLogService;
@Autowired
public void setSysLogService(SysLogService sysLogService) {
LogUtils.sysLogService = sysLogService;
}
}