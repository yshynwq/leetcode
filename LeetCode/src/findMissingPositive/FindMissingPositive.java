package findMissingPositive;

public class FindMissingPositive {
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.firstMissingPositive(new int[] {}));
	}
}

class Solution {
	public int firstMissingPositive(int[] A) {
		// IMPORTANT: Please reset any member data you declared, as
		// the same Solution instance will be reused for each test case.
		if (A.length == 0) {
			return 1;
		} else {
			int maxNum = getMax(A);
			if (maxNum > 0) {
				// create B array for keeping records
				int[] B = new int[maxNum + 2];
				for (int k = 0; k < maxNum + 1; k++) {
					B[k]=0;
				}
				// assign each positive number to the nth position
				for (int i = 0; i < A.length; i++) {
					if (A[i] > 0) {
						B[A[i]]++;// Nth position has 1 record
					}
				}

				for (int j = 1; j < B.length; j++) {
					if (B[j] == 0) {
						return j;
					}
				}

			} else {
				return 1;
			}

		}
		return 1;

	}

	int getMax(int[] A) {
		if (A.length > 0) {
			int max = 0;
			for (int i = 0; i < A.length; i++) {
				if (A[i] > max) {
					max = A[i];
				}
			}
			return max;
		}
		return -1;
	}

}