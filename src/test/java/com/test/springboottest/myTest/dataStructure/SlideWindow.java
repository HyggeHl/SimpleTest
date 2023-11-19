package com.test.springboottest.myTest.dataStructure;

import java.util.Arrays;

/**
 * @program: SimpleTest
 * @description:
 * @author: hugge
 * @create: 2023/10/18
 */
public class SlideWindow {
  public static boolean checkInclusion(String s1, String s2) {
    //定义两个字符串的长度
    int l1 = s1.length(), l2 = s2.length();
    //定义两个整型的数组，因为只包含小写字母，所以长度为26
    //用于标记出现的字符所在的位置。如a,b 则 数组内容为：[1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
    //array1用于保存s1中的字符
    //array2用于表示当前窗口中字符，在滑动窗口移动过程中，array2中内容不断变化
    //在滑动过程中，只要array1和array2相等了，说明s2中包含了s1的组合序列了，就返回true
    int[] array1 = new int[26], array2 = new int[26];
    //如果s1的长度小于s2的长度，不用算了，直接返回false
    if (l1 > l2) {
      return false;
    }
    //根据s1的长度，把两个数组初始化了，
    for (int i = 0; i < l1; i++) {
      ++array1[s1.charAt(i) - 'a'];
      ++array2[s2.charAt(i) - 'a'];
    }
    //ab ——> [1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
    //eidbaooo 中的 ei ——> [0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

    //判断两个数字内容如果相等了，就直接返回
    if (Arrays.equals(array1, array2)) {
      return true;
    }
    //滑动窗口开始，从eidbaooo中的i开始往后滑，第一次编程 id ，然后变成 db 再变成 ba
    for (int i = l1; i < l2; i++) {
      //把新的字符加到数组中
      array2[s2.charAt(i) - 'a']++;
      //把最左边的字符移出数组
      array2[s2.charAt(i - l1) - 'a']--;
      //第一次循环之后：id:[0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
      //第2次循环之后：db:[0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
      //一直到ba的时候，[1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0] 和 array1中内容一致

      //比较数组内容
      if(Arrays.equals(array1, array2)){
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    System.out.println(checkInclusion("ab", "cdfbaf"));
  }
}
