package com.test.springboottest.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @program: springbootTest
 * @description: 用户类
 * @author: hygge
 * @create: 2023/07/07
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SysUser implements Serializable {

  private String id;

  private String name;

  private String tel;
}
