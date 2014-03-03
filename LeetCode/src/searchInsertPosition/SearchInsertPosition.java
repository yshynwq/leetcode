package searchInsertPosition;

public class SearchInsertPosition {
	public static void main(String[] args) {
		int[] A = {1,3,5,6};
		Solution s = new Solution();
		System.out.println(s.searchInsert(A, 7));
	}
}

class Solution {
	public int searchInsert(int[] A, int target) {
		if (A == null || A.length == 0)
			return 0;
		int start=0;
		int end = A.length-1;
		int mid;
		while(true){
			mid = (start+end)/2;
			if(A[mid]==target)
				return mid;
			else if(target>A[mid]){
				if(mid+1>A.length-1) return A.length;
				if(target<A[mid+1]){
					return mid+1;
				}
				start = mid+1;
			}else{
				if(mid-1<0) return 0;
				if(target>A[mid-1]){
					return mid;
				}
				end = mid-1;
			}
		}
	}
}