package com.bl.collectionframework;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {   
	public static void main(String[] args) {
		doSetDemo();
	}

	private static void doSetDemo() {
		System.out.println("\n In doSetDemo");
		Set<String> set = new LinkedHashSet<>();
		
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");
		set.add("Ajay");
		for (String str : set) {
			System.out.println(str);
		}
		
		
	}

}
