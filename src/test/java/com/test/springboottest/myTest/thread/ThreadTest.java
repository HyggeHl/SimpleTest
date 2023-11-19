package com.test.springboottest.myTest.thread;

import org.junit.jupiter.api.Test;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * @program: springbootTest
 * @description: 测试线程
 * @author: hygge
 * @create: 2023/05/19
 */
//@SpringBootTest
public class ThreadTest {
//  @Autowired
//  private ThreadPoolTaskExecutor threadPoolTaskExecutor;

  @Test
  void testThread() throws InterruptedException {
    System.out.println("test");
    MyThreadPoolTaskExecutor myThreadPoolTaskExecutor = new MyThreadPoolTaskExecutor();
    ThreadPoolTaskExecutor threadPoolTaskExecutor = myThreadPoolTaskExecutor.getExecutor();

    for(int i = 0; i < 10; i++) {
      int index = i;

//      try{
//        Thread.sleep(2000);
//      }catch (InterruptedException e) {
//        e.printStackTrace();
//      }

      threadPoolTaskExecutor.execute(() -> {
        System.out.println(Thread.currentThread().getName() + ":" + index);

      });
    }



    Thread thread = new Thread() {
      @Override
      public void run() {
        System.out.println();
      }
    };
    Thread.sleep(1000);

    thread.notify();

  }
}
