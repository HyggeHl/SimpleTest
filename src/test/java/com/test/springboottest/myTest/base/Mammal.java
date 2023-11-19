package com.test.springboottest.myTest.base;

public interface Mammal {
  default void eat(){
    System.out.println("Mammal-eat");
  };
}
