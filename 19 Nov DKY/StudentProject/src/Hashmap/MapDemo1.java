package Hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapDemo1 {
public static void main(String[] args) {
	Map names=new HashMap();
	names.put("1", "Harika");
	names.put("2", "Harish");
	names.put("3", "Himesh");
	names.put("4", "Hanuman");
	names.put("5", "Harbhajan");
	String key, value;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter key: ");
	key=sc.nextLine();
	value=(String)names.getOrDefault(key, "Not Found");
	System.out.println(value); 
 }
}