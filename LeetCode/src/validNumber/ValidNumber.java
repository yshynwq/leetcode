package validNumber;

/*
 * Validate if a given string is numeric.

 Some examples:
 "0" => true
 " 0.1 " => true
 "abc" => false
 "1 a" => false
 "2e10" => true
 */

public class ValidNumber {
	public static void main(String[] args) {
		Solution s = new Solution();
		String str = "2e10";
		System.out.println(s.isNumber(str));
	}
}

class Solution {
	public boolean isNumber(String s) {
		if (s.trim().isEmpty()) {
			return false;
		}
		String regex = "[-+]?(\\d+\\.?|\\.\\d+)\\d*(e[-+]?\\d+)?";
		if (s.trim().matches(regex)) {
			return true;
		} else {
			return false;
		}
	}
}
