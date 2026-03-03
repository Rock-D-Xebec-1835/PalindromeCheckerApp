package com.palindromecheckerapp;
/*
 * Use Case 3: Reverse String based Palindrome Check
 * Description:
 * This class checks whether a string is a palindrome by reversing the string and comparing it with the original value
 * At this stage, the application:
 * - Iterates the string in reverse order
 * - Builds a reversed version
 * - Compares original and reversed strings
 * - Displays the validation result
 * 
 * This use case introduces transformation-based validation
 * @author Developer
 * @version 3.0
*/
public class UseCase3PalindromeCheckerApp {
	// Application entry point for UC-3
	
	public static void main(String[] args) {
		String text = "malayalam";
		String reversedText = "";
		for(int i = text.length() - 1; i >= 0; i--) {
			reversedText += text.charAt(i);
		}
		
		System.out.println("Original : " + text);
		System.out.println("Reversed : " + reversedText);
		
		System.out.println(reversedText.equals(text) ? "Is palindrome : true" : "Is palindrome : false");
	}
}
