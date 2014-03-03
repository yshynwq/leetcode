package maximum_depth_of_binary_tree;

import utils.TreeNode;

public class Maximum_depth_of_binary_tree {
	
}

class Solution {
	public int maxDepth(TreeNode root) {
		if (root == null)
			return 0;
		int left = 0, right = 0;
		if(root.left!=null)
			left = maxDepth(root.left);
		if(root.right!=null)
			right = maxDepth(root.right);
		
		return 1+Math.max(right, left);
	}
}