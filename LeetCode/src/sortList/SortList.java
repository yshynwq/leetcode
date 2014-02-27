package sortList;

import utils.ListNode;

public class SortList {

}

// merge sort
class Solution {
	public ListNode sortList(ListNode head) {
		if (head == null || head.next == null)
			return head;
		else {
			// find middle
			ListNode fast = head;
			ListNode slow = head;
			while (fast.next != null && fast.next.next != null) {
				fast = fast.next.next;
				slow = slow.next;
			}
			fast = slow;
			slow = slow.next;
			fast.next = null;
			fast = sortList(head);
			slow = sortList(slow);
			return merge(fast, slow);

		}
	}

	public ListNode merge(ListNode fast, ListNode slow) {
		if (fast == null)
			return slow;
		if (slow == null)
			return fast;
		ListNode res, p;
		if (fast.val < slow.val) {
			res = fast;
			fast = fast.next;
		} else {
			res = slow;
			slow = slow.next;
		}
		p = res;

		while (fast != null && slow != null) {
			if (fast.val < slow.val) {
				p.next = fast;
				fast = fast.next;
			} else {
				p.next = slow;
				slow = slow.next;
			}
			p = p.next;
		}
		if (fast != null)
			p.next = fast;
		else if (slow != null)
			p.next = slow;
		return res;
	}
}
