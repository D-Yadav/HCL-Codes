package Hashmap;

import java.util.Comparator;

public class DeptCompare implements Comparator<Employ> {

	@Override
	public int compare(Employ e1, Employ e2) {
	if(e1.dept.compareTo(e2.dept)==0)	{
		return 1;
	}else{
		return -1;

}
}
}