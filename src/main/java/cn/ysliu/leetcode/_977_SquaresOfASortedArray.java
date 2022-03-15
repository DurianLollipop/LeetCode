package cn.ysliu.leetcode;

/**
 * 977. 有序数组的平方
 * label：双指针
 * https://leetcode-cn.com/problems/squares-of-a-sorted-array/
 *
 * 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
 */
class _977_SquaresOfASortedArray {

  public int[] sortedSquares(int[] nums) {
    int[] result = new int[nums.length];
    int left = 0;
    int right = nums.length-1;
    int leftSquare;
    int rightSquare;
    int count = nums.length-1;
    while(left <= right) {
      leftSquare = nums[left] * nums[left];
      rightSquare = nums[right] * nums[right];
      if (leftSquare <= rightSquare) {
        right = right - 1;
        result[count] = rightSquare;
      } else {
        left = left + 1;
        result[count] = leftSquare;
      }
      count--;
    }
    return result;
  }

}
