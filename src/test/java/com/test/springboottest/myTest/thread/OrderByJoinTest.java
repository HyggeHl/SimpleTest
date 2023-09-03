package com.test.springboottest.myTest.thread;

/**
 * @program: SimpleTest
 * @description:
 * @author: hugge
 * @create: 2023/09/03
 */
public class OrderByJoinTest {
  public static void main(String[] args) {
    final Thread thread1 = new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println(Thread.currentThread().getName() + " is Running.");
      }
    },"T1");
    final Thread thread2 = new Thread(new Runnable() {
      @Override
      public void run() {
        try {
          thread1.join();
        } catch (InterruptedException e) {
          System.out.println("join thread1 failed");
        }
        System.out.println(Thread.currentThread().getName() + " is Running.");
      }
    },"T2");
    Thread thread3 = new Thread(new Runnable() {
      @Override
      public void run() {
        try {
          thread2.join();
        } catch (InterruptedException e) {
          System.out.println("join thread1 failed");
        }
        System.out.println(Thread.currentThread().getName() + " is Running.");
      }
    },"T3");
//    thread3.start();
//    thread2.start();
//    thread1.start();

    thread1.start();
    thread2.start();
    thread3.start();
  }
}
