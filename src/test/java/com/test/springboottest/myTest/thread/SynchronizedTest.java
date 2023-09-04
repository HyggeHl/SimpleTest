package com.test.springboottest.myTest.thread;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: SimpleTest
 * @description:
 * @author: hygge
 * @create: 2023/08/31
 */
public class SynchronizedTest {
  int number = 0;

  public synchronized void increase() {
    number++;
  }

  @Test
  public void synchronizedTest() throws InterruptedException {
    SynchronizedTest instance = new SynchronizedTest();
    List<Thread> threads = new ArrayList<>();

    for(int i = 0; i < 10; i++) {
      for(int j = 0; j < 1000; j++) {
        Thread thread = new Thread(instance::increase);
        threads.add(thread);
        thread.start();
      }
    }

    for (Thread thread : threads) {
      thread.join(); // 等待每个线程执行完毕
    }

    System.out.println(Thread.currentThread().getName() + " final number result = " + instance.number);
  }
}
