package com.test.springboottest.myTest.dataStructure;

/**
 * @program: SimpleTest
 * @description:
 * @author: hugge
 * @create: 2023/10/18
 */
public class SortOrder {
  //冒泡排序
  public static void bubbleSort(int[] arr) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      // 每轮遍历将最大的数移到末尾
      for (int j = 0; j < n - i - 1; j++) {
        if (arr[j] > arr[j+1]) {
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
  }

  //选择排序
  public void selectSort(int[] arr) {
    int n = arr.length; // 数组长度
    for (int i = 0; i < n - 1; i++) { // 外层循环控制排序趟数
      int minIdx = i; // 保存最小元素的下标
      for (int j = i + 1; j < n; j++) { // 内层循环查找未排序部分的最小元素
        if (arr[j] < arr[minIdx]) {
          minIdx = j;
        }
      }
      // 将最小元素和未排序部分的第一个元素进行交换
      int tmp = arr[minIdx];
      arr[minIdx] = arr[i];
      arr[i] = tmp;
    }
  }


  //插入排序
  static int[] insertSort(int[] arr){
    for (int i = 1; i < arr.length; i++) {
      for (int j = i; j > 0; j--) {
        if(arr[j-1]>arr[j]){
          swap(arr,j,j-1);
        }
      }
    }
    return arr;
  }
  static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }


  //快速排序
  public static void quickSort(int[] array, int start, int end) {
    int i = start, j = end;
    int target = array[start];
    while (i < j) {
      // 找到右侧小于target的值
      while (i < j && target <= array[j]) {
        j--;
      }
      // 找到左侧大于target的值
      while (i < j && array[i] <= target) {
        i++;
      }
      // 交换找到的左右两侧的值
      if (i < j) {
        swap(array, i, j);
      }
    }
    // 将基准位和中间的值交换
    swap(array, start, j);
    // 处理基准位左边的分片
    if (i - 1 > start){
      quickSort(array, start, i - 1);
    }
    // 处理基准位右边的分片
    if (j + 1 < end){
      quickSort(array,j + 1, end);
    }
  }
}
