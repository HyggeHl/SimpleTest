package com.test.springboottest.myTest.String;

import org.junit.jupiter.api.Test;

import java.nio.charset.Charset;

/**
 * @program: springbootTest
 * @description: 编码
 * @author: hygge
 * @create: 2023/08/07
 */
public class CodeTest {

  @Test
  void codeTest() {
    Charset defaultCharset = Charset.defaultCharset();
    System.out.println("Default Encoding: " + defaultCharset);


    String a = "你好";
    System.out.println(a.getBytes().length);
  }
}
