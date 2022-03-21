package cn.ysliu.leetcode.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ListNode {

  public int val;
  public ListNode next;

  ListNode() {
  }

  ListNode(int val) {
    this.val = val;
  }

  public ListNode(int val, ListNode next) {
    this.val = val;
    this.next = next;
  }

  public static ListNode arraysToLinkedList(int[] ints) {
    ListNode head = null;
    for (int i = ints.length - 1; i >= 0; i--) {
      head = new ListNode(ints[i], head);
    }
    return head;
  }

  public static int[] linkedListToArrays(ListNode head) {
    List<Integer> list = new ArrayList<>();
    while(head != null) {
      list.add(head.val);
      head = head.next;
    }
    return list.stream().mapToInt(Integer::valueOf).toArray();
  }
}
