package com.lotus.jbc.basicjava;

public class OddEvenComparator {
	
	/**
	 * This method should compare the number of odd and even integers from a given array, and return
	 * a corresponding String value. 
	 * @param ints
	 * 			the given integer array. 
	 * @return String value of:
	 * 			"There are equal odd and even integers in the array." - if the number of odd and even integers 
	 * 																	are equal.
	 * 			"There are more odd integers." - if the number of odd integers is more than 
	 * 											the number of even integers.
	 * 			"There are more even integers." - if the number of even integers is more than 
	 * 											 the number of odd integers.
	 */
	public String determineMajority(int[] ints){
	
			public String determineMajority(int[] ints){
		
		int even_counter = 0;
		int odd_counter = 0;
		
		for(int index = 0; ints.length; index++){
			if(ints[index] % 2 == 0){
				even_counter++;
			}else{
				odd_counter++;
			}
		}
		
		if(even_counter>odd_counter){
			System.out.println("Even");
		}else{
			System.out.println("Odd");
		}
		
	}
	}
}
