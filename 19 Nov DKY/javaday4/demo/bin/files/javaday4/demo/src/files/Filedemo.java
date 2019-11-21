package files;

import java.io.File;

public class Filedemo {

	public static void main(String[] args) {
		File f=new File("C:/javaday4/demo/src/Divex/Custom.java");
System.out.println("File Name " +f.getName());
System.out.println("parent "+f.getParent());
System.out.println("path "+f.getPath());
	}

}
