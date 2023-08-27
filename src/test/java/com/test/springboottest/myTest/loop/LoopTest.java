package com.test.springboottest.myTest.loop;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: SimpleTest
 * @description: LoopTest
 * @author: hugge
 * @create: 2023/08/27
 */
public class LoopTest {

  @Test
  public void loopTest() {
    List<Integer> aList = new ArrayList<>();
    aList.add(1);

    while(aList.size() == 1) {
      System.out.println("aList-length" + aList.size());
    }

    aList.add(2);

  }
}
