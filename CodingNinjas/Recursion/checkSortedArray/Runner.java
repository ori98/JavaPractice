// creating a program to check if the array is sorted (recursively)
import java.util.Scanner;

public class Runner{

	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array");

		int size = sc.nextInt();

		System.out.println("Enter " + size + " elements ");

		// creating an array
		int[] arr = new int[size];

		// inserting the values into the array
		for(int i = 0; i < size; i++){
			arr[i] = sc.nextInt();
		}

		// using the function to check if array is sorted or not
		if(Solution.checkSortedArray(arr))
			System.out.println("Array entered is sorted");

		else
			System.out.println("Array is not sorted");

	}
}
