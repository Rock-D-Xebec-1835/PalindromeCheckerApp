package com.palindromecheckerapp;
//Use Case 12: Strategy Pattern for Palindrome Algorithms
//
//Description:
//This class demonstrates how different palindrome
//validation algorithms can be selected dynamically
//at runtime using the Strategy Design Pattern.
//
//At this stage, the application:
//- Defines a common PalindromeStrategy interface
//- Implements a concrete Stack based strategy
//- Injects the strategy at runtime
//- Executes the selected algorithm
//
//No performance comparison is done in this use case.
//The focus is purely on algorithm interchangeability.
//
//The goal is to teach extensible algorithm design.
//
//@author Developer
//@version 12.0
import java.util.Stack;
import java.util.Deque;
import java.util.Scanner;
import java.util.ArrayDeque;
public class UseCase12PalindromeCheckerApp {
// Entry point for UC12
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String text = in.nextLine();
		text = text.replaceAll("\\s", "");
		System.out.println("Input: " + text);
		StrategyChooser strategy1 = new StrategyChooser(new StackStrategy());
		System.out.println(strategy1.checkPalindrome(text) ? "Is Palindrome? : true" : "Is Palindrome? : false");
		StrategyChooser strategy2 = new StrategyChooser(new DequeStrategy());
		System.out.println(strategy2.checkPalindrome(text) ? "Is Palindrome? : true" : "Is Palindrome? : false");
		in.close();
	}
}

interface PalindromeStrategy{
	boolean isPalindrome(String text);
}

class StackStrategy implements PalindromeStrategy{
	/*
	 * Implements palindrome validation using stack.
	*/
    public boolean isPalindrome(String text) {
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
			if(!String.valueOf(stack.pop()).equalsIgnoreCase(String.valueOf(text.charAt(i)))) {
				isPalindrome = false;
				break;
			}
			i++;
		}
		System.out.println("Palindrome is checked using Stack Strategy");
		return isPalindrome;
	}
}

class DequeStrategy implements PalindromeStrategy{
	// Implements palindrome validation using deque.
	public boolean isPalindrome(String text) {
		Deque<Character> deque = new ArrayDeque<Character>(text.length());
		for(Character c : text.toCharArray()) {
			deque.offerFirst(c);
		}
		
		boolean isPalindrome = true;
		while(deque.size() > 1) {
			if(!String.valueOf(deque.pollFirst()).equalsIgnoreCase(String.valueOf(deque.pollLast()))) {
				isPalindrome = false;
				break;
			}
		}
		System.out.println("Palindrome is checked using Deque Strategy");
		return isPalindrome;
	}
}

class StrategyChooser{
	private PalindromeStrategy strategy;
	public StrategyChooser(PalindromeStrategy strategy) {
		this.strategy = strategy;
	}
	
	public boolean checkPalindrome(String text) {
		return strategy.isPalindrome(text);
	}
}
