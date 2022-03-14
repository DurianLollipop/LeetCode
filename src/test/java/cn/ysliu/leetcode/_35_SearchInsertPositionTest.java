package cn.ysliu.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _35_SearchInsertPositionTest {

  _35_SearchInsertPosition searchInsertPosition = new _35_SearchInsertPosition();

  @Test
  void searchInsert_1() {
    int[] arrays = new int[]{1,3,5,6};
    int target = 5;
    int result = searchInsertPosition.searchInsert(arrays, target);
    assertEquals(2, result);
  }

  @Test
  void searchInsert_2() {
    int[] arrays = new int[]{1,3,5,6};
    int target = 2;
    int result = searchInsertPosition.searchInsert(arrays, target);
    assertEquals(1, result);
  }

  @Test
  void searchInsert_3() {
    int[] arrays = new int[]{1,3,5,6};
    int target = 7;
    int result = searchInsertPosition.searchInsert(arrays, target);
    assertEquals(4, result);
  }

  @Test
  void searchInsert_4() {
    int[] arrays = new int[]{1,3,5,6};
    int target = 0;
    int result = searchInsertPosition.searchInsert(arrays, target);
    assertEquals(0, result);
  }

  @Test
  void searchInsert_5() {
    int[] arrays = new int[]{1};
    int target = 0;
    int result = searchInsertPosition.searchInsert(arrays, target);
    assertEquals(0, result);
  }

  @Test
  void searchInsert_6() {
    int[] arrays = new int[]{1};
    int target = 1;
    int result = searchInsertPosition.searchInsert(arrays, target);
    assertEquals(0, result);
  }
}