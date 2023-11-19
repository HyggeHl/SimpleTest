package com.test.springboottest.myTest.dataStructure;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: SimpleTest
 * @description:
 * @author: hugge
 * @create: 2023/10/18
 */
public class TwoSums {
  public static int[] twoSum(int[] nums, int target) {
    int n = nums.length;
    for (int i = 0; i < n; ++i) {
      for (int j = i + 1; j < n; ++j) {
        if (nums[i] + nums[j] == target) {
          return new int[]{i, j};
        }
      }
    }
    return new int[0];
  }

  public static int[] twoSumHash(int[] nums, int target) {
    Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
    for (int i = 0; i < nums.length; ++i) {
      if (hashtable.containsKey(target - nums[i])) {
        return new int[]{hashtable.get(target - nums[i]), i};
      }
      hashtable.put(nums[i], i);
    }
    return new int[0];
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 3, 8}, 9)));
  }
}
