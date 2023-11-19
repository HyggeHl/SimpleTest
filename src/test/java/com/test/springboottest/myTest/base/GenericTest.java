package com.test.springboottest.myTest.base;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @program: SimpleTest
 * @description: 泛型
 * @author: hugge
 * @create: 2023/10/20
 */
public class GenericTest {
  public static void main(String[] args) {
//    List<? super Dog> list = new ArrayList<>();
//
//    list.add(new Dog("dog1"));
//
//
//    List<Dog> dogList = new ArrayList<>();
//    dogList.add(new Dog("dog2"));
//
//    List<? extends Animal> list1 = new ArrayList<>();
//    list1 = dogList;
//
//    System.out.println(Arrays.toString(list1.toArray()));

//    int[] a = new int[10];
//    a[1] = 1;
//    a[2] = 2;
//    System.out.println(a.length);
//
//    int[] b = Arrays.copyOf(a, 20);
//    System.out.println(b.length);

    List<String> sourceList = new ArrayList<String>() {{
      add("H");
      add("O");
      add("L");
      add("L");
      add("I");
      add("S");
    }};
    List subList = sourceList.subList(2, 5);
    System.out.println("sourceList ： " + sourceList);
    System.out.println("sourceList.subList(2, 5) 得到List ：");
    System.out.println("subList ： " + subList);
    sourceList.add("666");
    System.out.println("sourceList.add(666) 得到List ：");
    System.out.println("sourceList ： " + sourceList);
    System.out.println("subList ： " + subList);




  }
}
