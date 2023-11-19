package com.test.springboottest.myTest.base;

/**
 * @program: SimpleTest
 * @description:
 * @author: hugge
 * @create: 2023/10/13
 */
public class InitTest {
  public InitTest() {
    System.out.println("无参构造器");
  }

  public InitTest(int a) {
    System.out.println("有参构造器");

  }

  {
    System.out.println("实例代码块1");
  }

  {
    System.out.println("实例代码块2");
  }

  {

    System.out.println("实例代码块3");
  }

  static {
    System.out.println("静态初始化块1");
  }

  static {
    System.out.println("静态初始化块2");
  }

  static StaticVariable staticVariable = new StaticVariable("1");

  public void method(){
    {
      System.out.println("普通初始化块");
    }
  }

  public static void main(String[] args) {
    InitTest initTest = new InitTest();

    initTest.method();
  }
}
