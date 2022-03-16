package cn.ysliu.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class _977_SquaresOfASortedArrayTest {

  _977_SquaresOfASortedArray squaresOfASortedArray = new _977_SquaresOfASortedArray();

  @Test
  void sortedSquares_1() {
    int[] arrays = new int[]{-4,-1,0,3,10};
    int[] result = squaresOfASortedArray.sortedSquares(arrays);
    assertEquals(new int[]{0, 1, 9, 16, 100}, result);
  }

  @Test
  void sortedSquares_2() {
    int[] arrays = new int[]{-7,-3,2,3,11};
    int[] result = squaresOfASortedArray.sortedSquares(arrays);
    assertEquals(new int[]{4, 9, 9, 49, 121}, result);
  }
}