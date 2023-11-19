package com.test.springboottest.myTest.base;

/**
 * @program: SimpleTest
 * @description:
 * @author: hugge
 * @create: 2023/10/19
 */
public class Daughter extends Parent{// 1.有类继承或者接口实现
  public void call(){// 2.子类要重写父类的方法
    System.out.println("im Daughter");
  }
}
