package cn.ysliu.leetcode;

import cn.ysliu.leetcode.common.ListNode;

/**
 * 876. 链表的中间结点
 * label：双指针
 * https://leetcode-cn.com/problems/middle-of-the-linked-list/
 *
 * 给定一个头结点为 head 的非空单链表，返回链表的中间结点。
 * 如果有两个中间结点，则返回第二个中间结点。
 */
class _876_MiddleOfTheLinkedList {

  public ListNode middleNode(ListNode head) {
    ListNode quick = head;
    ListNode slow = head;
    while (quick.next != null) {
      if (quick.next.next == null) {
        return slow.next;
      }
      slow = slow.next;
      quick = quick.next.next;
    }
    return slow;
  }

}