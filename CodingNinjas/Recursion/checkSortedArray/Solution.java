public class Solution{

	public static boolean checkSortedArray(int[] arr){
		
		// storing the result in checkSorted boolean flag
		boolean checkSorted;

		// base case
		// if one or less elements are left then it's sorted
		if(arr.length <= 1)
			return true;
		
		// checking if the first two elements of the array are sorted
		if(arr[0] > arr[1])
			return false;

		// creating a smaller input array
		int[] smallerInputArray = new int[arr.length - 1];

		// copying the elements of the arr to smaller array
		for(int i = 1; i < arr.length; i++){
			smallerInputArray[i - 1] = arr[i];
		}

		// recursive call 
		checkSorted = checkSortedArray(smallerInputArray);

		return checkSorted;
	} 

}
