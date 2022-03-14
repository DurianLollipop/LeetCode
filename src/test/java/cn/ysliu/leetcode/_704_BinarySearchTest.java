package cn.ysliu.leetcode;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class _704_BinarySearchTest {

  _704_BinarySearch binarySearch = new _704_BinarySearch();

  @Test
  void search_1() {
    int[] arrays = new int[]{-1,0,3,5,9,12};
    int target = 9;
    int result = binarySearch.search(arrays, target);
    assertEquals(4, result);
  }

  @Test
  void search_2() {
    int[] arrays = new int[]{-1,0,3,5,9,12};
    int target = 2;
    int result = binarySearch.search(arrays, target);
    assertEquals(-1, result);
  }

  @Test
  void search_3() {
    int[] arrays = new int[]{5};
    int target = 5;
    int result = binarySearch.search(arrays, target);
    assertEquals(0, result);
  }
}