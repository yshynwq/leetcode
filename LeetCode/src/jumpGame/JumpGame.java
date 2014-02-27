package jumpGame;

/*
 Given an array of non-negative integers, you are initially positioned at the first index of the array.

 Each element in the array represents your maximum jump length at that position.

 Determine if you are able to reach the last index.

 For example:
 A = [2,3,1,1,4], return true.

 A = [3,2,1,0,4], return false.


 */

public class JumpGame {
	public static void main(String[] args) {
		Solution s = new Solution();
		int[] A = { 2, 3, 1, 1, 4 };
		//int[] A = { 3, 2, 1, 0, 4 };
		//int[] A = {0};
		System.out.println(s.canJump(A));

	}
}

class Solution {
	public boolean canJump(int[] A) {
		if (A == null || A.length == 0)
			return false;
		int length = A.length;
		int acc_steps = 0;
		int pre_steps = 0;
		while (acc_steps < length) {
			pre_steps = acc_steps;
			acc_steps += A[acc_steps];
			// in case of infinite loop
			if (acc_steps == pre_steps && acc_steps!=length-1)
				return false; 
			if (acc_steps >= length - 1) {
				return true;
			}
		}
		return false;
	}
}
