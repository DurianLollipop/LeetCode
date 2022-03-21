package cn.ysliu.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import cn.ysliu.leetcode.common.ListNode;
import org.junit.jupiter.api.Test;

class _876_MiddleOfTheLinkedListTest {

  private _876_MiddleOfTheLinkedList middleOfTheLinkedList = new _876_MiddleOfTheLinkedList();

  @Test
  void middleNode_1() {
    ListNode listNode = ListNode.arraysToLinkedList(new int[]{1, 2, 3, 4, 5});
    ListNode middleNode = middleOfTheLinkedList.middleNode(listNode);
    assertEquals(3, middleNode.val);
  }

  @Test
  void middleNode_2() {
    ListNode listNode = ListNode.arraysToLinkedList(new int[]{1, 2, 3, 4, 5, 6});
    ListNode middleNode = middleOfTheLinkedList.middleNode(listNode);
    assertEquals(4, middleNode.val);
  }

}