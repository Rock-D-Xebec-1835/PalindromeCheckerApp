package com.palindromecheckerapp;

import java.util.LinkedList;
import java.util.Scanner;

/*
 * Use Case 8 : Linked List based Palindrome Checker
 * Description:
 * This class checks whether a string is a palindrome using a Linkedlist.
 * 
 * Characters are added to the list and then compared by removing elements from both ends
 * - removeFirst()
 * - removeLast()
 * 
 * This demonstrates how linkedlist supports double-ended opeations for symmetric validation.
 * @author: Developer
 * @version: 8.0
 */
public class UseCase8PalindromeCheckerApp {
// Entry point for UC8
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String text = in.nextLine();
		System.out.println("Input: " + text);
		LinkedList<Character> list = new LinkedList<Character>();
		for(Character c : text.toCharArray()) {
			list.add(c);
		}
		boolean isPalindrome = true;
		while(list.size() > 1) {
			if(!list.pollFirst().equals(list.pollLast())) {
				isPalindrome = false;
				break;
			}
		}
		
		System.out.println(isPalindrome ? "Is Palindrome? : true" : "Is Palindrome? : false");
		in.close();
	}
}
