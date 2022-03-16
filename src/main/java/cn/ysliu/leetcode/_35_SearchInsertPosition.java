package cn.ysliu.leetcode;

/**
 * 35. 搜索插入位置
 * label：二分查找,双指针
 * https://leetcode-cn.com/problems/search-insert-position/
 *
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。请必须使用时间复杂度为 O(log n) 的算法。
 */
class _35_SearchInsertPosition {

  public int searchInsert(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;
    while (left <= right) {
      int middle = left + ((right - left) >> 1);
      if (nums[middle] == target) {
        return middle;
      } else if (nums[middle] < target) {
        left = middle + 1;
      } else {
        right = middle - 1;
      }
    }
    return left;
  }

}
