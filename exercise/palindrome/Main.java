import java.util.Scanner;
public class Main{


	static boolean checkPalindrome(int n){

		int num = n;
		// reversing the number
		int rev = 0;

		while(num > 0){

			rev += num % 10;
			num /= 10; rev *= 10;
		
		}

		rev /= 10;

		return n == rev;

	}

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check:");
		int inp = Integer.parseInt(sc.nextLine());

		if(checkPalindrome(inp))
			System.out.println("Is palindrome");

		else
			System.out.println("Is not palindrome");
	}
}
