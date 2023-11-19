package com.test.springboottest.myTest.thread;

import org.junit.jupiter.api.Test;

import java.util.concurrent.CountDownLatch;

/**
 * @program: SimpleTest
 * @description:
 * @author: hugge
 * @create: 2023/10/09
 */
public class CountDownLatchWaitTest {
  int number = 0;

  public synchronized void increase() {
    number++;
  }

  @Test
  public void synchronizedTest() throws InterruptedException {
    CountDownLatchWaitTest instance = new CountDownLatchWaitTest();
    CountDownLatch countDownLatch = new CountDownLatch(10000);

    for(int i = 0; i < 10; i++) {
      for(int j = 0; j < 1000; j++) {
        Thread thread = new Thread(() -> {
          instance.increase();
          countDownLatch.countDown();
        });
        thread.start();

      }
    }

    countDownLatch.await();

    System.out.println(Thread.currentThread().getName() + " final number result = " + instance.number);
  }
}
