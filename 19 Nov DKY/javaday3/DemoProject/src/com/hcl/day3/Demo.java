package com.hcl.day3;

class Data{
	public void sayhello() {
		System.out.println("hi we are from hcl");
	}
	private void lunch() {
		System.out.println("no lunch today");
	}
	 void logoff() {
		 System.out.println("logout by 7.30");
	}
}
public class Demo {
    
	public static void main(String[] args) {
	Data obj=new Data();
	obj.sayhello();
	obj.logoff();
}
}
