package com.palindromecheckerapp;

import java.util.Scanner;

//Use Case 11: Object-Oriented Palindrome Service
//
//Description:
//This class demonstrates palindrome validation using
//object-oriented design.
//
//The palindrome logic is encapsulated inside a
//PalindromeService class.
//
//This improves:
//- Reusability
//- Readability
//- Separation of concerns
//
//@author Developer
//@version 11.0
public class UseCase11PalindromeCheckerApp {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String text = in.nextLine();
		PalindromeService ps = new PalindromeService();
		System.out.println(ps.checkPalindrome(text) ? "Is Palindrome? : true" : "Is Palindrome? : false");
		in.close();
	}
}
// Service class for palindrome checking logic
class PalindromeService{
	// service method
	public boolean checkPalindrome(String text) {
		text = text.replaceAll("\\s", "");
		int start = 0;
		int end = text.length() - 1;
		boolean isPalindrome = true;
		while(start < end) {
			if(!String.valueOf(text.charAt(start)).equalsIgnoreCase(String.valueOf(text.charAt(end)))) {
				isPalindrome = false;
				break;
			}
			start++;
			end--;
		}
		return isPalindrome;
	}
}
