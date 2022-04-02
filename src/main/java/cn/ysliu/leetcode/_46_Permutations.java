package cn.ysliu.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 46. 全排列
 * label：回溯
 * https://leetcode-cn.com/problems/permutations/
 *
 * 给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。
 */
class _46_Permutations {

  private List<List<Integer>> res = new ArrayList<>();

  public List<List<Integer>> permute(int[] nums) {
    // 路径
    LinkedList<Integer> track = new LinkedList<>();
    // nums 选择， track 路径
    backBack(nums, track);
    return res;
  }

  private void backBack(int[] nums, LinkedList<Integer> track) {
    // 结束条件
    if (track.size() == nums.length) {
      // new LinkedList<>(track), 回溯会清空track
      res.add(new LinkedList<>(track));
      return;
    }

    for (int num : nums) {
      // 路径是否包含当前节点，包含说明走过
      if (track.contains(num)){
        continue;
      }
      // 将当前选择加入路径
      track.add(num);
      backBack(nums, track);
      // 回溯，将当前选择从路径种删除
      track.removeLast();
    }
  }

}
