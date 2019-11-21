package demo;

public class Boxemp {
 public void show(Object ob) {
	 String type=ob.getClass().getSimpleName();
	 if (type.equals("Employ")) {
		 Employ e=(Employ)ob;
		 System.out.println(e);
		
	}if (type.equals("Student")) {
		Student s1=(Student)ob;
		 System.out.println(s1);
		
	}
	
}
	public static void main(String[] args) {
	Employ employ=new Employ();
	employ.empno=1;
	employ.name="Sai";
	employ.basic=5184;
	new Boxemp().show(employ);
	
	Student s=new Student();
	s.sno=1;
	s.firstname="sneha";
	s.lastname="pappu";
	s.cgp=9.5;
	new Boxemp().show(s);


	}

}
