package com.palindromecheckerapp;
/*
 * Use Case 2: Hardcoded Palindrome Validation
 * Description:
 * This class demonstrates basic palindrome validation using a hardcoded string value
 * At this stage, the application:
 * - Stores a predefined string
 * - Compares characters from both ends
 * - Determines whether the string is a palindrome
 * - Displays the result on the console
 * 
 * This use case introduces fundamental comparison logic before using advanced data structures
 * @author Developer
 * @version 2.0
*/
public class UseCase2PalindromeCheckerApp {
	/*
	 * Application entry point for UC2 
	*/
	
	public static void main(String[] args) {
		String text = "malayalam";
		System.out.println(text);
		int start = 0;
		int end = text.length() - 1;
		boolean isPalindrome = true;
		while(start < end) {
			if(text.charAt(start) != text.charAt(end)) {
				isPalindrome = false;
				break;
			}
			start++;
			end--;
		}
		
		System.out.println(isPalindrome ? "Is it a palindrome? : true" : "Is it a palindrome? : false");
	}
}
