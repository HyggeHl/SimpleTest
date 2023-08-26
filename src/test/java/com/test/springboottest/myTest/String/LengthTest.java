package com.test.springboottest.myTest.String;

import org.junit.jupiter.api.Test;

/**
 * @program: springbootTest
 * @description:
 * @author: hygge
 * @create: 2023/08/22
 */
public class LengthTest {

  @Test
  void lengthTest() {
    String str = "唐雨娟: 同步13条，（2023-08-11，2023-08-10，2023-08-18，2023-08-17，2023-08-16，2023-08-15，2023-08-14，2023-08-02，2023-08-01，2023-08-09，2023-08-08，2023-08-07，2023-08-21）\n"
      + "刘宇: 同步15条，（2023-08-21，2023-08-10，2023-08-11，2023-08-16，2023-08-17，2023-08-14，2023-08-15，2023-08-18，2023-08-01，2023-08-02，2023-08-03，2023-08-04，2023-08-09，2023-08-07，2023-08-08）\n"
      + "李永春: 同步1条，（2023-08-21）\n"
      + "汪龙波: 同步14条，（2023-08-10，2023-08-11，2023-08-18，2023-08-14，2023-08-15，2023-08-16，2023-08-17，2023-08-01，2023-08-07，2023-08-08，2023-08-09，2023-08-03，2023-08-04，2023-08-21）\n"
      + "朱鹏飞: 同步12条，（2023-08-10，2023-08-11，2023-08-14，2023-08-15，2023-08-21，2023-08-01，2023-08-03，2023-08-02，2023-08-04，2023-08-07，2023-08-09，2023-08-08）\n"
      + "张金旭: 同步15条，（2023-08-09，2023-08-02，2023-08-01，2023-08-04，2023-08-03，2023-08-08，2023-08-07，2023-08-11，2023-08-10，2023-08-15，2023-08-14，2023-08-17，2023-08-16，2023-08-18，2023-08-21）\n"
      + "钱坤: 同步14条，（2023-08-09，2023-08-08，2023-08-07，2023-08-02，2023-08-01，2023-08-04，2023-08-03，2023-08-18，2023-08-11，2023-08-10，2023-08-17，2023-08-16，2023-08-14，2023-08-21）\n"
      + "史连宁: 同步13条，（2023-08-07，2023-08-02，2023-08-03，2023-08-04，2023-08-01，2023-08-21，2023-08-17，2023-08-18，2023-08-14，2023-08-15，2023-08-16，2023-08-10，2023-08-11）\n"
      + "郭旭: 同步15条，（2023-08-04，2023-08-03，2023-08-02，2023-08-09，2023-08-08，2023-08-07，2023-08-11，2023-08-10，2023-08-16，2023-08-15，2023-08-14，2023-08-18，2023-08-17，2023-08-21，2023-08-01）\n"
      + "翟建坤: 同步14条，（2023-08-11，2023-08-14，2023-08-15，2023-08-16，2023-08-17，2023-08-18，2023-08-21，2023-08-08，2023-08-09，2023-08-01，2023-08-02，2023-08-03，2023-08-04，2023-08-10）\n"
      + "芦丹: 同步16条，（2023-08-01，2023-08-02，2023-08-03，2023-08-04，2023-08-09，2023-08-07，2023-08-08，2023-08-21，2023-08-22，2023-08-10，2023-08-11，2023-08-16，2023-08-17，2023-08-14，2023-08-15，2023-08-18）\n"
      + "许润东: 同步15条，（2023-08-21，2023-08-03，2023-08-02，2023-08-04，2023-08-01，2023-08-07，2023-08-09，2023-08-08，2023-08-14，2023-08-16，2023-08-15，2023-08-10，2023-08-11，2023-08-18，2023-08-17）\n"
      + "杨捷: 同步14条，（2023-08-03，2023-08-02，2023-08-04，2023-08-01，2023-08-07，2023-08-09，2023-08-08，2023-08-14，2023-08-16，2023-08-15，2023-08-10，2023-08-11，2023-08-18，2023-08-17）\n"
      + "邵文宣: 同步15条，（2023-08-11，2023-08-10，2023-08-15，2023-08-16，2023-08-14，2023-08-17，2023-08-18，2023-08-01，2023-08-04，2023-08-02，2023-08-03，2023-08-08，2023-08-09，2023-08-07，2023-08-21）\n"
      + "钟恩胜: 同步15条，（2023-08-10，2023-08-11，2023-08-18，2023-08-16，2023-08-17，2023-08-14，2023-08-15，2023-08-21，2023-08-01，2023-08-02，2023-08-09，2023-08-07，2023-08-08，2023-08-03，2023-08-04）\n"
      + "董明昆: 同步15条，（2023-08-21，2023-08-10，2023-08-11，2023-08-18，2023-08-17，2023-08-14，2023-08-16，2023-08-15，2023-08-01，2023-08-07，2023-08-09，2023-08-08，2023-08-03，2023-08-02，2023-08-04）\n"
      + "赵庆磊: 同步16条，（2023-08-10，2023-08-11，2023-08-16，2023-08-17，2023-08-18，2023-08-14，2023-08-15，2023-08-21，2023-08-22，2023-08-07，2023-08-08，2023-08-01，2023-08-02，2023-08-03，2023-08-04，2023-08-09）\n"
      + "魏明宇: 同步15条，（2023-08-21，2023-08-11，2023-08-10，2023-08-15，2023-08-14，2023-08-17，2023-08-16，2023-08-18，2023-08-09，2023-08-02，2023-08-01，2023-08-04，2023-08-03，2023-08-08，2023-08-07）\n"
      + "张磊: 同步9条，（2023-08-08，2023-08-09，2023-08-02，2023-08-03，2023-08-01，2023-08-07，2023-08-04，2023-08-10，2023-08-11）\n"
      + "黄龙: 同步11条，（2023-08-09，2023-08-08，2023-08-07，2023-08-21，2023-08-18，2023-08-17，2023-08-16，2023-08-15，2023-08-14，2023-08-11，2023-08-10）\n"
      + "费柯琦: 同步15条，（2023-08-01，2023-08-03，2023-08-02，2023-08-09，2023-08-08，2023-08-04，2023-08-07，2023-08-11，2023-08-14，2023-08-10，2023-08-16，2023-08-15，2023-08-18，2023-08-17，2023-08-21）\n"
      + "盛翔: 同步1条，（2023-08-10）\n"
      + "王大全: 同步12条，（2023-08-01，2023-08-02，2023-08-09，2023-08-07，2023-08-08，2023-08-14，2023-08-15，2023-08-10，2023-08-11，2023-08-18，2023-08-16，2023-08-17）\n"
      + "李靖: 同步15条，（2023-08-21，2023-08-14，2023-08-11，2023-08-10，2023-08-17，2023-08-18，2023-08-15，2023-08-16，2023-08-02，2023-08-03，2023-08-01，2023-08-08，2023-08-09，2023-08-07，2023-08-04）\n"
      + "肖和清: 同步10条，（2023-08-09，2023-08-07，2023-08-04，2023-08-03，2023-08-01，2023-08-17，2023-08-16，2023-08-15，2023-08-11，2023-08-10）\n"
      + "张子雄: 同步15条，（2023-08-03，2023-08-04，2023-08-07，2023-08-08，2023-08-09，2023-08-01，2023-08-02，2023-08-14，2023-08-15，2023-08-16，2023-08-17，2023-08-18，2023-08-10，2023-08-11，2023-08-21）\n"
      + "王丽: 同步7条，（2023-08-04，2023-08-03，2023-08-02，2023-08-01，2023-08-17，2023-08-11，2023-08-21）\n"
      + "未九涛: 同步15条，（2023-08-11，2023-08-10，2023-08-18，2023-08-17，2023-08-16，2023-08-15，2023-08-14，2023-08-21，2023-08-01，2023-08-09，2023-08-08，2023-08-07，2023-08-04，2023-08-03，2023-08-02）\n"
      + "刘燃钢: 同步15条，（2023-08-10，2023-08-11，2023-08-18，2023-08-16，2023-08-17，2023-08-14，2023-08-15，2023-08-07，2023-08-08，2023-08-03，2023-08-04，2023-08-01，2023-08-02，2023-08-09，2023-08-21）\n"
      + "许静晨: 同步13条，（2023-08-09，2023-08-08，2023-08-07，2023-08-02，2023-08-01，2023-08-04，2023-08-03，2023-08-10，2023-08-17，2023-08-16，2023-08-18，2023-08-15，2023-08-14）\n"
      + "蒋嘉蔚: 同步15条，（2023-08-01，2023-08-03，2023-08-02，2023-08-04，2023-08-07，2023-08-09，2023-08-08，2023-08-11，2023-08-14，2023-08-16，2023-08-15，2023-08-18，2023-08-17，2023-08-10，2023-08-21）\n"
      + "刘培培: 同步15条，（2023-08-21，2023-08-10，2023-08-15，2023-08-16，2023-08-17，2023-08-18，2023-08-11，2023-08-14，2023-08-08，2023-08-09，2023-08-04，2023-08-07，2023-08-01，2023-08-02，2023-08-03）\n"
      + "褚林园: 同步14条，（2023-08-01，2023-08-02，2023-08-03，2023-08-04，2023-08-09，2023-08-07，2023-08-08，2023-08-10，2023-08-11，2023-08-16，2023-08-17，2023-08-14，2023-08-15，2023-08-18）\n"
      + "周成儒: 同步14条，（2023-08-08，2023-08-07，2023-08-09，2023-08-04，2023-08-03，2023-08-02，2023-08-01，2023-08-18，2023-08-15，2023-08-14，2023-08-17，2023-08-16，2023-08-11，2023-08-10）\n"
      + "赵玉龙: 同步14条，（2023-08-03，2023-08-02，2023-08-04，2023-08-01，2023-08-07，2023-08-09，2023-08-08，2023-08-21，2023-08-14，2023-08-16，2023-08-15，2023-08-10，2023-08-18，2023-08-17）\n"
      + "万凯: 同步6条，（2023-08-01，2023-08-02，2023-08-03，2023-08-04，2023-08-07，2023-08-08）\n"
      + "王月: 同步14条，（2023-08-09，2023-08-08，2023-08-04，2023-08-07，2023-08-01，2023-08-03，2023-08-02，2023-08-10，2023-08-16，2023-08-15，2023-08-18，2023-08-17，2023-08-11，2023-08-14）\n"
      + "李晶晶: 同步15条，（2023-08-08，2023-08-07，2023-08-09，2023-08-04，2023-08-03，2023-08-02，2023-08-01，2023-08-18，2023-08-15，2023-08-14，2023-08-17，2023-08-16，2023-08-11，2023-08-10，2023-08-21）\n"
      + "刘博洋: 同步13条，（2023-08-09，2023-08-07，2023-08-08，2023-08-03，2023-08-04，2023-08-01，2023-08-02，2023-08-21，2023-08-18，2023-08-16，2023-08-17，2023-08-14，2023-08-15）\n"
      + "符首夫: 同步3条，（2023-08-21，2023-08-17，2023-08-09）\n"
      + "张国栋: 同步12条，（2023-08-17，2023-08-15，2023-08-14，2023-08-11，2023-08-10，2023-08-04，2023-08-03，2023-08-09，2023-08-08，2023-08-07，2023-08-02，2023-08-01）\n"
      + "李安训: 同步14条，（2023-08-14，2023-08-15，2023-08-18，2023-08-16，2023-08-17，2023-08-10，2023-08-11，2023-08-09，2023-08-03，2023-08-04，2023-08-01，2023-08-02，2023-08-07，2023-08-08）\n"
      + "许琪: 同步14条，（2023-08-14，2023-08-11，2023-08-18，2023-08-17，2023-08-16，2023-08-15，2023-08-10，2023-08-09，2023-08-08，2023-08-03，2023-08-02，2023-08-01，2023-08-07，2023-08-04）\n"
      + "崔泽鹏: 同步15条，（2023-08-10，2023-08-11，2023-08-16，2023-08-17，2023-08-14，2023-08-15，2023-08-18，2023-08-21，2023-08-01，2023-08-02，2023-08-03，2023-08-04，2023-08-09，2023-08-07，2023-08-08）\n"
      + "蒙娜丽莎: 同步11条，（2023-08-04，2023-08-02，2023-08-03，2023-08-01，2023-08-08，2023-08-09，2023-08-16，2023-08-14，2023-08-10，2023-08-17，2023-08-18）\n"
      + "逯洪涛: 同步14条，（2023-08-15，2023-08-14，2023-08-11，2023-08-10，2023-08-18，2023-08-17，2023-08-16，2023-08-04，2023-08-03，2023-08-02，2023-08-01，2023-08-09，2023-08-08，2023-08-07）\n"
      + "王兰方: 同步14条，（2023-08-14，2023-08-15，2023-08-16，2023-08-17，2023-08-18，2023-08-01，2023-08-02，2023-08-03，2023-08-04，2023-08-07，2023-08-08，2023-08-09，2023-08-10，2023-08-11）\n"
      + "王建星: 同步16条，（2023-08-01，2023-08-03，2023-08-02，2023-08-04，2023-08-07，2023-08-09，2023-08-08，2023-08-10，2023-08-11，2023-08-14，2023-08-16，2023-08-15，2023-08-18，2023-08-17，2023-08-21，2023-08-22）\n"
      + "钱杨龙: 同步11条，（2023-08-08，2023-08-09，2023-08-07，2023-08-01，2023-08-17，2023-08-18，2023-08-15，2023-08-16，2023-08-14，2023-08-11，2023-08-21）\n"
      + "孙俊华: 同步7条，（2023-08-15，2023-08-16，2023-08-14，2023-08-04，2023-08-01，2023-08-02，2023-08-03）";


    System.out.println(str.length());
  }
}