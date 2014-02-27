package removeNthNodeFromEndofList;

/*
 * 
 Given a linked list, remove the nth node from the end of list and return its head.

 For example,

 Given linked list: 1->2->3->4->5, and n = 2.

 After removing the second node from the end, the linked list becomes 1->2->3->5.
 Note:
 Given n will always be valid.
 Try to do this in one pass.
 * 
 */

import utils.ListNode;

public class RemoveNthNodeFromEndofList {
	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		n1.next=n2;
//		n2.next=n3;
//		n3.next=n4;
//		n4.next=n5;
		Solution s = new Solution();
		s.showList(n1);
		System.out.println();
		s.showList(s.removeNthFromEnd(n1, 2));
		
	}
}

class Solution {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if(n==0) return head;
		// find the nth node from end
		ListNode nth = head;
		while(n>0){
			nth = nth.next;
			n--;
		}
		ListNode pre_nth = head;
		while(nth!=null){
			pre_nth = pre_nth.next;
			nth = nth.next;
		}
		ListNode pre_pre_nth= head;
		while(pre_pre_nth.next.val!=pre_nth.val){
			pre_pre_nth = pre_pre_nth.next;
		}
		pre_pre_nth.next=pre_nth.next;
		return head;
	}
	
	public void showList(ListNode head){
		while(head!=null){
			System.out.print(head.val);
			head = head.next;
		}
	}
}


















