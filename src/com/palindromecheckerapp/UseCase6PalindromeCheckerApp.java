package com.palindromecheckerapp;
/*
* Use Case 6: Queue + Stack fairness check
* Description:
* This class demonstrates palindrome validation using two different data structures:
* - Queue(FIFO - First In First Out)
* - Stack(LIFO - Last In First Out)
* 
* Characters are entered into both the data structures and then removed by compared by removing from the fromt of the queue and top of the stack
* If all the characters match, the input string is confined of palindrome
* 
* This use case helps understand how FIFO and LIFO behaviors can be combined for symmetric comparision
* @author - Developer
* @version - 6.0
*/
import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
public class UseCase6PalindromeCheckerApp {
// Entry point fot UC6
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String text = in.nextLine();
		System.out.println("Input : " + text);
		Stack<Character> stack = new Stack<>();
		Queue<Character> queue = new LinkedList<Character>();
		
		for(Character c : text.toCharArray()) {
			stack.push(c);
			queue.offer(c);
		}
		
		boolean isPalindrome = true;
		while(!stack.isEmpty()) {
			if(!stack.pop().equals(queue.poll())) {
				isPalindrome = false;
				break;
			}
		}
		
		System.out.println(isPalindrome ? "Is Palindrome? : true" : "Is Palindrome? : false");
		in.close();
	}
}
