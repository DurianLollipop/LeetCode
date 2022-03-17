package cn.ysliu.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _344_ReverseStringTest {
  
  private _344_ReverseString reverseString =new _344_ReverseString(); 

  /**
   * 示例 1：
   *
   * 输入：s = ['h','e','l','l','o']
   * 输出：['o','l','l','e','h']
   * 示例 2：
   *
   * 输入：s = ['H','a','n','n','a','h']
   * 输出：['h','a','n','n','a','H']
   */
  @Test
  void reverseString_1() {
    char[] chars = new char[]{'h','e','l','l','o'};
    reverseString.reverseString(chars);
    assertArrayEquals(new char[]{'o','l','l','e','h'}, chars);
  }
  
  @Test
  void reverseString_2() {
    char[] chars = new char[]{'H','a','n','n','a','h'};
    reverseString.reverseString(chars);
    assertArrayEquals(new char[]{'h','a','n','n','a','H'}, chars);
  }
}