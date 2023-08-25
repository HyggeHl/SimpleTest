package com.test.springboottest.myTest.hutool;

import cn.hutool.core.util.IdUtil;
import org.junit.jupiter.api.Test;

/**
 * @program: springbootTest
 * @description: Idtest
 * @author: hygge
 * @create: 2023/08/09
 */
public class IdTest {

  @Test
  void idTest() {
    System.out.println(IdUtil.getSnowflakeNextIdStr());
  }
}
