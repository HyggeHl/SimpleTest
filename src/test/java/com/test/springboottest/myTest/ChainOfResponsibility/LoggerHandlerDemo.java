package com.test.springboottest.myTest.ChainOfResponsibility;

/**
 * @program: SimpleTest
 * @description: 责任链处理器的使用
 * @author: hugge
 * @create: 2023/10/13
 */
public class LoggerHandlerDemo {
  public static void main(String[] args) {
    LoggerHandler loggerHandlerChain = getLogHandlers();
    loggerHandlerChain.log(LoggerHandler.INFO, "This is an information.");
    loggerHandlerChain.log(LoggerHandler.DEBUG, "This is a debug level information.");
    loggerHandlerChain.log(LoggerHandler.ERROR, "This is an error information.");
  }

  private static LoggerHandler getLogHandlers() {
    LoggerHandler errorLoggerFilter = new ErrorLoggerFilter(LoggerHandler.ERROR);
    LoggerHandler fileLoggerHandler = new FileLoggerHandler(LoggerHandler.DEBUG);
    LoggerHandler consoleLoggerHandler = new ConsoleLoggerHandler(LoggerHandler.INFO);

    errorLoggerFilter.setNextHandler(fileLoggerHandler);
    fileLoggerHandler.setNextHandler(consoleLoggerHandler);

    return errorLoggerFilter;
  }
}
