public class Solution {

	public static int sum(int input[]) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		
		// if only one element is left then return that element
		if(input.length == 1)
			return input[0];

		// creating a smaller array
		int[] smallArray = new int[input.length - 1];

		// copying the elements into smaller array
		for(int i = 1; i < input.length; i++){

			smallArray[i - 1] = input[i];
		}

		// for others return the sum of n-1 and nth element
			return input[0] + sum(smallArray);
	}
}
