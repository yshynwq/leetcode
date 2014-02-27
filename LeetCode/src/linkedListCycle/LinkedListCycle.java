package linkedListCycle;

import utils.ListNode;

/*
 Given a linked list, determine if it has a cycle in it.

 Follow up:
 Can you solve it without using extra space?
 * 
 */

public class LinkedListCycle {

}

class Solution {
	public boolean hasCycle(ListNode head) {
		if (head == null)
			return false;
		ListNode slow = head;
		ListNode fast = head.next;

		while (fast != null) {
			if (slow.val == fast.val)
				return true;
			if (fast.next == null)
				return false;
			else{
				slow = slow.next;
				fast = fast.next.next;
			}
		}
		return false;
	}
}
