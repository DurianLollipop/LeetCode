package cn.ysliu.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _283_MoveZeroesTest {

  private _283_MoveZeroes moveZeroes = new _283_MoveZeroes();

  @Test
  void moveZeroes_1() {
    int[] arrays = new int[]{0,1,0,3,12};
    moveZeroes.moveZeroes(arrays);
    assertArrayEquals(new int[]{1,3,12,0,0}, arrays);
  }

  @Test
  void moveZeroes_2() {
    int[] arrays = new int[]{0};
    moveZeroes.moveZeroes(arrays);
    assertArrayEquals(new int[]{0}, arrays);
  }
}