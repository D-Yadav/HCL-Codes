package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;
public class ArrayListDemo {
public static void main(String[] args) {
	List names=new ArrayList();
	names.add("Deepak");
	names.add("Samita");
	names.add("Priya");
	names.add("Deepika");
	System.out.println(names);
for (Object ob : names) {
	System.out.println(ob);
}
names.add(2, "Priyanka");
System.out.println("Names after adding..");
for (Object object : names) {
	System.out.println(object);
	
}
names.add(3, "Janak");
System.out.println("Names after adding again...");
for (Object object : names) {
	System.out.println(object); 
	
}
names.remove(0);
System.out.println("After removing...");
for (Object object : names) {
	System.out.println(object);
	
}
		
	}
	}

