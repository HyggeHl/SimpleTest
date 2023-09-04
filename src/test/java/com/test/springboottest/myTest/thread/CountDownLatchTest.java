package com.test.springboottest.myTest.thread;

import org.junit.jupiter.api.Test;

import java.util.concurrent.*;

/**
 * @program: SimpleTest
 * @description: 模拟并发
 * @author: hygge
 * @create: 2023/08/30
 */
public class CountDownLatchTest {
  //并发数
  int clientTotal = 100;

  //库存
  int stock = 10;

  @Test
  public void countDownLatch() {
    ExecutorService executorService = new ThreadPoolExecutor(100, 200, 60,
      TimeUnit.MINUTES, new ArrayBlockingQueue<Runnable>(20000), Executors.defaultThreadFactory());

    CountDownLatch countDownLatch = new CountDownLatch(clientTotal);

    for (int i = 0; i < clientTotal; i++) {
      executorService.submit(new Runnable() {
        @Override
        public void run() {
          try {
            countDownLatch.await();
            if(stock > 0) {
              int nowStock = stock--;
              Thread curThread = Thread.currentThread();
              System.out.println("当前线程-" + curThread.getName() + "；库存：" + stock);
            }
          } catch (InterruptedException e) {
            throw new RuntimeException(e);
          }
        }
      });
      countDownLatch.countDown();
    }

    executorService.shutdown();
  }
}
