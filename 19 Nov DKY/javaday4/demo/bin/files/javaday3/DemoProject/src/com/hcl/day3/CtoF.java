package com.hcl.day3;

public class CtoF {
	public void calc(double c) {
		double f=((9*c)/5)+32;
		System.out.println("fahrenheit " +f);
		
	}
 public static void main(String[] args) {
	double c=37;
	CtoF cf=new CtoF();
	cf.calc(c);
}
}
