package minimum_depth_of_binary_tree;

import utils.TreeNode;

public class Minimum_depth_of_binary_tree {
	public static void main(String[] args) {
		Solution s = new Solution();
		TreeNode root = new TreeNode(0);
		TreeNode left = new TreeNode(1);
		root.left=left;
		System.out.println(s.minDepth(root));
	}
}

class Solution {
	public int minDepth(TreeNode root) {
		if (root == null)
			return 0;
		int left = 0, right = 0;
		if (root.left != null)
			left = minDepth(root.left);
		if (root.right != null)
			right = minDepth(root.right);
		return 1 + Math.min(left, right);
	}
}