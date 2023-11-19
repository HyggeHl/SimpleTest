package com.test.springboottest.myTest.base;

public interface Pet {
  default void eat(){
    System.out.println("Pet-eat");
  };
}
