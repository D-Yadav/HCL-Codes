package com.hcl.day3;

public class PosNeg {
	public void check(int n) {
		if(n>=0){
			System.out.println("positive");
		}else {
			System.out.println("negative");
		}
		
	}

	public static void main(String[] args) {
	int n=5;
	PosNeg pn=new PosNeg();
	pn.check(n);

	}

}
