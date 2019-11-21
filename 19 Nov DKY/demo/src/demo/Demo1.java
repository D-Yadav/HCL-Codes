package demo;

public class Demo1 {
	public void show(int x) {
		System.out.println("show integer" +x);
	}
	public void show(double x) {
		System.out.println("show double" +x);
	}
	public void show(String x) {
		System.out.println("show String" +x);
	}
	public void show(boolean x) {
		System.out.println("show boolean" +x);
	}

	public static void main(String[] args) {
		Demo1 obj=new Demo1();
		obj.show(12);
		obj.show(12.567);
		obj.show("hcl");
        obj.show(true);
	}

}
