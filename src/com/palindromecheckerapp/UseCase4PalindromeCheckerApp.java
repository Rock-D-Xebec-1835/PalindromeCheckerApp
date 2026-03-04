package com.palindromecheckerapp;

import java.util.Scanner;

/*
 * Use Case 4: Character Array based Validation
 * Description:
 * This class validates a palindrome by converting the string into a charcater array and comparing characters by using the two-pointer technique
 * At this stage, the application:
 * - Converts string to char array
 * - Uses start and end pointers
 * - Compares characters efficiently
 * - Displays the result
 * 
 * This reduces extra memory usage
 * @author Developer
 * @version 4.0
*/
public class UseCase4PalindromeCheckerApp {
	// Application entry point for UC4
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		System.out.println("Input : " + text);
		char[] chars = text.toCharArray();
		int start = 0;
		int end = text.length() - 1;
		boolean isPalindrome = true;
		while(start < end) {
			if(chars[start] != chars[end]) {
				isPalindrome = false;;
				break;
			}
			start++;
			end--;
		}
		System.out.println(isPalindrome ? "Is Palindrome ? : true" : "Is Palindrome ? : false");
		scanner.close();
	}
}
