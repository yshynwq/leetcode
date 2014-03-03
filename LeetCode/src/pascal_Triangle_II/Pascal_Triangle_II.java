package pascal_Triangle_II;

import java.util.ArrayList;

/*
 * Given an index k, return the kth row of the Pascal's triangle.

 For example, given k = 3,
 Return [1,3,3,1].

 Note:
 Could you optimize your algorithm to use only O(k) extra space?
 */
public class Pascal_Triangle_II {
	public static void main(String[] args) {
		Solution s = new Solution();
		ArrayList<Integer> result = s.getRow(5);
		for (Integer integer : result) {
			System.out.print(integer+"|");
		}
	}
}

class Solution {
	public ArrayList<Integer> getRow(int rowIndex) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		if (rowIndex <= 0)
			return result;
		result.add(1);
		if (rowIndex == 1)
			return result;
		result.add(1);
		if (rowIndex == 2)
			return result;
		int k = 3;
		while (k <= rowIndex) {
			ArrayList<Integer> tmp = new ArrayList<Integer>();
			tmp = result;
			result = new ArrayList<Integer>();
			result.add(1);
			for (int i = 0; i < tmp.size() - 1; i++) {
				result.add(tmp.get(i) + tmp.get(i + 1));
			}
			result.add(1);
			k++;
		}
		return result;
	}
}
