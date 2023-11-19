package com.test.springboottest.myTest.ChainOfResponsibility;

/**
 * @program: SimpleTest
 * @description: 定义文件日志处理器
 * @author: hugge
 * @create: 2023/10/13
 */
public class FileLoggerHandler extends LoggerHandler{
  public FileLoggerHandler(int level) {
    this.level = level;
  }

  @Override
  protected void write(String message) {
    System.out.println("File::Logger: " + message);
  }
}
