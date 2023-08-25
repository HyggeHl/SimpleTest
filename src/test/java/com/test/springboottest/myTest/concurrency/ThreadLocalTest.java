package com.test.springboottest.myTest.concurrency;

/**
 * @program: springbootTest
 * @description: ThreadLocal
 * @author: hygge
 * @create: 2023/07/06
 */
public class ThreadLocalTest {
  private static ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>() {
    // 重写这个方法，可以修改“线程变量”的初始值，默认是null
    @Override
    protected Integer initialValue() {
      return 0;
    }
  };

  public static void main(String[] args) throws InterruptedException {

    //一号线程
    new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("一号线程set前：" + threadLocal.get());
        threadLocal.set(1);
        System.out.println("一号线程set后：" + threadLocal.get());
      }
    }).start();

    //二号线程
    new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("二号线程set前：" + threadLocal.get());
        threadLocal.set(2);
        threadLocal.set(3);
        System.out.println("二号线程set后：" + threadLocal.get());

      }
    }).start();

    //主线程睡1s
    Thread.sleep(1000);

    //主线程
    System.out.println("主线程的threadlocal值：" + threadLocal.get());

  }
}
