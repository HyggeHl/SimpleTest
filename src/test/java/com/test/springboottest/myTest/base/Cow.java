package com.test.springboottest.myTest.base;

public interface Cow extends Mammal, Pet{
  @Override
  default void eat() {
    Mammal.super.eat();
  }
}
