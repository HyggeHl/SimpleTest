package com.test.springboottest.myTest.ChainOfResponsibility;

/**
 * @program: SimpleTest
 * @description: 定义一个抽象的日志处理器
 * @author: hugge
 * @create: 2023/10/13
 */
public abstract class LoggerHandler {
  public static final int INFO = 1;
  public static final int DEBUG = 2;
  public static final int ERROR = 3;
  protected int level;
  protected LoggerHandler nextHandler;

  public void setNextHandler(LoggerHandler handler) {
    this.nextHandler = handler;
  }

  // 处理日志信息
  public void log(int level, String message) {
    if (this.level <= level) {
      write(message);
    }
    if (nextHandler != null) {
      nextHandler.log(level, message);
    }
  }

  // 定义具体的日志处理方法
  protected abstract void write(String message);
}
