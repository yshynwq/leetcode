package removeNthNode;

/*
 * Given linked list: 1->2->3->4->5, and n = 2.

 After removing the second node from the end, the linked list becomes 1->2->3->5.
 */
public class RemoveNthNode {
	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		// ListNode n4 = new ListNode(4);
		// ListNode n5 = new ListNode(5);
		n1.next = n2;
		n2.next=n3;
		// n3.next=n4;
		// n4.next=n5;
		Solution s = new Solution();
		ListNode result = s.removeNthFromEnd(n1, 2);
		System.out.println();
	}
}

class Solution {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		// IMPORTANT: Please reset any member data you declared, as
		// the same Solution instance will be reused for each test case.
		int length = getLength(head);
		int index = length - n + 1;
		System.out.println(length + ":" + index);
		if (length < n) {
			return null;
		} else if (index == 0) {
			return head;
		} else if (index == length) {
			return removeLast(head, index);
		} else if (index == 1) {
			return removeFirst(head);
		} else {

			return remove(head, index);
		}
	}

	ListNode removeLast(ListNode head, int index) {
		ListNode curr = head;
		int count = 0;
		while (curr.next != null) {
			count++;
			if (count + 1 == index) {
				curr.next = null;
				return head;
			}
			curr = curr.next;
		}
		return null;

	}

	ListNode removeFirst(ListNode head) {
		head = head.next;
		return head;
	}

	ListNode remove(ListNode head, int index) {
		ListNode curr = head;
		int count = 0;
		while (curr.next != null) {
			count++;
			if (count + 1 == index) {
				if (curr.next.next == null) {
					curr.next = null;
				} else {
					curr.next = curr.next.next;
				}
				return head;
			}
			curr = curr.next;
		}
		return null;
	}

	int getLength(ListNode head) {
		ListNode n = head;
		int length = 1;
		while (n.next != null) {
			length++;
			n = n.next;
		}
		return length;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}
