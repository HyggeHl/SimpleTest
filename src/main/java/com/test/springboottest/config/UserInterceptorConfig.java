package com.test.springboottest.config;

import com.test.springboottest.controllerDeSensitive.DeSensitiveInterceptor;
import com.test.springboottest.handle.UserInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @program: springbootTest
 * @description: UserInterceptorConfig
 * @author: hygge
 * @create: 2023/07/07
 */
@Configuration
public class UserInterceptorConfig implements WebMvcConfigurer {

  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    registry.addInterceptor(new UserInterceptor());
    registry.addInterceptor(new DeSensitiveInterceptor());
  }
}
