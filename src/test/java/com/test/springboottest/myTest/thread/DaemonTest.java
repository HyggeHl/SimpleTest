package com.test.springboottest.myTest.thread;

import java.util.concurrent.TimeUnit;

/**
 * @program: SimpleTest
 * @description: DaemonTest
 * @author: hygge
 * @create: 2023/08/28
 */
public class DaemonTest {

  public static void main(String[] args) {
    Thread childThread = new Thread(new Runnable() {
      @Override
      public void run() {
        while (true) {
          System.out.println("I'm child thread..");
          try {
            TimeUnit.MICROSECONDS.sleep(1000);
          } catch (InterruptedException e) {
            throw new RuntimeException(e);
          }
        }
      }
    });

    childThread.setDaemon(true);
    childThread.start();
    System.out.println("I'm main thread...");
  }
}
