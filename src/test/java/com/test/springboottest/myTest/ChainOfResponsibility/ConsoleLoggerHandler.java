package com.test.springboottest.myTest.ChainOfResponsibility;

/**
 * @program: SimpleTest
 * @description: 定义控制台日志处理器
 * @author: hugge
 * @create: 2023/10/13
 */
public class ConsoleLoggerHandler extends LoggerHandler {
  public ConsoleLoggerHandler(int level) {
    this.level = level;
  }

  @Override
  protected void write(String message) {
    System.out.println("Console::Logger: " + message);
  }
}
