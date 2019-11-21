package com.hcl.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {
public static void main(String[] args) {
	SortedSet s=new TreeSet();
	s.add(new Employ(1,"Naina",894));
	s.add(new Employ(2,"Laxmi",94551));
	s.add(new Employ(3,"Mahalaxmi",854921));
	s.add(new Employ(4,"Deepak", 654856));
	for (Object object : s) {
		Employ e=(Employ)object;
		System.out.println(object);
	}
}
}
