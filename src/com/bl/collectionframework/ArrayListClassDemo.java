package com.bl.collectionframework;

import java.util.ArrayList;

public class ArrayListClassDemo {   
	public static void main(String[] args) {
		
		int n = 5;
		ArrayList <Integer> al = new ArrayList<>(n);
		for(int i = 1; i<= n; i++) {  
			al.add(i);
			System.out.println(al);
			
		}
	}

}
