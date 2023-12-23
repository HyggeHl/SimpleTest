package com.test.springboottest.controller;

import com.alibaba.fastjson2.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.springboottest.Entity.SysUser;
import com.test.springboottest.Entity.TestPojo;
import com.test.springboottest.utils.UserThreadLocal;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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

//  @NoSensitive
  @RequestMapping("/test")
  public List<TestPojo> testDesensitization() throws JsonProcessingException {
    List<TestPojo> testPojoList = new ArrayList<>();
    TestPojo testPojo = new TestPojo();
    testPojo.setUserName("我是用户名");
    testPojo.setAddress("地球中国-北京市通州区京东总部2号楼");
    testPojo.setPhone("13782946666");
    testPojo.setPassword("sunyangwei123123123.");
    System.out.println(testPojo);

    TestPojo testPojo1 = JSON.parseObject(JSON.toJSONString(testPojo), TestPojo.class);
    System.out.println("fastjson2-object: " + testPojo1);


    ObjectMapper objectMapper = new ObjectMapper();
    String s = objectMapper.writeValueAsString(testPojo);
    System.out.println("fastxml-string: " + s);

    TestPojo testPojo2 = objectMapper.readValue(s, TestPojo.class);
    System.out.println("fastxml-object: " + testPojo2);

    testPojoList.add(testPojo);
    return testPojoList;
  }
}
