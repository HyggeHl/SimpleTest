package com.test.springboottest.myTest.concurrency;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

/**
 * @program: SimpleTest
 * @description:
 * @author: hugge
 * @create: 2023/10/02
 */
public class CompletetableFultureTest {
  static void baseTest() {
    CompletableFuture<String> stringCompletableFuture = CompletableFuture.supplyAsync(() -> {
      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
      return "返回值执行";
    });

    CompletableFuture<Void> voidCompletableFuture = CompletableFuture.runAsync(() -> {
      System.out.println("void执行");
    });

    String stringCompletableFutureRtn = stringCompletableFuture.join();
    System.out.println(stringCompletableFutureRtn);
  }

  static void thenRunTest() {
    CompletableFuture<String> stringCompletableFuture = CompletableFuture.supplyAsync(() -> {
      System.out.println("run-" + "stringCompletableFuture");
      return "返回值执行";
    });

    stringCompletableFuture.thenRun(() -> {
      System.out.println("执行第二个");
    });
  }

  static void thenAcceptTest() {
    CompletableFuture<String> stringCompletableFuture = CompletableFuture.supplyAsync(() -> {
      System.out.println("run-" + "stringCompletableFuture");
      return "返回值执行";
    });

    stringCompletableFuture.thenAccept((param) -> {
      System.out.println("接收传参：" + param);
      System.out.println("执行第二个");
    });
  }

  static void thenApplyTest() {
    CompletableFuture<String> stringCompletableFuture = CompletableFuture.supplyAsync(() -> {
      System.out.println("run-" + "stringCompletableFuture");
      return "返回值执行";
    });

    CompletableFuture<String> stringCompletableFuture2 = stringCompletableFuture.thenApply((param) -> {
      System.out.println("接收传参：" + param);
      System.out.println("执行第二个");
      return "执行第二个";
    });

    System.out.println(stringCompletableFuture2.join());
  }

  static void thenComposeTest() {
    CompletableFuture<String> stringCompletableFuture = CompletableFuture.supplyAsync(() -> {
      System.out.println("run-" + "stringCompletableFuture");
      return "返回值执行";
    });

    CompletableFuture<Object> thenComposeCompletableFuture = stringCompletableFuture.thenCompose((param) -> {
      return CompletableFuture.supplyAsync(() -> {
        return param + "执行第二个";
      });
    });

    System.out.println(thenComposeCompletableFuture.join());
  }

  static void thenCombineTest() {
    CompletableFuture<String> stringCompletableFuture = CompletableFuture.supplyAsync(() -> {
      System.out.println("run-" + "stringCompletableFuture");
      return "返回值执行-第一个";
    });

    CompletableFuture<String> thenCombineCompletableFuture = CompletableFuture.supplyAsync(() -> {
      System.out.println("执行第二个");
      return "返回值执行-第二个";
    }).thenCombine(stringCompletableFuture, (two, one) -> {
      return one + two;
    });

    System.out.println(thenCombineCompletableFuture.join());
  }

  public static void main(String[] args) {
//    baseTest();

//    thenRunTest();

//    thenAcceptTest();

//    thenApplyTest();

//    thenComposeTest();

    thenCombineTest();
  }
}
