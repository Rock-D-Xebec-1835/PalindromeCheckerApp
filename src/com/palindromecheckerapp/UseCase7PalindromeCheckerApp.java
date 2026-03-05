package com.palindromecheckerapp;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/*
* Use Case 7: Deque Based Optimized Palindrome Checker
* Description:
* This class validates a palindrome using a Deque(Double Ended Queue)
* Characters are inserted into the deque and then compared by removing elements from both ends:
* - removeFirst();
* - removeLast();
* 
* This avoids reversing the string and provides an efficient front-to-back comparision approach
* This use case demonstrates optimal bidirectional traversal using Deque.
* 
* @author - Developer
* @Version - 7.0
*/
public class UseCase7PalindromeCheckerApp {
// Entry point for UC7
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String text = in.nextLine();
		System.out.println("Input: " + text);
		Deque<Character> deque = new ArrayDeque<Character>(text.length());
		for(Character c : text.toCharArray()) {
			deque.offerFirst(c);
		}
		
		boolean isPalindrome = true;
		while(deque.size() > 1) {
			if(!deque.pollFirst().equals(deque.pollLast())) {
				isPalindrome = false;
				break;
			}
		}
		
		System.out.println(isPalindrome ? "Is Palindrome? : true" : "Is Palindrome? : false");
		in.close();
	}
}
