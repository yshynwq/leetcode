package others;

import utils.ListNode;

public class ReverseLinkedList_Iterative {

	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		ListNode n6 = new ListNode(6);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		ListNode root = reverse(n1);
		while(root!=null) {
			System.out.print(root.val+"->");
			root = root.next;
		}
	}

	public static ListNode reverse(ListNode root) {
		if(root==null || root.next == null) return root;
		ListNode pre = null;
		while(root!=null){
			ListNode nextNode = root.next;
			root.next = pre;
			pre = root;
			root = nextNode;
		}
		return pre;
	}
}
