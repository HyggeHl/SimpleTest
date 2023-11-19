package com.test.springboottest.myTest.thread;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @program: SimpleTest
 * @description:
 * @author: hugge
 * @create: 2023/11/10
 */
public class CyclicBarrierPig {
  public static void main(String[] args) {
    ExecutorService service = Executors.newFixedThreadPool(5);
    CyclicBarrier barrier = new CyclicBarrier(5, () -> {
      System.out.println("主人看看哪个猪跑最快，最肥...");
    });

    // 循环跑3次
    for (int i = 0; i < 3; i++) {
      // 5条猪开始跑
      for(int j = 0; j<5; j++) {
        int finalJ = j;
        service.submit(() -> {
          System.out.println("pig" + finalJ +" is run .....");
          try {
            // 随机时间，模拟跑花费的时间
            Thread.sleep(new Random().nextInt(5000));
            System.out.println("pig" + finalJ + " reach barrier .....");
            barrier.await();
          } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
          }
        });
      }
    }
    service.shutdown();

    System.out.println("执行完了");
  }
}
