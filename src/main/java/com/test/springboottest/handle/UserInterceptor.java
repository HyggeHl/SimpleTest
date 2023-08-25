package com.test.springboottest.handle;

import com.test.springboottest.Entity.SysUser;
import com.test.springboottest.utils.UserThreadLocal;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: springbootTest
 * @description: UserInterceptor
 * @author: hygge
 * @create: 2023/07/07
 */
public class UserInterceptor implements HandlerInterceptor {
  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {


    Map<String, String> headerMap = new HashMap<>();
    Enumeration<String> enumeration = request.getHeaderNames();
    while (enumeration.hasMoreElements()) {
      String name	= enumeration.nextElement();
      String value = request.getHeader(name);
      headerMap.put(name, value);
    }


    SysUser sysUser = SysUser.builder()
      .id(headerMap.get("id"))
      .name(headerMap.get("name"))
      .tel(headerMap.get("tel"))
      .build();
    UserThreadLocal.set(sysUser);
    return true;
  }

  @Override
  public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception e) {
    UserThreadLocal.remove();
  }
}
