package com.hcl.sup;
enum Test {
	Y,P,C,N;
	private Test(){
		System.out.println("hi");
	}
}
public class P13 {
public static void main(String[] args) {
	Test t=Test.P;
	System.out.println(t);
}
}
