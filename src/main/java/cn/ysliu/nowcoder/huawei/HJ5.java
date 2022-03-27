package cn.ysliu.nowcoder.huawei;

import java.util.Scanner;

/**
 * HJ5 进制转换
 */
class HJ5 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String a = in.nextLine();
    System.out.println(Integer.valueOf(a.substring(2), 16));
  }
}