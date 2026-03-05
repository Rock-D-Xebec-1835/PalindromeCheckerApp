package com.palindromecheckerapp;

import java.util.Scanner;

//Use Case 10: Normalized Palindrome Validation
//
//Description:
//This class validates a palindrome after preprocessing
//the input string.
//
//Normalization includes:
//- Removing spaces and symbols
//- Converting to lowercase
//
//This ensures the palindrome check is logical rather
//than character-format dependent.
//
//Example:
//"A man a plan a canal Panama"
//
//@author Developer
//@version 10.0
public class UseCase10PalindromeCheckerApp {
// Entry point for UC-10
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String text = in.nextLine();
		System.out.println("Input: " + text);
		text = text.replaceAll("\\s", "");
		int start = 0;
		int end = text.length() - 1;
		boolean isPalindrome = true;
		while(start <= end) {
			if(!String.valueOf(text.charAt(start)).equalsIgnoreCase(String.valueOf(text.charAt(end)))) {
				isPalindrome = false;
				break;
			}
			start++;
			end--;
		}
		System.out.println(isPalindrome ? "Is Palindrome? : true" : "Is Palindrome? : false");
		in.close();
	}
}
