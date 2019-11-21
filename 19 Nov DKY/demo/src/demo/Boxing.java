package demo;

public class Boxing {
 
	public void show() {
	int x=12;
	double y=12.5;
	String name="hcl";
	 
	Object obj1=x;
	Object obj2=y;
	Object obj3=name;
	 
	int x1=(Integer)obj1;
	double y1=(Double)obj2;
	String s1=(String)obj3;
	System.out.println(x1);
	System.out.println(y1);
	System.out.println(s1);
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 new Boxing().show();
	}

}
