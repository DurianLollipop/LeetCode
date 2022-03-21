package cn.ysliu.leetcode;

/**
 * 557. 反转字符串中的单词 III
 * label：双指针
 * https://leetcode-cn.com/problems/reverse-words-in-a-string-iii/
 *
 * 给定一个字符串 s ，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 */
class _557_ReverseWordsInAStringIII {

  private int i;

  public String reverseWords(String s) {
    char[] chars = s.toCharArray();
    int right;
    int index = 0;
    String[] strings = s.split(" ");
    for (String string : strings) {
      char[] chars1 = string.toCharArray();
      right = chars1.length - 1;
      for (int j = right; j >= 0; j--) {
        chars[index] = chars1[j];
        index++;
      }
      if (index != chars.length){
        chars[index] = ' ';
        index++;
      }
    }
    return String.valueOf(chars);
  }
}
