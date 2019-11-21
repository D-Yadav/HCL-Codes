package Hashmap;

import java.util.Comparator;

public class NameComparator implements Comparator {

	@Override
	public int compare(Employ e1, Employ e2) {
		if(e1.name>=e2.name){
			return 1;
		}else{
			return -1;
		}
		
	}

}
