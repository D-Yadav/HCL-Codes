package com.hcl.Nov19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FOoutput {
public static void main(String[] args) {
	try {
		FileInputStream src=new FileInputStream("C:/19 Nov DKY/From Files IO/src/com/hcl/Nov19/FileCopy.java");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		FileOutputStream tar=new FileOutputStream("c:files/cpy.txt");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
