package com.test.springboottest.myTest.TYYLExam;

import org.json.JSONException;


/**
 * @program: SimpleTest
 * @description:
 * @author: hugge
 * @create: 2023/10/18
 */
public class FindMaxPreStr {

  //查找字符串数组中的最大公共前缀
  public static String findMaxPreStr(String[] baseStr) {
    if (baseStr.length == 0)
      return "";

    String preStr = baseStr[0];
    for(int i = 0; i < baseStr.length; i++) {
      while (baseStr[i].indexOf(preStr) != 0) {
        preStr = preStr.substring(0, preStr.length() - 1);
        if (preStr.isEmpty())
          return "";
      }
    }
    return preStr;
  }

  public static void main(String[] args) throws JSONException {
    System.out.println(findMaxPreStr(new String[]{"flower","flow","flight"}));

  }

}
