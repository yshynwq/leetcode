package plusOne;

/*
 * Given a number represented as an array of digits, plus one to the number
 * 
 */
public class PlusOne {
	public static void main(String[] args) {
		//int[] tmp = {1,2,3,4,5,6,7,8,9};
		int[] tmp = {9,9,9,9};

		Solution s = new Solution();
		for (int i : s.plusOne(tmp)) {
			System.out.print(i+",");
		}
	}
}

class Solution {
	public int[] plusOne(int[] digits) {
		if (digits == null)
			return null;
		int carryon=1;
		for(int i=digits.length-1; i>=0; i--){
			if(carryon==0){
				break;
			}else{
				int tmp= digits[i]+carryon;
				carryon = tmp/10;
				digits[i]=tmp-carryon*10;
			}
		}
		if(carryon>0){
			int[] new_digits =new int[digits.length+1];
			new_digits[0]=carryon;
			for(int i =1; i<new_digits.length;i++){
				new_digits[i] = digits[i-1];
			}
			return new_digits;
		}else{
			return digits;
		}
	}
}