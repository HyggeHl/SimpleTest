package com.test.springboottest.myTest.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program: SimpleTest
 * @description:
 * @author: hygge
 * @create: 2023/08/28
 */
public class ThreadPollTest {

  public void threadPoolTest() {
    ExecutorService executorService = Executors.newFixedThreadPool(3);
  }
}
