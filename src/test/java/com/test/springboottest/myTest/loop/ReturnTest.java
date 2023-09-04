package com.test.springboottest.myTest.loop;

import org.junit.jupiter.api.Test;

/**
 * @program: SimpleTest
 * @description: ReturnTest
 * @author: hygge
 * @create: 2023/08/28
 */
public class ReturnTest {

  @Test
  public void returnTest() {
    for(int i = 0; i < 10; i++) {
      System.out.println("i=" + i);
      for(int j = 0; j < 10; j++) {
        System.out.println("j=" + j);
        if(j == 5) {
          return;
        }
      }
    }
  }

  public static void main(String[] args) {
    case1();
    case2();
    case3();
    case4();
    case5();
    case6();
  }
  public static void case1() {
    System.out.println("-------------case1 for all---------------");
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 4; j++) {
        System.out.println("batchNums=" + i + " nums=" + j);
      }
    }
  }

  public static void case2() {
    System.out.println("-------------case2 break---------------");
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 4; j++) {
        if (j == 2) {
          break;//跳出当前循环
        }
        System.out.println("batchNums=" + i + " nums=" + j);
      }
    }
  }
  public static void case3() {
    System.out.println("-------------case3 continue---------------");
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 4; j++) {
        if (j == 2) {
          continue;//跳过本次循环继续下一次循环
        }
        System.out.println("batchNums=" + i + " nums=" + j);
      }
    }
  }
  public static void case4() {
    System.out.println("-------------case4 continue+retry---------------");
    retry:
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 4; j++) {
        if (j == 2) {
          //continue+retry的效果与break相同,跳出当前循环
          continue retry;
        }
        System.out.println("batchNums=" + i + " nums=" + j);
      }
    }
  }

  public static void case5() {
    System.out.println("-------------case5 break+retry---------------");
    retry:
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 4; j++) {
        if (j == 2) {
          //跳过所有循环
          break retry;
        }
        System.out.println("batchNums=" + i + " nums=" + j);
      }
    }
  }

  public static void case6() {
    System.out.println("-------------case6 break+muse---------------");
    muse:
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 4; j++) {
        if (j == 2) {
          break muse;
        }
        System.out.println("batchNums=" + i + " nums=" + j);
      }
    }
  }

}
