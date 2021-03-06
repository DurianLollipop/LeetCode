package cn.ysliu.leetcode;

/**
 * 704. 二分查找
 * label：二分查找,双指针
 * https://leetcode-cn.com/problems/binary-search/
 *
 * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
 */
class _704_BinarySearch {

  public int search(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;
    while (left <= right) {
      int middle = left + ((right-left) >> 1);
      if (nums[middle] == target) {
        return middle;
      } else if (nums[middle] < target) {
        left = middle+1;
      } else {
        right = middle-1;
      }
    }
    return -1;
  }

}
