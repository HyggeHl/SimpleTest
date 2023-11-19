package com.test.springboottest.myTest.ChainOfResponsibility;

/**
 * @program: SimpleTest
 * @description: 定义错误日志处理器
 * @author: hugge
 * @create: 2023/10/13
 */
public class ErrorLoggerFilter extends LoggerHandler{
  public ErrorLoggerFilter(int level) {
    this.level = level;
  }

  @Override
  protected void write(String message) {
    System.out.println("Error::Logger: " + message);
  }
}
