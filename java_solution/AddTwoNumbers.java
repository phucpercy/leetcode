package java_solution;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    int mem = 0;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode();

        if (l1.next != null && l2.next != null) {
            res.val = l1.val + l2.val + mem;
            mem = res.val / 10;
            res.val = res.val %10;
            res.next = addTwoNumbers(l1.next, l2.next);
        } else if (l1.next == null && l2.next != null) {
            res.val = l1.val + l2.val + mem;
            mem = res.val / 10;
            res.val = res.val % 10;
            res.next = addTwoNumbers(new ListNode(0), l2.next);
        } else if (l1.next != null && l2.next == null) {
            res.val = l1.val + l2.val + mem;
            mem = res.val / 10;
            res.val = res.val % 10;
            res.next = addTwoNumbers(l1.next, new ListNode(0));
        } else {
            res.val = l1.val + l2.val + mem;
            mem = res.val / 10;
            res.val = res.val % 10;
            if (mem > 0) {
                res.next = new ListNode(1);
            }
        }
        return res;
    }
}

