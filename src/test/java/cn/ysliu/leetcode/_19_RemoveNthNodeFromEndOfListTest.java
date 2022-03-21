package cn.ysliu.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import cn.ysliu.leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

class _19_RemoveNthNodeFromEndOfListTest {

  private _19_RemoveNthNodeFromEndOfList removeNthNodeFromEndOfList = new _19_RemoveNthNodeFromEndOfList();

  @Test
  void removeNthFromEnd_1() {
    ListNode head = ListNode.arraysToLinkedList(new int[]{1,2,3,4,5});
    int removeIndex = 2;
    ListNode result = removeNthNodeFromEndOfList.removeNthFromEnd(head, removeIndex);
    assertArrayEquals(ListNode.linkedListToArrays(result), new int[]{1,2,3,5});
  }

  @Test
  void removeNthFromEnd_2() {
    ListNode head = ListNode.arraysToLinkedList(new int[]{1});
    int removeIndex = 1;
    ListNode result = removeNthNodeFromEndOfList.removeNthFromEnd(head, removeIndex);
    assertArrayEquals(ListNode.linkedListToArrays(result), new int[]{});
  }

  @Test
  void removeNthFromEnd_3() {
    ListNode head = ListNode.arraysToLinkedList(new int[]{1, 2});
    int removeIndex = 1;
    ListNode result = removeNthNodeFromEndOfList.removeNthFromEnd(head, removeIndex);
    assertArrayEquals(ListNode.linkedListToArrays(result), new int[]{1});
  }

  @Test
  void removeNthFromEnd_4() {
    ListNode head = ListNode.arraysToLinkedList(new int[]{1, 2});
    int removeIndex = 2;
    ListNode result = removeNthNodeFromEndOfList.removeNthFromEnd(head, removeIndex);
    assertArrayEquals(ListNode.linkedListToArrays(result), new int[]{2});
  }
}