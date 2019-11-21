package demo;

public class Employy {
int empno;
String name;
double basic;

public Employy() {
	empno=5;
	name="sneha";
	basic=456987;
}
	public Employy(int empno, String name, double basic) {
	super();
	this.empno = empno;
	this.name = name;
	this.basic = basic;
}
	@Override
	public String toString() {
		return "Employy [empno=" + empno + ", name=" + name + ", basic="
				+ basic + "]";
	}



	public static void main(String[] args) {
		

	}

}
