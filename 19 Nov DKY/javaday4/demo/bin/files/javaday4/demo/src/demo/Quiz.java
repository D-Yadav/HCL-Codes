package demo;

public class Quiz {

	public static void main(String[] args) {
Employ e1=new Employ();
Employ e2=new Employ();
	System.out.println(e1==e2);
	e1.empno=1;
	e1.name="sneha";
	e1.basic=55334;
	e2.empno=2;
	e2.name="pooja";
	e2.basic=55334;
	System.out.println(e1.equals(e2));
	}

}
