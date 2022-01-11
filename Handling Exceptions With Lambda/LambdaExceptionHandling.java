import java.util.function.BiConsumer;

public class LambdaExceptionHandling {
	public static void main(String[] args) {
		// program to divide two numbers
		int[] numbers = { 6, 2, 3, 4, 5, 1 };
		int key = 2;
		// exception can be handled inside lambda
		process(numbers, key, wrapperLambda((n, k) -> System.out.println(n / k)));
	}

	private static void process(int[] numbers, int key, BiConsumer<Integer, Integer> consumer) {
		// performing BiConsumer.accept() function to perform division
		for (Integer i : numbers) {
			consumer.accept(i, key);
		}

		// intentionally forcing an exception
		consumer.accept(5, 0);
	}

	// using wrapper lambda to handle exception(s)
	private static BiConsumer<Integer,Integer> wrapperLambda(BiConsumer<Integer,  Integer> consumer){
		return (n,k) -> {
			try {
				consumer.accept(n, k);
			}
			
			catch(ArithmeticException e) {
				System.out.println("Arithmetic Exception Handled");
			}
		};
	}
}
