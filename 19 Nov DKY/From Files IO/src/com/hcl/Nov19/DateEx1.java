package com.hcl.Nov19;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx1 {
public static void main(String[] args) {
	Date obj=new Date();
	System.out.println(obj);
	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/YYYY");
	System.out.println(sdf.format(obj));
}
}
