package com.test.springboottest.myTest.String;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

/**
 * @program: springbootTest
 * @description: test
 * @author: hygge
 * @create: 2023/07/24
 */
public class AmountProblemTest {

  @Test
  public void stringTest() {
    //此处计算金额会出现问题,浮点数运算有精度问题
    String amount = String.valueOf((int)Math.abs(141.7*100));
    System.out.println("有问题计算："+ amount);


    int amount2 = (int)Math.abs(141.7*100);
    System.out.println(amount2);


    double amount3 = Math.abs(141.7*100);
    System.out.println(amount3);

    double amount4 = 141.7*100;
    System.out.println(amount4);


    BigDecimal initAmount = BigDecimal.valueOf(141.7);
    BigDecimal rate = new BigDecimal(100);
    String realAmount = initAmount.multiply(rate).setScale(0, BigDecimal.ROUND_HALF_UP).toString();

    System.out.println(realAmount);


  }
}
