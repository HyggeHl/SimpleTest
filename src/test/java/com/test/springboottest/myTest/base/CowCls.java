package com.test.springboottest.myTest.base;

/**
 * @program: SimpleTest
 * @description:
 * @author: hugge
 * @create: 2023/10/18
 */
public class CowCls implements Mammal, Pet{
  @Override
  public void eat() {
    Mammal.super.eat();
  }
}
