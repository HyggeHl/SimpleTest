package com.test.springboottest.utils;

import com.test.springboottest.Entity.SysUser;

/**
 * @program: springbootTest
 * @description: UserThreadLocal
 * @author: hygge
 * @create: 2023/07/07
 */
public class UserThreadLocal {

  private static ThreadLocal<SysUser> LOCAL = new ThreadLocal<>();

  public static SysUser get() {
    return LOCAL.get();
  }

  public static void set(SysUser sysUser) {
    LOCAL.set(sysUser);
  }

  public static void remove() {
    LOCAL.remove();
  }
}
