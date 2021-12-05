package com.bl.collectionframework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {  
	public static void main(String[] args) {
		doListDemo();
	}

	private static void doListDemo() {  
		System.out.println("In DoListDemo : ");
		// creating List
		List<String> list = new LinkedList<>();
		// Adding object to the list
		list.add("Anokhi");
		list.add("Navya");
		list.add("Shree");
		list.add("Sha");

		// traversing list through Iterator
		Iterator itr = list.iterator();
		while (itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
