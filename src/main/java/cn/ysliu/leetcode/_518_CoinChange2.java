package cn.ysliu.leetcode;

/**
 * 518. 零钱兑换 II
 * label：0-1背包问题，动态规划，备忘录，递归
 * https://leetcode-cn.com/problems/coin-change-2/
 *
 * 给你一个整数数组 coins 表示不同面额的硬币，另给一个整数 amount 表示总金额。
 * 请你计算并返回可以凑成总金额的硬币组合数。如果任何硬币组合都无法凑出总金额，返回 0 。
 * 假设每一种面额的硬币有无限个。
 * 题目数据保证结果符合 32 位带符号整数。
 * ---状态和选择---
 * 状态：背包的容量（金额），可选择的物品（硬币的种类）
 * 选择：放进背包（某种金额的硬币放入背包），不放进背包（某种金额的硬币不放入背包）
 * ---dp数组定义---
 * 若只使用前i种物品（前几种面额的硬币，含0种），当背包容量为j时（要凑的金额数，含0元），有dp[i][j]种凑法
 * ---base case---
 * case1：dp[0][..] = 0，不使用任何硬币，就无法凑出金额。
 * case2：dp[..][0] = 1；凑出金额0，都存在一种情况，不管硬币有多少选择，不放入背包都是0。
 * ---根据“选择”，思考状态转移的逻辑
 * 选择1：不把第i个物品放入背包（不把第i种面值硬币放入背包），继承之前的结果dp[i-1][j]的选择种类。
 * 选择2：把第i个物品放入背包（把金额为第i种面值的硬币放入背包），等于当前背包余量（金额余量j-coins[i-1]）的dp[i][j-coins[i-1]]种类选择。
 * 当前金额的凑钱种数 = i-1种硬币面值凑j元的种类 + i种硬币面值凑余额（j-硬币面值元）的种类。
 *
 */
class _518_CoinChange2 {

  public int changeByDP(int amount, int[] coins) {
    // int[前N个硬币，0表示不用硬币][凑的S块钱，0表示不需要钱] = 用前N种硬币凑S元的选择数。
    int[][] dp = new int[coins.length + 1][amount + 1];
    // base case
    for (int index = 0; index < coins.length + 1; index++) {
      // 凑0元的硬币数的选择就是不使用硬币，不管使用前N个硬币种类，总有那么一种情况就是不使用硬币。
      dp[index][0] = 1;
    }
    // 状态1：剩余金额会改变
    for (int i = 1; i <= coins.length; i++) {
      // 状态2：可以选择的硬币金额会变
      for (int j = 1; j <= amount; j++) {
        // 选择：计算(把物品i放进背包, 不把物品i放进背包);
        // 把物品放入背包的情况
        if (j - coins[i-1] >= 0) {
          // 不把硬币放入背包，硬币数量与不放入一样，金额不变：dp[i-1][j]，继承之前硬币数量的结果，
          // 把硬币放入背包：dp[i][j-coins[i-1]]，剩余金额的选择数
          dp[i][j] = dp[i - 1][j] + dp[i][j - coins[i - 1]];
        } else {
          // 不把物品放入背包的情况
          dp[i][j] = dp[i-1][j];
        }
      }
    }
    return dp[coins.length][amount];
  }

  /**
   * 压缩状态
   */
  public int changeByDPStateCompression(int amount, int[] coins) {
    // int[前N个硬币，0表示不用硬币][凑的S块钱，0表示不需要钱] = 用前N种硬币凑S元的选择数。
    int[] dp = new int[amount + 1];
    // base case
    dp[0] = 1;
    // 状态1：剩余金额会改变
    for (int coin : coins) {
      // 状态2：可以选择的硬币金额会变
      for (int j = 1; j <= amount; j++) {
        if (j - coin >= 0) {
          dp[j] = dp[j] + dp[j - coin];
        }
      }
    }
    return dp[amount];
  }
}