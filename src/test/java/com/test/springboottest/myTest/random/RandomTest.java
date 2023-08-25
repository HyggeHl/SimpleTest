package com.test.springboottest.myTest.random;

import org.junit.jupiter.api.Test;

/**
 * @program: springbootTest
 * @description: test
 * @author: hygge
 * @create: 2023/07/21
 */
public class RandomTest {

  public static String CreateIDForLength(String flag) {
    int lenth = 20-flag.length();
    String[] array = new String[lenth];
    for (int i = 0; i < lenth; i++) {
      int x = (int) (Math.random() * 10);
      array[i] = String.valueOf(x);

    }
    String l = "";
    for (int i = 0; i < array.length; i++) {
      l += array[i];

    }
    String trString = flag + l;
    return trString;
  }

  @Test
  void testRandom() {
    String nwxkbyz = CreateIDForLength("NWXKBYZ");

    System.out.println(nwxkbyz);
  }
}
