package com.hcl.generics;
class Data<T>{
	//class Data<T>{
	public void swap(T a,T b){
		T t;
		t=a;
		a=b;
		b=t;
		System.out.println("A value "+a+ "B value "+b);
	}
}
public class GenDemo {
public static void main(String[] args) {
	Data obj1=new Data();
	int a=5,b=7;
	obj1.swap(a ,b);
	double a1=12.5,b1=15.58;
	obj1.swap(a1,b1);
	String s1="Deepak", s2="Yadav";
	obj1.swap(s1, s2);
}
}
