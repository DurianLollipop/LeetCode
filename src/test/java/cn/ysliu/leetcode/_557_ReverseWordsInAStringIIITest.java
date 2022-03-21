package cn.ysliu.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _557_ReverseWordsInAStringIIITest {

  private _557_ReverseWordsInAStringIII reverseWordsInAStringIII = new _557_ReverseWordsInAStringIII();

  @Test
  void reverseWords() {
    String s = "Let's take LeetCode contest";
    String result = reverseWordsInAStringIII.reverseWords(s);
    assertEquals("s'teL ekat edoCteeL tsetnoc", result);
  }

  @Test
  void reverseWords_2() {
    String s = "God Ding";
    String result = reverseWordsInAStringIII.reverseWords(s);
    assertEquals("doG gniD", result);
  }
}