package Hashmap;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {
public static void main(String[] args) {
	SortedSet<Employ> employs=new TreeSet<Employ>();
	employs.add(new Employ(1,"Deepak", "Techno", "Manager",784812.152));
	employs.add(new Employ(2,"Aashish", "Infra", "Engineer",784812.152));
	employs.add(new Employ(3,"Aman", "BSERV", "Caller",784812.152));
	employs.add(new Employ(4,"Priya", "BPO", "Reader",784812.152));
	employs.add(new Employ(5,"Srinivas", "Mgmt", "Buyer",784812.152));
	for (Employ employ : employs) {
		System.out.println(employ);
	}
}
}
