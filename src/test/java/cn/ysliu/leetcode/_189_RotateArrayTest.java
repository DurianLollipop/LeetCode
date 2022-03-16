package cn.ysliu.leetcode;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class _189_RotateArrayTest {

  _189_RotateArray rotateArray = new _189_RotateArray();

  @Test
  void rotate() {
    int[] arrays = new int[]{-1,-100,3,99};
    int rotateSize = 2;
    rotateArray.rotate1(arrays, rotateSize);
    assertArrayEquals(new int[]{3,99,-1,-100}, arrays);
  }

  @Test
  void rotate_2() {
    int[] arrays = new int[]{1,2,3,4,5,6,7};
    int rotateSize = 3;
    rotateArray.rotate1(arrays, rotateSize);
    assertEquals(new int[]{5,6,7,1,2,3,4}, arrays);
  }

  @Test
  void rotate_3() {
    int[] arrays = new int[]{-1};
    int rotateSize = 2;
    rotateArray.rotate1(arrays, rotateSize);
    assertEquals(new int[]{-1}, arrays);
  }

}