package pascal_Triangle_I;

import java.util.ArrayList;

/*
 * Given numRows, generate the first numRows of Pascal's triangle.

 For example, given numRows = 5,
 Return

 [
 [1],
 [1,1],
 [1,2,1],
 [1,3,3,1],
 [1,4,6,4,1]
 ]
 * 
 * 
 */
public class Pascal_Triangle_I {
	public static void main(String[] args) {
		Solution s = new Solution();
		ArrayList<ArrayList<Integer>> result = s.generate(5);
		for (ArrayList<Integer> arrayList : result) {
			for (Integer integer : arrayList) {
				System.out.print(integer+"|");
			}
			System.out.println();
		}
	}
}

class Solution {
	public ArrayList<ArrayList<Integer>> generate(int numRows) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if (numRows <= 0)
			return result;
		ArrayList<Integer> first = new ArrayList<Integer>();
		first.add(1);
		result.add(first);
		if (numRows == 1)
			return result;
		ArrayList<Integer> seconde = new ArrayList<Integer>();
		seconde.add(1);
		seconde.add(1);
		result.add(seconde);
		if (numRows == 2)
			return result;
		int k=3;
		while(k<=numRows){
			ArrayList<Integer> prev=result.get(k-2);
			ArrayList<Integer> curr = new ArrayList<Integer>(); 
			curr.add(1);
			for(int i=0;i<prev.size()-1;i++){
				curr.add(prev.get(i)+prev.get(i+1));
			}
			curr.add(1);
			result.add(curr);
			k++;
		}
		return result;
	}
}
















