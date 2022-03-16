package cn.ysliu.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _167_TwoSumIIInputArrayIsSortedTest {

  private _167_TwoSumIIInputArrayIsSorted twoSumIIInputArrayIsSorted = new _167_TwoSumIIInputArrayIsSorted();

  @Test
  void twoSum_1() {
    int[] arrays = new int[]{2,7,11,15};
    int target = 9;
    int[] result = twoSumIIInputArrayIsSorted.twoSum(arrays, target);
    assertArrayEquals(new int[]{1,2}, result);
  }

  @Test
  void twoSum_2() {
    int[] arrays = new int[]{2,3,4};
    int target = 6;
    int[] result = twoSumIIInputArrayIsSorted.twoSum(arrays, target);
    assertArrayEquals(new int[]{1,3}, result);
  }

  @Test
  void twoSum_3() {
    int[] arrays = new int[]{-1,0};
    int target = -1;
    int[] result = twoSumIIInputArrayIsSorted.twoSum(arrays, target);
    assertArrayEquals(new int[]{1,2}, result);
  }
}