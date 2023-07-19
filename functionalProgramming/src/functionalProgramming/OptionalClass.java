package functionalProgramming;

import java.util.*;

public class OptionalClass {

	public static void main(String[] args) {
		List<String> strs = List.of("aaple", "baat");
		
		Optional<String> optional = strs.stream()
									.filter(x -> x.startsWith("b")).findFirst();
		
		System.out.println(optional);
		System.out.println(optional.isEmpty());
		System.out.println(optional.isPresent());
		System.out.println(optional.get());
	}

}
