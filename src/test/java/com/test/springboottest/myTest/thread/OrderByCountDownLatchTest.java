package com.test.springboottest.myTest.thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: SimpleTest
 * @description:
 * @author: hugge
 * @create: 2023/09/03
 */
public class OrderByCountDownLatchTest {
  public static class MyThread implements Runnable {
    private CountDownLatch latch;
    public MyThread(CountDownLatch latch) {
      this.latch = latch;
    }
    @Override
    public void run() {
      try {
        // 模拟执行任务
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName() + " is Running.");
      } catch (InterruptedException e) {
        e.printStackTrace();
      } finally {
        // 完成一个线程，计数器减1
        latch.countDown();
      }
    }
  }

  public static void main(String[] args) throws InterruptedException {
    // 创建CountDownLatch对象,用来做线程通信
    CountDownLatch latch = new CountDownLatch(1);
    CountDownLatch latch2 = new CountDownLatch(1);
    CountDownLatch latch3 = new CountDownLatch(1);
    // 创建并启动线程T1
    Thread t1 = new Thread(new MyThread(latch), "T1");
    t1.start();
    // 等待线程T1执行完
    latch.await();
    // 创建并启动线程T2
    Thread t2 = new Thread(new MyThread(latch2), "T2");
    t2.start();
    // 等待线程T2执行完
    latch2.await();
    // 创建并启动线程T3
    Thread t3 = new Thread(new MyThread(latch3), "T3");
    t3.start();
    // 等待线程T3执行完
    latch3.await();

    ReentrantLock lock = new ReentrantLock();

    CyclicBarrier
  }
}
