package convert_Sorted_Array_to_Binary_Search_Tree;

import utils.TreeNode;

public class Convert_Sorted_Array_to_Binary_Search_Tree {

}

class Solution {
    public TreeNode sortedArrayToBST(int[] num) {
        return convert(num, 0, num.length-1);
    }
    
    private static TreeNode convert(int[] num, int start, int end){
        if(start>end)
            return null;
        int mid = start+((end-start)/2);
        TreeNode root = new TreeNode(num[mid]);
        root.left = convert(num, start, mid-1);
        root.right = convert(num, mid+1, end);
        return root;
    }
    
}