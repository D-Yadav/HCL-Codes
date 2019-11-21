package abst;
abstract class Emp{
	int empno;
	String name;
	double salary;
	public Emp(int empno, String name, double salary) {
		super();
		this.empno = empno;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", name=" + name + ", salary=" + salary
				+ "]";
	}}
	class Sowmya extends Emp{

		public Sowmya(int empno, String name, double salary) {
			super(empno, name, salary);
			// TODO Auto-generated constructor stub
		}
		
	}
	class Teju extends Emp{

		public Teju(int empno, String name, double salary) {
			super(empno, name, salary);
			// TODO Auto-generated constructor stub
		}
}
public class Abscon {

	public static void main(String[] args) {
		// T
		Emp[] arr={new Sowmya(1,"sowmya",456321),
				new Teju(1,"Teja Garu",789654)};
	for (Emp emp : arr) {
		System.out.println(emp);
	}	
	}
	}


