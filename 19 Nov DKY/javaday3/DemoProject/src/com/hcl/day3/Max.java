package com.hcl.day3;

public class Max {
	public void check(int a,int b,int c) {
		if(a>=b && a>=c)
		{
			System.out.println("max num is " +a);
		}
		else if (b>=a && b>=c) {
			
		
			System.out.println("max num is " +b);
		}
		else
		{
			System.out.println("max num is " +c);
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		a=5;
		b=7;
		c=9;
		Max m=new Max();
		m.check(a, b, c);

	}

}
