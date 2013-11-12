package countAndSay;


/**
 * The count-and-say sequence is the sequence of integers beginning as follows:
 * 1, 11, 21, 1211, 111221, 312211, 13112221, 1113213211, 31131211131221...
 * 
 * 1 is read off as "one 1" or 11. 11 is read off as "two 1s" or 21. 21 is read
 * off as "one 2, then one 1" or 1211. Given an integer n, generate the nth
 * sequence.
 * 
 * Note: The sequence of integers will be represented as a string.
 * 
 * Discuss
 * 
 * 
 * @author roy 1, 11, 21, 1211, 111221, 312211, 13112221, 1113213211,
 *         31131211131221...
 */
public class CountAndSay {
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.countAndSay(2));
	}
}

class Solution {
	public String countAndSay(int n) {
		// IMPORTANT: Please reset any member data you declared, as
		// the same Solution instance will be reused for each test case.
		String result ="1";
		for(int i=0; i<n-1;i++){
			result = say(result);
		}
		return result;
		
	}
		
	String say(String s) {
		StringBuilder result = new StringBuilder();
		int length = s.length();
		for (int i = 0; i < length; i++) {
			int count = 1;
			while (i + 1 < length && s.charAt(i) == s.charAt(i + 1)) {
				count++;
				i++;
			}
			result.append(count).append(s.charAt(i));
		}

		return result.toString();
	}
}
