package com.hcl.day3;

public class Circle {
	
	public void cal(double radius) {
		double area,circ;
		area=Math.PI * Math.pow(radius, 2);
		circ=2*Math.PI*radius;
		System.out.println("area " +area);
		System.out.println("circumference " +circ);
		
	}

	public static void main(String[] args) {
     
           double radius;
           radius=Double.parseDouble(args[0]);
           Circle cir=new Circle();
           cir.cal(radius);
	}

}
