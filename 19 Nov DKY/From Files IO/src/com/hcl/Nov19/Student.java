package com.hcl.Nov19;

import java.io.Serializable;


public class Student implements Serializable{
	int sno;
	String firstname;
	String lastname;
	double cgp;
	public Student(int sno, String firstname, String lastname, double cgp) {
		super();
		this.sno = sno;
		this.firstname = firstname;
		this.lastname = lastname;
		this.cgp = cgp;
	}
	public String toString() {
		return "Student [sno=" + sno + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", cgp=" + cgp + "]";
	}
	
}