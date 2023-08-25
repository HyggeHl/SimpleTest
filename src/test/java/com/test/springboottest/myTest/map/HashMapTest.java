package com.test.springboottest.myTest.map;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: springbootTest
 * @description: test
 * @author: hygge
 * @create: 2023/07/19
 */
public class HashMapTest {

  @Test
  public void hashMapTest() {
//    Map<String, String> strMap = new HashMap<>();
//    strMap.put("a", "20");
//
//    System.out.println(strMap.get("a"));
//    System.out.println(strMap.get("ee"));
//
//
//    String a = "a";
//
//    String b = a;
//
//    b = "b";
//    System.out.println("a:" + a);
//    System.out.println("b:" + b);
//
//
//    String c = "hello";
//
//    System.out.println(c.substring(0, c.length() - 1));


    List<String> aL = new ArrayList<>();
    aL.add("aaa");
    aL.add("bbb");

    System.out.println(aL.remove(0));

    System.out.println(aL.size());
  }
}
