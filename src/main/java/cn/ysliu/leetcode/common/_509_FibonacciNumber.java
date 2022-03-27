package cn.ysliu.leetcode.common;

import java.util.HashMap;
import java.util.Map;

/**
 * 509. 斐波那契数
 * label：递归，备忘录，动态规划
 * https://leetcode-cn.com/problems/fibonacci-number/
 *
 * 斐波那契数 （通常用 F(n) 表示）形成的序列称为 斐波那契数列 。该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和。
 */
class _509_FibonacciNumber {

  /** 备忘录 */
  private Map<Integer, Integer> memo = new HashMap<>();
  private Map<Integer, Integer> dp = new HashMap<>();

  /**
   * 递归实现
   */
  public int fibByRecursion(int n) {
    if(n ==0){
      return 0;
    }
    if (n == 1 || n ==2){
      return 1;
    }
    return fibByRecursion(n-1) + fibByRecursion(n-2);
  }

  /**
   * 递归+备忘录实现
   */
  public int fibByMemoRecursion(int n) {
    if (memo.get(n) != null){
      return memo.get(n);
    }
    if(n ==0){
      return 0;
    }
    if (n == 1 || n ==2){
      return 1;
    }
    memo.put(n, fibByMemoRecursion(n - 1) + fibByMemoRecursion(n - 2));
    return memo.get(n);
  }


  /**
   * 动态规划实现
   */
  public int fibByDynamicProgramming(int n) {
    if (n == 0){
      return 0;
    }
    if (n == 1 || n ==2){
      return 1;
    }
    dp.put(1, 1);
    dp.put(2, 1);
    for (int i = 3; i <= n; i++) {
      dp.put(i, dp.get(i-1) + dp.get(i-2));
    }
    return dp.get(n);
  }

  /**
   * 动态规划实现-状态压缩
   */
  public int fibByDynamicProgramming_StateCompression(int n) {
    if (n == 0){
      return 0;
    }
    if (n == 1 || n ==2){
      return 1;
    }
    int pre = 1;
    int current = 1;
    int result;
    for (int i = 3; i <= n; i++) {
      result = pre + current;
      pre = current;
      current = result;
    }
    return current;
  }


}
