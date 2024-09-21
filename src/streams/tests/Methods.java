package streams.tests;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Methods {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ana", "Maria", "João");
		List<Integer> nameLengths = names.stream()
		                                 .map(String::length)
		                                 .collect(Collectors.toList());
		System.out.println(nameLengths); // [3, 5, 4]
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		List<Integer> evenNumbers = numbers.stream()
		                                   .filter(n -> n % 2 == 0)
		                                   .collect(Collectors.toList());
		System.out.println(evenNumbers); // [2, 4, 6]

		List<String> items = Arrays.asList("apple", "banana", "cherry");
		items.stream().forEach(System.out::println);
		
		
		numbers = Arrays.asList(1, 2, 3, 4, 5);
		int sum = numbers.stream()
		                 .reduce(0, Integer::sum);
		System.out.println(sum); // 15

		numbers = Arrays.asList(1, 2, 3, 3, 4, 5, 5);
		Set<Integer> distinctNumbers = numbers.stream()
		                                       .distinct()
		                                       .collect(Collectors.toSet());

		System.out.println(distinctNumbers); // [1, 2, 3, 4, 5]


		numbers = Arrays.asList(1, 2, 3, 3, 4, 5, 5);
		
		
		List<Integer> teste = numbers.stream().filter(item -> item %2 ==0).collect(Collectors.toList());
		System.out.println(teste);
		
		List<Boolean> teste2= numbers.stream().map(item -> item % 2==0).collect(Collectors.toList());
		System.out.println(teste2);
	}
}
