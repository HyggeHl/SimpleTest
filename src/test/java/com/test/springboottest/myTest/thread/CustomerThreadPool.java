package com.test.springboottest.myTest.thread;

import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @program: SimpleTest
 * @description: CustomerThreadPool
 * @author: hygge
 * @create: 2023/08/29
 */
public class CustomerThreadPool {
  public static void main(String[] args){
    // 线程工厂可通过 implements ThreadFactory接口自定义
    // 任务拒绝策略可通过  implements RejectedExecutionHandler接口自定义
    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 3, 0,
      TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(3),
      Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

    for (int i = 0; i < 10;i++){
      final int num = i;
      threadPoolExecutor.execute(()->{
        System.out.println("线程：" + Thread.currentThread().getName() + "正在执行:" + num + "个任务");
      });
      System.out.println("线程池中线程数目：" + threadPoolExecutor.getPoolSize() +
        "，队列中等待执行的任务数目：" + threadPoolExecutor.getQueue().size() +
        "，已执行完别的任务数目："+threadPoolExecutor.getCompletedTaskCount());
    }

    threadPoolExecutor.shutdown();
  }

}
