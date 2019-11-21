package com.hcl.day3;

public class Perfect {
	public void show(int n) {
		int sum=0,temp=n;
		for (int i = 1; i<n; i++)
		{
			if (n%i==0)
			{
				sum=sum+i;
			}
		}
		System.out.println("sum " +sum);
			
			
		if (sum==temp) {
				System.out.println("perfect");
			}else
			{
				System.out.println("not perfect");
		}
		
	}
	public static void main(String[] args) {
		int n=10;
		new Perfect().show(n);
	}

}
