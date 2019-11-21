package com.hcl.collections;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortStudent {

	public static void main(String[] args) {
		Comparator c=new StudentComparator();
		SortedSet s=new TreeSet(c);
		//SortedSet s=new TreeSet();
		s.add(new Student(1,"Araya","Naina",8.9));
		s.add(new Student(2,"Meriua","Laxmi",9.4));
		s.add(new Student(3,"Anaka","Mahalaxmi",8.5));
		s.add(new Student(4,"Yadav","Deepak", 6.5));
		for (Object object : s) {
			Student e=(Student)object;
			System.out.println(e);
		}
	}

}
