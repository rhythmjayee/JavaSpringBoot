package functionalProgramming;

import java.util.*;

public class FP01Structured {

	public static void main(String[] args) {
		printAllNumbers(List.of(10,2,3,4,5,6));
		System.out.println("--------------");
		printEvenNumbers(List.of(1,2,3,4,5,6));

	}
	private static void printEvenNumbers(List<Integer> nums) {
		
		for(int x : nums) {
			if(x % 2 == 0)
				System.out.println(x);
		}
	}
	private static void printAllNumbers(List<Integer> nums) {
		//how to  loop over numbers
		for(int x : nums) {
			System.out.println(x);
		}
	}

}
