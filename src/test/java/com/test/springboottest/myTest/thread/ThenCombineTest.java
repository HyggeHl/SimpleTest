package com.test.springboottest.myTest.thread;

import java.util.concurrent.*;

/**
 * @program: SimpleTest
 * @description:
 * @author: hugge
 * @create: 2023/10/09
 */
public class ThenCombineTest {

  public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

    CompletableFuture<String> first = CompletableFuture.completedFuture("第一个异步任务");
    ExecutorService executor = Executors.newFixedThreadPool(10);
    CompletableFuture<String> future = CompletableFuture
            //第二个异步任务
            .supplyAsync(() -> "第二个异步任务", executor)
            // (w, s) -> System.out.println(s) 是第三个任务
            .thenCombineAsync(first, (s, w) -> {
              System.out.println(w);
              System.out.println(s);
              return "两个异步任务的组合";
            }, executor);
    System.out.println(future.join());
    executor.shutdown();

  }
}
