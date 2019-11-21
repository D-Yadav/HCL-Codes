package demo;

public class Boxtest {
public void show(Object ob) {
String type=ob.getClass().getSimpleName();
System.out.println(type);
if (type.equals("Integer")) {
	System.out.println("Integer cast");
}
if (type.equals("Double")) {
	System.out.println("Double cast");
}
if (type.equals("String")) {
	System.out.println("String cast");
}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=12;
double b=12.5;
String name="hcl";
 Boxtest obj=new Boxtest();
 obj.show(a);
 obj.show(b);
 obj.show(name);
	}

}
