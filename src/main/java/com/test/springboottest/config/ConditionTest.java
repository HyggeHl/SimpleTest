package com.test.springboottest.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: SimpleTest
 * @description:
 * @author: hugge
 * @create: 2023/09/19
 */
@Configuration
public class ConditionTest {

  @Bean
  @ConditionalOnBean(name="Hello")
  public Runnable createRable1(){
    System.out.println("=======default======");
    return ()->{};
  }

  @Bean
  @ConditionalOnClass(name="Hello")
  public Runnable createRable2(){
    System.out.println("=======dev======");
    return ()->{};
  }

  @Bean
  @ConditionalOnProperty(name="opFlag",havingValue = "save")
  public Runnable createRable3(){
    System.out.println("=======user======");
    return ()->{};
  }

}
