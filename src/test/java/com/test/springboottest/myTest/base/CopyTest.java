package com.test.springboottest.myTest.base;

import com.alibaba.fastjson2.JSON;
import org.apache.commons.lang3.SerializationUtils;
import org.springframework.beans.BeanUtils;
import sun.misc.Unsafe;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: SimpleTest
 * @description:
 * @author: hugge
 * @create: 2023/10/20
 */
public class CopyTest {
  public static void main(String[] args) throws CloneNotSupportedException, NoSuchFieldException, IllegalAccessException, InstantiationException {

    System.out.println("===========================BeanUtils===========================");
    User user = new User("hygge", "male");
    user.setAddress(new Address("jiangsu", "nanjing", "yuhuatai"));

    User userNew = new User();

    BeanUtils.copyProperties(user, userNew);

    System.out.println(user == userNew);
    System.out.println(user.getAddress() == userNew.getAddress());

    userNew.setName("new");
    userNew.getAddress().setArea("jianye");

    System.out.println(user);
    System.out.println(userNew);
    System.out.println("===========================BeanUtils===========================");



    System.out.println("\n===========================Cloneable===========================");
    User userCloneAble = new User("hygge", "male");
    userCloneAble.setAddress(new Address("jiangsu", "nanjing", "yuhuatai"));

    User userNewCloneAble = user.clone();
    System.out.println(userCloneAble == userNewCloneAble);
    System.out.println(userCloneAble.getAddress() == userNewCloneAble.getAddress());

    userNewCloneAble.setName("new");
    userNewCloneAble.getAddress().setArea("jianye");

    System.out.println(userCloneAble);
    System.out.println(userNewCloneAble);
    System.out.println("===========================Cloneable===========================");



    System.out.println("\n===========================fastJson===========================");
    User userFastJson = new User("hygge", "male");
    userFastJson.setAddress(new Address("jiangsu", "nanjing", "yuhuatai"));

    User userNewFastJson = JSON.parseObject(JSON.toJSONString(userFastJson), User.class);

    System.out.println(userFastJson == userNewFastJson);
    System.out.println(userFastJson.getAddress() == userNewFastJson.getAddress());

    userNewFastJson.setName("new");
    userNewFastJson.getAddress().setArea("jianye");

    System.out.println(userFastJson);
    System.out.println(userNewFastJson);

    System.out.println("===========================fastJson===========================");



    System.out.println("\n===========================Apache Commons Lang#SerializationUtils===========================");
    User userLang = new User("hygge", "male");
    userLang.setAddress(new Address("jiangsu", "nanjing", "yuhuatai"));

    User userNewLang = (User) SerializationUtils.clone(userLang);

    System.out.println(userLang == userNewLang);
    System.out.println(userLang.getAddress() == userNewLang.getAddress());

    userNewLang.setName("new");
    userNewLang.getAddress().setArea("jianye");

    System.out.println(userLang);
    System.out.println(userNewLang);

    System.out.println("===========================Apache Commons Lang#SerializationUtils===========================");




//    Field field = Unsafe.class.getDeclaredField("theUnsafe");
//    field.setAccessible(true);
//    Unsafe unsafe = (Unsafe) field.get(null);
//    // 获取User类的字段偏移量
//    long nameOffset = unsafe.objectFieldOffset(User.class.getDeclaredField("name"));
//    long ageOffset = unsafe.objectFieldOffset(User.class.getDeclaredField("age"));
//    // 使用allocateInstance方法创建对象，不会调用构造函数
//    User userUnsafe = (User) unsafe.allocateInstance(User.class);
//    // 使用putObject方法设置字段的值
//    unsafe.putObject(userUnsafe, nameOffset, "hygge");
//    unsafe.putInt(userUnsafe, ageOffset, 30);

    List stringList = new ArrayList();
  }

}
