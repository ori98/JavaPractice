public class Solution {

	public static int count(int n){
		//Write your code here

		//base case: return 1 if it is a single digit number
		if(n/10 == 0){
			return 1;
		}

		int digits = 1 +  count(n/10);

		return digits;
	}
}

