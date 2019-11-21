package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrStudent {
	public static void main(String[] args) {
		List stud=new ArrayList();
		stud.add(new Student(1,"Deepak","Yadav",8.99));
		stud.add(new Student (2,"Malaika","Khanna", 9.956));
		stud.add(new Student(3,"Parameshwari","Kumari",4.965));
		for (Object ob: stud) {
			Student s=(Student)ob;
			System.out.println(s);
		} 
	}

}
