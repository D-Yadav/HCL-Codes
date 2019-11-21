package com.hcl.generics;

import java.util.ArrayList;
import java.util.List;

public class GenIntEx {
public static void main(String[] args) {
	List<Integer> num=new ArrayList<Integer>();
	num.add(new Integer(56));
	num.add(new Integer(15));
	num.add(new Integer(96));
	num.add(new Integer(85));
	int sum=0;
	for (Integer integer : num) {
		sum+=integer;
	}
	System.out.println(sum);
}
}
