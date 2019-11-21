package com.hcl.collections;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
public static void main(String[] args) {
	Set s= new HashSet();
	s.add("Manoj");
	s.add("Samrat");
	s.add("Star");
	s.add("Mukesh");
	for (Object object : s) {
		System.out.println(object);
	}
}
}
