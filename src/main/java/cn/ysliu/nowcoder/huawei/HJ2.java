package cn.ysliu.nowcoder.huawei;

import java.util.Scanner;

/**
 * HJ2 计算某字符出现次数
 */
class HJ2 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String a = in.nextLine().toLowerCase();
    String b = in.nextLine().toLowerCase();
    System.out.println(a.length() - a.replaceAll(b, "").length());
  }

}
