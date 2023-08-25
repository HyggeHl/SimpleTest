package com.test.springboottest.controller;

import com.test.springboottest.Entity.SysUser;
import com.test.springboottest.utils.UserThreadLocal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springbootTest
 * @description: TestController
 * @author: hygge
 * @create: 2023/07/07
 */
@RestController
@RequestMapping("test")
public class TestController {
  private static Logger logger = LoggerFactory.getLogger(TestController.class);

  @RequestMapping("testThreadLocal")
  void testThreadLocal() {
    SysUser sysUser = UserThreadLocal.get();
    logger.info("当前用户信息：" + sysUser);
  }
}
