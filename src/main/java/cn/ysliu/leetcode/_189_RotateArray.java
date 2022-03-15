package cn.ysliu.leetcode;

import java.util.Arrays;

/**
 * 189. 轮转数组
 * label：双指针
 * https://leetcode-cn.com/problems/rotate-array/
 *
 * 给你一个数组，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
 */
class _189_RotateArray {

  public void rotate(int[] nums, int k) {
    if (k >= nums.length){
      k = k % nums.length;
    }
    int[] temp = new int[k];
    System.arraycopy(nums, nums.length - k, temp, 0, k);
    System.arraycopy(nums, 0, nums, k, nums.length  - k);
    System.arraycopy(temp, 0, nums, 0, k);
  }

  public void rotate1(int[] nums, int k) {
    int n = nums.length;
    int[] newArr = new int[n];
    for (int i = 0; i < n; ++i) {
      newArr[(i + k) % n] = nums[i];
    }
    System.out.println(Arrays.toString(newArr));
    System.arraycopy(newArr, 0, nums, 0, n);
  }

}
