package evaluateReversePolishNotation;

import java.util.Stack;

/*
 * 
 * 
 ome examples:
 ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
 ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
 * 
 * 
 */

public class EvaluateReversePolishNotation {
	public static void main(String[] args) {
		Solution s = new Solution();
		String[] tokens = {"0", "3", "/"};
		System.out.println(s.evalRPN(tokens));
	}
}

class Solution {
	public int evalRPN(String[] tokens) {
		Stack<Integer> numbers = new Stack<Integer>();
		for (String s : tokens) {
			if (s == "+") {
				int n2 = numbers.pop();
				int n1 = numbers.pop();
				numbers.push(n1 + n2);
			} else if (s == "-") {
				int n2 = numbers.pop();
				int n1 = numbers.pop();
				numbers.push(n1 - n2);
			} else if (s == "*") {
				int n2 = numbers.pop();
				int n1 = numbers.pop();
				numbers.push(n1 * n2);
			} else if (s == "/") {
				int n2 = numbers.pop();
				int n1 = numbers.pop();
				numbers.push(n1 / n2);
			} else {
				numbers.push(Integer.parseInt(s));
			}
		}
		return numbers.pop();
	}
}
