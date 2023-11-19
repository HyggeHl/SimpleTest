package com.test.springboottest.myTest.base;


import cn.hutool.core.util.IdUtil;

import java.io.Serializable;
import java.util.UUID;

/**
 * @program: SimpleTest
 * @description:
 * @author: hugge
 * @create: 2023/10/20
 */
public class User implements Cloneable, Serializable {

  private static final long serialVersionUID = IdUtil.getSnowflakeNextId();

  public User(){};

  public User(String name, String gender) {
    this.name = name;
    this.gender = gender;
  }

  private String name;

  private String gender;

  private Address address;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return "User{" +
            "name='" + name + '\'' +
            ", gender='" + gender + '\'' +
            ", address=" + address +
            '}';
  }

  @Override
  public User clone() throws CloneNotSupportedException {
    User user = (User) super.clone();
    user.setAddress((Address) address.clone());
    return user;
  }
}
