package com.lotus.jbc.basicjava;

public class Palindrome {
	
	/**
	 * This method should determine if a given array of characters is a palindrome, and return 
	 * a corresponding boolean value.
	 * @param chars
	 * 			the given character array.
	 * @return boolean value:
	 * 		true - if the array is a palindrome.
	 * 		false - if the array is not a palindrome.
	 */
	public boolean determinePalindrome(char[] chars) {
		
		int i = 0, j = str.length() - 1;
                while (i < j) { 
                if (str.charAt(i) != str.charAt(j))
                     return false; 
                     i++; 
                     j--; 
                } 
                return true; 
    
		
	}
}
