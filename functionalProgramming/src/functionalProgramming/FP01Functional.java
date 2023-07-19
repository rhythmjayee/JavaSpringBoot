package functionalProgramming;

import java.util.*;

public class FP01Functional {

	public static void main(String[] args) {
//		printAllNumbers(List.of(1,2,3,4,5,6));
//		System.out.println("--------------");
//		printEvenNumbers(List.of(1,2,3,4,5,6));
		printEvenSquaresOfNumbers(List.of(1,2,3,4,5,6));
	}
	private static void printEvenSquaresOfNumbers(List<Integer> nums) {
		nums.stream()
		.filter((x) -> x % 2 == 0)
		.map((x) -> x*x)
		.forEach(System.out::println);
	}
	private static boolean isEven(int x) {
		return x % 2 == 0;
	}
	private static void printEvenNumbers(List<Integer> nums) {
		nums.stream()
		.filter(FP01Functional::isEven)
		.forEach(System.out::println);
		//or
		System.out.println("======== "); 
		//Lambda expression  -> (x) -> x % 2 == 0
		nums.stream()
		.filter((x) -> x % 2 == 0)
		.forEach(System.out::println);
	}
	private static void print(int x) {
		System.out.println(x);
	}
	private static void printAllNumbers(List<Integer> nums) {
		//what to do
		nums.stream()
			.forEach(FP01Functional::print);
		/*
		 * Convert number to stream
		 * foreach number 
		 * we need to print the number
		 * we cant add print() -> it will invoked immediately
		 * so we use method reference -> FP01Structured::print
		 * */
		System.out.println("======== ");
		nums.stream()
		.forEach(System.out::println);
	}

}
