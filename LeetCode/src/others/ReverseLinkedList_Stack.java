package others;

import java.util.Stack;

import utils.ListNode;

public class ReverseLinkedList_Stack {

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
		Stack<ListNode> stack = new Stack<ListNode>();
		while (root != null) {
			stack.push(root);
			root = root.next;
		}

		root = stack.pop();
		ListNode current = root;
		while (!stack.empty()) {
			ListNode next = stack.pop();
			next.next = null;
			current.next = next;
			current = next;
		}
		return root;
	}
}
