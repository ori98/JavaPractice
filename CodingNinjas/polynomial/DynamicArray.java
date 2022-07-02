import java.util.Scanner;

public class DynamicArray{

	static int[] arr = new int[5];
	static int nextIndex = 0;

	static void reconstruct(){

		int[] temp = arr;
		arr = new int[arr.length + 5];

		// copying down all the numbers from temp to their resp indices
		for(int i = 0; i < temp.length; i++){

			arr[i] = temp[i];
		}
	}

	static void add(int num){

		if(nextIndex >= arr.length){

		reconstruct();
		}
		
		arr[nextIndex] = num;
		nextIndex++;
	}

	public static void main(String args[]){

		System.out.println("This program is made to add numbers to an infinite array");
		System.out.println("Insert a number between 1-9");
		Scanner sc = new Scanner(System.in);
		int inp = Integer.parseInt(sc.nextLine());
		
		int num = - 1;
		while(num != 0){

			System.out.println("Insert a number to be added (0 for exit)");
		num = Integer.parseInt(sc.nextLine());
		add(num);
		}

		System.out.println("Printing the values:");
		for(int i : arr)
			System.out.println(i);
		System.out.println("End of program");
	}
}
