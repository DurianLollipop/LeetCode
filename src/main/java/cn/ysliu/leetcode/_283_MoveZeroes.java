package cn.ysliu.leetcode;

/**
 * 283. 移动零
 * label：双指针
 * https://leetcode-cn.com/problems/move-zeroes/
 *
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 */
class _283_MoveZeroes {

  // 0,1,0,3,12
  public void moveZeroes(int[] nums) {
    int left = 0;
    int right = 0;
    while(right < nums.length){
      if (nums[right] != 0) {
        nums[left] = nums[right];
        left++;
        right++;
      } else {
        right++;
      }
    }
    while (left < nums.length) {
      nums[left] = 0;
      left++;
    }
  }

}
