package com.hcl.day3;

public class Fact {
public void factorial() {
	int n=4;
	 int fact=1;
	int i=1;
	while(i<=n){
		fact=fact*i;
		i++;
	}
	System.out.println("factorial " +fact);	
}
	
	

public static void main(String[] args) {
	new Fact().factorial();
}
}
