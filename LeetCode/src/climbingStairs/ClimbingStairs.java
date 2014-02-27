package climbingStairs;

/*
 * 
 You are climbing a stair case. It takes n steps to reach to the top.

 Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * 
 */

public class ClimbingStairs {
	public static void main(String[] args) {

	}
}

class Solution {
	public int climbStairs(int n) {
		int[] results = new int[n + 1];
		if (n < 1)
			return 0;
		else if (n == 1)
			return 1;
		else if (n == 2)
			return 2;
		else {

			results[0] = 0;
			results[1] = 1;
			results[2] = 2;
			int count = 3;
			while (count <= n) {
				results[count] = results[count - 1] + results[count - 2];
				count++;
			}
		}
		return results[n];
	}
}