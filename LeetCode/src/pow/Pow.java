package pow;

public class Pow {
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.pow(0.00001, 2147483647));
	}
}

class Solution {
	public double power(double x, int n) {
		// IMPORTANT: Please reset any member data you declared, as
		// the same Solution instance will be reused for each test case.
		if (n == 0)
			return 1;
		double half = power(x, n / 2);
		if(n%2==0){
			return half*half;
		}else {
			return half*half*x;
		}
	}
	
	public double pow(double x, int n){
		if(n<0){
			return 1/power(x,-n);
		}else{
			return power(x,n);
		}
	}
}