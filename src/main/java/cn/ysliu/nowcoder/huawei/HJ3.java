package cn.ysliu.nowcoder.huawei;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * HJ3 明明的随机数
 *
 * 明明生成了NN个1到500之间的随机整数。请你删去其中重复的数字，即相同的数字只保留一个，把其余相同的数去掉，然后再把这些数从小到大排序，按照排好的顺序输出。
 * 数据范围： 1 \le n \le 1000 \1≤n≤1000  ，输入的数字大小满足 1 \le val \le 500 \1≤val≤500
 */
class HJ3 {

  public static void main(String[] args) {
    TreeSet<Integer> set = new TreeSet<>();
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    // 注意 hasNext 和 hasNextLine 的区别
    for (int i =0; i < num; i++) { // 注意 while 处理多个 case
      set.add(in.nextInt());
    }
    for(int a : set) {
      System.out.println(a);
    }
  }

}
