package cn.ysliu.nowcoder.huawei;

import java.util.Scanner;

/**
 * HJ1 字符串最后一个单词的长度
 */
class HJ1 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    // 注意 hasNext 和 hasNextLine 的区别
    while (in.hasNextLine()) { // 注意 while 处理多个 case
      String a = in.nextLine();
      String[] s = a.split(" ");
      System.out.println(s[s.length - 1].length());
    }
  }

}
