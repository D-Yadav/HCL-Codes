package com.hcl.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortDemo {
public static void main(String[] args) {
	SortedSet s=new TreeSet();
	s.add("Teja");
	s.add("Mannu");
	s.add("lanki");
	for (Object object : s) {
		Employ e=(Employ)object;
		System.out.println(object);
		//System.out.println(object);
	}
}
}
