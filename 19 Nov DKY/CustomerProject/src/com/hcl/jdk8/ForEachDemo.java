package com.hcl.jdk8;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo {
public static void main(String[] args) {
	List<String> names=new ArrayList<String>();
	names.add("Puja");
	names.add("Ram");
	names.add("Sam");
	names.add("Dari");
	for (String string : names) {
		System.out.println(string);
	}
}
}
