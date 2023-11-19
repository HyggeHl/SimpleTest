package com.test.springboottest.myTest.thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @program: SimpleTest
 * @description:
 * @author: hugge
 * @create: 2023/10/08
 */
public class ThreadPoolExecutorTest {

  public static void main(String[] args) {

//    ThreadPoolExecutor

    Executors.newFixedThreadPool(5);

    Executors.newCachedThreadPool();

    Executors.newSingleThreadExecutor();

    Executors.newScheduledThreadPool(3);

  }
}
