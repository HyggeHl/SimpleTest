package com.test.springboottest.myTest.thread;

import org.junit.jupiter.api.Test;

/**
 * @program: SimpleTest
 * @description:
 * @author: hygge
 * @create: 2023/08/28
 */
public class RunAndStartTest {

  Thread threadStart = new Thread(new Runnable() {
    @Override
    public void run() {
      Thread curThread = Thread.currentThread();
      System.out.println("当前线程：" + curThread.getName());
    }
  });


  @Test
  /**
   * 当前线程：Thread-1
   */
  public void startTest() {
    threadStart.start();
  }

  @Test
  /**
   * 当前线程：main
   */
  public void runTest() {
    threadStart.run();
  }
}
