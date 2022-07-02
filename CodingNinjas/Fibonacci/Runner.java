import java.util.Scanner;

public class Runner{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the term for which you'd like to see the fibonacci");
		int n = sc.nextInt();

		System.out.println("The " + n + "th term in fibonacci series is: ");
		System.out.println(Solution.fibonacci(n));
	}
}
