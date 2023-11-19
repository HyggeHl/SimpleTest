package com.test.springboottest.myTest.base;

import java.math.BigDecimal;

/**
 * @program: SimpleTest
 * @description: 测试类
 * @author: hugge
 * @create: 2023/10/19
 */
public class BaseTest {
  public static void main(String[] args) {
    Parent p = new Son(); //3.父类的引用指向子类的对象
    Parent p1 = new Daughter(); //3.父类的引用指向子类的对象

    p.call();


//    Integer integer1 = 3;
//    Integer integer2 = 3;
//
//    if (integer1 == integer2)
//      System.out.println("integer1 == integer2");
//    else
//      System.out.println("integer1 != integer2");
//
//    Integer integer3 = 300;
//    Integer integer4 = 300;
//
//    if (integer3 == integer4)
//      System.out.println("integer3 == integer4");
//    else
//      System.out.println("integer3 != integer4");

    BigDecimal a = BigDecimal.valueOf(0.1);

    System.out.println(a.toString());

    BigDecimal b = new BigDecimal(0.1);

    System.out.println(b.toString());

    System.out.println(Double.toString(0.1000100000000000000000000000111111));

    String sStr = "aaa";

  }
}
