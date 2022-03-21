package cn.ysliu.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;

class _876_MiddleOfTheLinkedListTest {

  private _876_MiddleOfTheLinkedList middleOfTheLinkedList = new _876_MiddleOfTheLinkedList();

  @Test
  void middleNode_1() {
    ListNode listNode = arraysToLinkedList(new int[]{1, 2, 3, 4, 5});
    ListNode middleNode = middleOfTheLinkedList.middleNode(listNode);
    assertEquals(3, middleNode.val);
  }

  @Test
  void middleNode_2() {
    ListNode listNode = arraysToLinkedList(new int[]{1, 2, 3, 4, 5, 6});
    ListNode middleNode = middleOfTheLinkedList.middleNode(listNode);
    assertEquals(4, middleNode.val);
  }

  private ListNode arraysToLinkedList(int[] ints) {
    ListNode head = null;
    for (int i = ints.length - 1; i >= 0; i--) {
      head = new ListNode(ints[i], head);
    }
    return head;
  }
}