package com.bl.collectionframework;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {

		doMapDemo();
	}

	private static void doMapDemo() {
	   Map<Integer,String> map = new HashMap<>();
	   map.put(100,"Anokhi");
	   map.put(101,"Navya");
	   map.put(102,"Kiya");
	   map.put(103,"Risha");
	   
	   //Elements can traverse in any order 
	   for(Map.Entry m:map.entrySet())  {
		   System.out.println(m.getKey()+ " " + m.getValue());
	   }
		
	}
}
