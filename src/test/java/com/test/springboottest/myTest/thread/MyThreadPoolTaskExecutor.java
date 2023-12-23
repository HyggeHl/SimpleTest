package com.test.springboottest.myTest.thread;

import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @program: springbootTest
 * @description: ces
 * @author: hygge
 * @create: 2023/05/19
 */
public class MyThreadPoolTaskExecutor {
  private static final int COUR_SIZE = 2;
  private static final int MAX_COUR_SIZE = 4;

  ThreadPoolTaskExecutor getExecutor() {

    // 线程工厂可通过 implements ThreadFactory接口自定义
    // 任务拒绝策略可通过  implements RejectedExecutionHandler接口自定义
    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 3, 0,
            TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(3),
            Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());


    ThreadPoolTaskExecutor threadPoolTaskExecutor = new ThreadPoolTaskExecutor();

    threadPoolTaskExecutor.setCorePoolSize(COUR_SIZE);// 设置核心线程数
    threadPoolTaskExecutor.setMaxPoolSize(MAX_COUR_SIZE);// 配置最大线程数
    threadPoolTaskExecutor.setQueueCapacity(5);// 配置队列容量（这里设置成最大线程数的四倍）
    threadPoolTaskExecutor.setThreadNamePrefix("test-thread");// 给线程池设置名称
    threadPoolTaskExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.AbortPolicy());// 设置任务的拒绝策略
    return threadPoolTaskExecutor;
  }
}
