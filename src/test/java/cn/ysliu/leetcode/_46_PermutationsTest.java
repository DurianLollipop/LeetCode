package cn.ysliu.leetcode;

import java.util.List;
import org.junit.jupiter.api.Test;

class _46_PermutationsTest {

  private _46_Permutations permutations = new _46_Permutations();

  @Test
  void testPermute() {
    int[] nums = {1,2,3};
    List<List<Integer>> result = permutations.permute(nums);
    result.stream().spliterator().forEachRemaining(System.out::println);
  }

}
