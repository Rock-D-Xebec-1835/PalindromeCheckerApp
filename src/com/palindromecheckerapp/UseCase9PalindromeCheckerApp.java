package com.palindromecheckerapp;

import java.util.Scanner;

/*
Use Case 9: Recursive Palindrome Checker

Description:
This class validates a palindrome using recursion.

Characters are compared from the outer positions
moving inward using recursive calls.

The recursion stops when:
- All characters are matched, or
- A mismatch is found.

This use case demonstrates divide-and-conquer
logic using method recursion.

@author Developer
@version 9.0 
 */
public class UseCase9PalindromeCheckerApp {
	public static boolean isPalindrome(String text, int start, int end) {
		if(start >= end) return true;
		if(text.charAt(start) != text.charAt(end)) return false;
		
		return isPalindrome(text, start + 1, end - 1);
	}
	// Entry point for UC9
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String text = in.nextLine();
		System.out.println("Input: " + text);
		System.out.println(isPalindrome(text, 0, text.length() - 1) ? "Is Palindrome? : true" : "Is Palindrome? : false");
		in.close();
	}
}
