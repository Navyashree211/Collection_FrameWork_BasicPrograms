package com.Comparator.Comparable;

import java.util.ArrayList; 
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Runner {
	public static void main(String[] args) {
		List<Laptop>  labs = new ArrayList<>();
		
		labs.add(new Laptop("Del", 16, 800));
		labs.add(new Laptop("Apple", 8, 1200 ));
		labs.add(new Laptop("Acer", 12, 700));
		
		Comparator<Laptop> com = new Comparator<Laptop>()
				{
			           public int compare(Laptop l1, Laptop l2) {
			        	   if(l1.getPrice() > l2.getPrice())
			        		   return 1;
			        	   else
			        		   return -1;
			           }
				};
		
		Collections.sort(labs, com);   // Collection.sort(labs);
		
		for (Laptop l : labs)
		{
			System.out.println(l);
		}
	}
}
