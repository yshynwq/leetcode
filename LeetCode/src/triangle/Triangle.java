package triangle;

import java.util.ArrayList;

/*
 * Given a triangle, find the minimum path sum from top to bottom. Each step you may move to adjacent numbers on the row below.

 For example, given the following triangle
 [
 [2],
 [3,4],
 [6,5,7],
 [4,1,8,3]
 ]
 The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).

 Note:
 Bonus point if you are able to do this using only O(n) extra space, where n is the total number of rows in the triangle.
 */
public class Triangle {

}

class Solution {
	public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
		int result = 0;
		if (triangle == null)
			return result;
		for (ArrayList<Integer> arrayList : triangle) {
			int mintmp = Integer.MAX_VALUE;
			for (Integer integer : arrayList) {
				if (integer < mintmp)
					mintmp = integer;
			}
			result += mintmp;
		}
		return result;
	}
}
