import java.util.List;
import java.util.ArrayList;

public class Solution {

	private static List<Integer> helperAllIndices(int input[], int x, int si, List<Integer> indices){

		// if the si is equal to or exceeds array length then stop
		if(si >= input.length){
			return indices;
		}

		// if the element is found then add to the array
		if(input[si] == x)
			indices.add(si);
		
		// updating the recursive call 
		return helperAllIndices(input, x, si + 1, indices);
	}

	public static int[] allIndexes(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/

		// using an array list to store all the indices
		List<Integer> indices = new ArrayList<>();

		// using helper function to add the si argument
		List<Integer> indicesList = helperAllIndices(input, x, 0, indices);
		
		// converting Integers to int[]
		int[] indicesArray = new int[indicesList.size()];

		for(int i = 0; i < indicesArray.length; i++){
			indicesArray[i] = indices.get(i);
		}

		// returning the array
		return indicesArray;
	}
	
}
