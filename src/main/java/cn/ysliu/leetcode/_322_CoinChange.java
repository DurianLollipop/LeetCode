package cn.ysliu.leetcode;

import java.util.Arrays;

/**
 * 322. 零钱兑换
 * label：动态规划，备忘录，递归
 * https://leetcode-cn.com/problems/coin-change/
 *
 * 给你一个整数数组 coins ，表示不同面额的硬币；以及一个整数 amount ，表示总金额。 计算并返回可以凑成总金额所需的 最少的硬币个数 。如果没有任何一种硬币组合能组成总金额，返回 -1
 * 。 你可以认为每种硬币的数量是无限的。
 */
class _322_CoinChange {

  private int[] memo;

  public int coinChangeByMemo(int[] coins, int amount) {
    memo = new int[amount + 1];
    return findWay(coins, amount);
  }

  int findWay(int[] coins, int amount) {
    if (amount == 0) {
      return 0;
    }
    if (amount < 0) {
      return -1;
    }
    if (memo[amount] != 0) {
      return memo[amount];
    }
    // 初始化为最大值，amount + 1相当于最大值
    int res = amount + 1;
    for (int coin : coins) {
      // 子问题
      int subProblem = findWay(coins, amount - coin);
      // 结果小于零，则无解
      if (subProblem == -1) {
        continue;
      }
      // 返回当前子问题的最优解
      res = Math.min(res, 1 + subProblem);
    }
    // 如果说res==初始的最大值，则说明无解。
    res = res == amount + 1 ? -1 : res;
    memo[amount] = res;
    return res;
  }

  /**
   * 动态规划
   * 自底向上，先求出最简单用例的最优解，再求出上一层的最优解
   */
  public int coinChangeByDP(int[] coins, int amount) {
    int[] dp = new int[amount + 1];
    // 设置最大值，用于判断某个金额是否有解
    Arrays.fill(dp, amount+1);
    dp[0] = 0;
    for (int i = 1; i <= amount; i++) {
      for (int coin : coins) {
        // 获取更底下一层的最优解
        if (i - coin >= 0 && dp[i - coin] < dp[i]) {
          dp[i] = dp[i - coin] + 1;
        }
      }
    }
    return dp[amount] == amount + 1 ? -1 : dp[amount];
  }


}
