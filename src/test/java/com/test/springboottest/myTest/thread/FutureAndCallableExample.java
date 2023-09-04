package com.test.springboottest.myTest.thread;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @program: SimpleTest
 * @description: FutureAndCallableExample
 * @author: hugge
 * @create: 2023/08/26
 */
public class FutureAndCallableExample {

  public static class MyThread extends Thread {
    @Override
    public void run() {
      Thread curThread = Thread.currentThread();
      System.out.println("我是MyThread，继承Thread！");
      System.out.println("threadExtendsThread-ThreadGroup:" + curThread.getThreadGroup());
      System.out.println("threadExtendsThread-Priority:" + curThread.getPriority());
      System.out.println("threadExtendsThread-id:" + curThread.getId());
      System.out.println("threadExtendsThread-name:" + curThread.getName());
    }
  }

  @Test
  public void threadExtendsThread() throws InterruptedException {
    Thread curThread = Thread.currentThread();
    System.out.println("我是threadExtendsThread方法内线程！");
    System.out.println("threadExtendsThread-ThreadGroup:" + curThread.getThreadGroup());
    System.out.println("threadExtendsThread-Priority:" + curThread.getPriority());
    System.out.println("threadExtendsThread-id:" + curThread.getId());
    System.out.println("threadExtendsThread-name:" + curThread.getName());

    Thread myThread = new MyThread();
    myThread.setPriority(10);
    Thread.sleep(2000);
    myThread.start();
  }

  @Test
  public void threadImpRunableLambda() {
    Thread thread = new Thread(() -> {
      System.out.println("实现Runable，lambda表达式");
    });
    thread.start();
  }

  @Test
  public void threadExyendsThreadAnoymous() {
    Thread thread = new Thread() {
      @Override
      public void run() {
        System.out.println("匿名内部类实现继承Thread类");
      }
    };
    thread.start();
  }

  @Test
  public void threadImpRunableAnoymous() {
    Thread thread = new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("匿名内部类实现Runable接口");
      }
    });
    thread.start();
  }

  @Test
  public void futureAndCallableExample() throws InterruptedException, ExecutionException {
    Callable<String> callable = () -> {
      System.out.println("Entered Callable");
      Thread.sleep(2000);
      return "Hello from Callable";
    };
    FutureTask<String> futureTask = new FutureTask<>(callable);
    Thread thread = new Thread(futureTask);
    thread.start();
    System.out.println("Do something else while callable is getting executed");
    System.out.println("Retrieved: " + futureTask.get());
  }


}
