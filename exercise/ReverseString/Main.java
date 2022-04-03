import java.lang.StringBuilder;
import java.util.Scanner;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Insert the string:");
		
		String input = sc.nextLine();

		System.out.println("Reversed using API: " + reverseApi(input));
		System.out.println("Reversed manually: " + reverseManually(input));
		
	}

	static String reverseApi(String input){

		return new StringBuilder(input).reverse().toString();
	}

	static String reverseManually(String input){

		StringBuilder stringBuilder = new StringBuilder();

		for(int i = input.length() - 1; i >= 0; i--){

			stringBuilder.append(input.charAt(i));
		}

		return stringBuilder.toString();
	}
}
