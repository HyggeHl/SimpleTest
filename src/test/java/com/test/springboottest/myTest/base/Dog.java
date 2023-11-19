package com.test.springboottest.myTest.base;

/**
 * @program: SimpleTest
 * @description:
 * @author: hugge
 * @create: 2023/10/20
 */
public class Dog extends Animal{
  public Dog(String name) {
    this.name = name;
  }

  private String name;

  @Override
  public String toString() {
    return "Dog{" +
            "name='" + name + '\'' +
            '}';
  }
}
