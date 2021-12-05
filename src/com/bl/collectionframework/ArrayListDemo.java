package com.bl.collectionframework;

import java.util.*;

public class ArrayListDemo {  
	public static void main(String[] args) {
		Student s = new Student(6,"Anokhi");
		Student s1 = new Student(13,"Shree");
		
		ArrayList<Student> al = new ArrayList<>();
		
		al.add(s);
		                //System.out.println(al); // it return has value 
		al.add(s1);
		
		for (Student stu : al)  {
			System.out.println(stu.name + " " +stu.rollNo);
		}
	}

}
