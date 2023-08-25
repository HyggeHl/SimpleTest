package com.test.springboottest.myTest.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @program: springbootTest
 * @description:
 * @author: hygge
 * @create: 2023/08/14
 */
public class ArrayTest {

  @Test
  void arrayTest() {
    Integer[] numberArr = {5, 6, 7, 8};

    System.out.println(Arrays.asList(numberArr).contains(5));

    List<Integer> list = Arrays.asList(numberArr);
  }
}
