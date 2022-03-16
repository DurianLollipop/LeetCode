package cn.ysliu.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 167. 两数之和 II - 输入有序数组
 * label：双指针
 * https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/
 *
 * 给你一个下标从 1 开始的整数数组 numbers ，该数组已按 非递减顺序排列  ，请你从数组中找出满足相加之和等于目标数 target 的两个数。如果设这两个数分别是 numbers[index1] 和 numbers[index2] ，则 1 <= index1 < index2 <= numbers.length 。
 * 以长度为 2 的整数数组 [index1, index2] 的形式返回这两个整数的下标 index1 和 index2。
 * 你可以假设每个输入 只对应唯一的答案 ，而且你 不可以 重复使用相同的元素。
 * 你所设计的解决方案必须只使用常量级的额外空间。
 */
class _167_TwoSumIIInputArrayIsSorted {

  /**
   * 时间复杂度: O(n)
   * 空间复杂度:O(n)
   */
  public int[] twoSum1(int[] numbers, int target) {
    Map<Integer, Integer> map = new HashMap<>(numbers.length);
    for (int i = 0; i < numbers.length; i++) {
      if (map.get(numbers[i]) == null) {
        map.put(target - numbers[i], i + 1);
      } else {
        return new int[]{map.get(numbers[i]), i + 1};
      }
    }
    return null;
  }

  /**
   * 时间复杂度：O(n)，其中 nn 是数组的长度。两个指针移动的总次数最多为 nn 次。
   * 空间复杂度：O(1)。
   * 2,7,11,15
   */
  public int[] twoSum(int[] numbers, int target) {
    int left = 0;
    int right = numbers.length - 1;
    while (left < right) {
      if (numbers[left] + numbers[right] == target) {
        return new int[]{left+1, right+1};
      } else if (numbers[left] + numbers[right] < target) {
        left++;
      } else {
        right--;
      }
    }
    return null;
  }

}
