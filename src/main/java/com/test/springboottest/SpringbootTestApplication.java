package com.test.springboottest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootTestApplication {

  public static void main(String[] args) {
//    SpringApplication.run(SpringbootTestApplication.class, args);

    ConfigurableApplicationContext content = SpringApplication.run(SpringbootTestApplication.class, args);


    //从容器中获取类型为Runnable的所有bean
    System.out.println("Condition获取：" + content.getBeansOfType(Runnable.class));

  }

}
