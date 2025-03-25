package java_solution;

public class LinkedListCycle {

  /**
   * Definition for singly-linked list. class ListNode { int val; ListNode next; ListNode(int x) {
   * val = x; next = null; } }
   */
  public class Solution {

    public boolean hasCycle(ListNode head) {
      ListNode slow = head;
      if (slow == null || slow.next == null) {
        return false;
      }
      ListNode fast = head.next;

      if (fast == null || fast.next == null) {
        return false;
      }

      while (slow != fast) {
        if (slow.next == null || fast.next == null) {
          return false;
        }
        slow = slow.next;
        fast = fast.next.next;
        if (fast == null) {
          return false;
        }
      }

      return true;
    }
  }
}
