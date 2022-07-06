public class Solution {

	private static int helperLastIndex(int input[], int x, int ei){
		
		// here we will be using the ending index
		// if the ending index is less than 0 then not found
		if (ei < 0)
			return - 1;

		// if found at the ending index, return (the last occurence of x)
		if(input[ei] == x)
			return ei;
	
		// updating the ending index of array 
		return helperLastIndex(input, x, ei - 1);
	}

	public static int lastIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/

		return helperLastIndex(input, x, input.length - 1);
	}
	
}
