package cn.ysliu.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _518_CoinChange2Test {

  private _518_CoinChange2 coinChange2 = new _518_CoinChange2();

  @Test
  void changeByDP_1() {
    int[] coins = {1,2,5};
    int amount = 5;
    int result = coinChange2.changeByDP(amount, coins);
    assertEquals(4, result);
  }

  @Test
  void changeByDP_2() {
    int[] coins = {2};
    int amount = 3;
    int result = coinChange2.changeByDP(amount, coins);
    assertEquals(0, result);
  }

  @Test
  void changeByDPStateCompressionP_1() {
    int[] coins = {1,2,5};
    int amount = 5;
    int result = coinChange2.changeByDPStateCompression(amount, coins);
    assertEquals(4, result);
  }

  @Test
  void changeByDPStateCompression_2() {
    int[] coins = {2};
    int amount = 3;
    int result = coinChange2.changeByDPStateCompression(amount, coins);
    assertEquals(0, result);
  }

}