package cn.ysliu.leetcode;

import cn.ysliu.leetcode.common.ListNode;

/**
 * 19. 删除链表的倒数第 N 个结点
 * label：双指针
 * https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/
 *
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 */
class _19_RemoveNthNodeFromEndOfList {

  public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode dummy = new ListNode(0, head);
    ListNode slow = dummy, quick = head;
    for (int i = 0; i < n; i++) {
      quick = quick.next;
    }
    while (quick != null) {
      quick = quick.next;
      slow = slow.next;
    }
    slow.next = slow.next.next;
    return dummy.next;
  }

}
