import java.util.Arrays;
public class Solution {
	
	public static boolean checkNumber(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		
		// base case: if there are no elements in the array	
		if(input.length == 0)
			return false;

		// if element has been found at the 0th position
		if(input[0] == x){
			return true;
		}

		// reducing the size of the array
		int smallArray[] = Arrays.copyOfRange(input, 1, input.length);

		// passing the smallerArray after checking
		return checkNumber(smallArray, x);
	}
}
