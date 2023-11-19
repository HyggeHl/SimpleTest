package com.test.springboottest.myTest.String;

import org.junit.jupiter.api.Test;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.InitializingBean;

import java.nio.charset.Charset;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * @program: springbootTest
 * @description: 编码
 * @author: hygge
 * @create: 2023/08/07
 */
public class CodeTest implements InitializingBean {

  @Test
  void codeTest() {
//    Charset defaultCharset = Charset.defaultCharset();
//    System.out.println("Default Encoding: " + defaultCharset);
//
//
//    String a = "你好";
//    System.out.println(a.getBytes().length);

//    System.out.println("Hu".toLowerCase());

    String s1 = new String("aaa");
    String s2 = new String("aaa");
    System.err.println(s1.equals(s2));

    StringBuilder sb1 = new StringBuilder("aaa");
    StringBuilder sb2 = new StringBuilder("aaa");
    System.err.println(sb1.equals(sb2));
  }


  @Override
  public void afterPropertiesSet() throws Exception {

  }

  //反转链表


}
