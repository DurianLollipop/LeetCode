package cn.ysliu.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _322_CoinChangeTest {

  private _322_CoinChange coinChange = new _322_CoinChange();

  @Test
  void coinChange_1() {
    int[] coins = new int[]{1, 2, 5};
    int amount = 11;
    int result = coinChange.coinChangeByMemo(coins, amount);
    assertEquals(3, result);
  }

  @Test
  void coinChange_2() {
    int[] coins = new int[]{2};
    int amount = 3;
    int result = coinChange.coinChangeByMemo(coins, amount);
    assertEquals(-1, result);
  }

  @Test
  void coinChange_3() {
    int[] coins = new int[]{1, 2, 5};
    int amount = 100;
    int result = coinChange.coinChangeByMemo(coins, amount);
    assertEquals(20, result);
  }

  @Test
  void coinChangeByDP_1() {
    int[] coins = new int[]{1, 2, 5};
    int amount = 11;
    int result = coinChange.coinChangeByDP(coins, amount);
    assertEquals(3, result);
  }

  @Test
  void coinChangeByDP_2() {
    int[] coins = new int[]{2};
    int amount = 3;
    int result = coinChange.coinChangeByDP(coins, amount);
    assertEquals(-1, result);
  }

  @Test
  void coinChangeByDP_3() {
    int[] coins = new int[]{1, 2, 5};
    int amount = 100;
    int result = coinChange.coinChangeByDP(coins, amount);
    assertEquals(20, result);
  }

}