package rotate_list;

import utils.ListNode;

/*

 * 
 *Given a list, rotate the list to the right by k places, where k is non-negative.

 For example:
 Given 1->2->3->4->5->NULL and k = 2,
 return 4->5->1->2->3->NULL.
 * 
 */

public class RotateList {

}

class Solution {
	public ListNode rotateRight(ListNode head, int n) {
		if (head == null)
			return null;
		ListNode n1 = head, n2 = head;
		while (n > 0) {
			n2 = n2.next;
			n--;
			if (n2 == null) {
				n2 = head;
			}
		}
		
		if (n1 == n2)
			return n1;
		while (n2.next != null) {
			n1 = n1.next;
			n2 = n2.next;
		}
		// till here, n1 is the last nth node
		ListNode tmp = n1.next; 
		n2.next = head; // new head
		n1.next = null; //mark tail
		return tmp;
		
	}
}
