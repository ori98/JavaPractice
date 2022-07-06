public class Solution {

	private static int helperFirstIndex(int input[], int x, int si){

		// will be reducing the starting index of the array
		
		// if the array ends, then it means not found hence ret -1 
		if(si > input.length - 1)
			return -1;

		// if the element is found at the starting index
		if(input[si] == x)
			return si; 

		// updating the recursive call 
		return helperFirstIndex(input, x, si + 1);
 	}

	public static int firstIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		

		// creating a helper function
		return helperFirstIndex(input, x, 0);
	}
	
}
