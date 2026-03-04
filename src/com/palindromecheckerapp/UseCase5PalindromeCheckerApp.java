package com.palindromecheckerapp;
import java.util.Scanner;
import java.util.Stack;
/*
 * Use Case 5: Stack based Palindrome Checker
 * Description:
 * This class validates a palindrome using a Stack data structure which follows the LIFO principle
 * At this stage, the application:
 * - Pushes characters into a stack
 * - Pops them in reverse order
 * - Compares with original sequence
 * - Displays the result
 * This maps stack behaviour to reversal logic
 * @author: Developer
 * @version: 5.0
*/
public class UseCase5PalindromeCheckerApp {
// Entry point for UC5
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		System.out.println("Input : " + text);
		boolean isPalindrome = true;
		Stack<Character> stack = new Stack<>();
		int i = 0;
		while(i < text.length() / 2) {
			stack.push(text.charAt(i));
			i++;
		}
		if(text.length() % 2 != 0) {
			i++;
		}
		while(i < text.length()) {
			if(stack.pop() != text.charAt(i)) {
				isPalindrome = false;
				break;
			}
			i++;
		}
		System.out.println(isPalindrome ? "Is Palindrome? : true" : "Is Palindrome? : false");
		scanner.close();
	}
}
