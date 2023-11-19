package com.test.springboottest.myTest.base;

/**
 * @program: SimpleTest
 * @description:
 * @author: hugge
 * @create: 2023/10/20
 */
public class PassTest {
  public void pass(User user) {
    user.setName("hyggehello");
    System.out.println("print in pass , user is " + user);
  }

  public static void main(String[] args) {
    PassTest pt = new PassTest();
    User hygge = new User();
    hygge.setName("hygge");
    hygge.setGender("Male");
    pt.pass(hygge);
    System.out.println("print in main , user is " + hygge);
  }
}
