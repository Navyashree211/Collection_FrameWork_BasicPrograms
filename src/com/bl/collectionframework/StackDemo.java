package com.bl.collectionframework;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {  
	public static void main(String[] args) {
		 doStackDemo();
		 
	}

	private static void doStackDemo() {
		System.out.println("\n In doStackDemo");
		Stack<String> stack = new Stack<>();
		stack.push("Ayush");
		stack.push("Adiya");
		stack.push("navya");
		String pop = stack.pop();
		Iterator<String> itr = stack.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
