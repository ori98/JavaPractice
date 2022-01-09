import java.util.*;
import java.util.function.*;

public class Exercise1 {
	
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carrol", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 38)
        );
		
		System.out.println("Unsorted");
		performConditionally(people, person -> true, person -> System.out.println(person));
		
		// Q1: sort list by last name
		
		Collections.sort(people, (p1, p2)-> p1.getLastName().compareTo(p2.getLastName()));
		System.out.println("Sort by last name:");
		performConditionally(people, person -> true, person -> System.out.println(person));
		// Q2: Create a method that prints all elements in the list
		
		System.out.println("Print all elements:");
		people.forEach(person->System.out.println(person));
		
		// Q3: Create a method that prints all the people that have last name starting with C
		System.out.println("Last Name Starts with C");
		// one way to do this is:
		// people.forEach(person->{if(person.getLastName().charAt(0) == 'C') System.out.println(person);});;
		
		// more flexible way is
		// defining a method with a behavior using condition interface
		performConditionally(people, p -> p.getLastName().startsWith("C"), p -> System.out.println(p));
	}
	
	// defining method for Q3
	static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		people.forEach(person->{if(predicate.test(person)) consumer.accept(person);});
	}
}

