package com.test.springboottest.myTest.memory;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: springbootTest
 * @description: 内存溢出
 * @author: hygge
 * @create: 2023/07/10
 */
public class MemoryLeakDemo {
  @Test
  void memoryLeak() {
    List<Object> objectList = new ArrayList<>();
    while(true) {
      objectList.add(new Object());
    }
  }

  public static void main(String[] args) {
    List<Object> objectList = new ArrayList<>();
    while(true) {
      objectList.add(new Object());
    }
  }
}
