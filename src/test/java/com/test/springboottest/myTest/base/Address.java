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
public class Address implements Cloneable, Serializable {

  private static final long serialVersionUID = IdUtil.getSnowflakeNextId();

  public Address() {};

  public Address(String province, String city, String area) {
    this.province = province;
    this.city = city;
    this.area = area;
  }

  private String province;
  private String city;
  private String area;

  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getArea() {
    return area;
  }

  public void setArea(String area) {
    this.area = area;
  }

  @Override
  public String toString() {
    return "Address{" +
            "province='" + province + '\'' +
            ", city='" + city + '\'' +
            ", area='" + area + '\'' +
            '}';
  }

  @Override
  public Address clone() throws CloneNotSupportedException {
    Address address = (Address) super.clone();
    // TODO: copy mutable state here, so the clone can't change the internals of the original
    return address;
  }
}
