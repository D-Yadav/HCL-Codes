package demoday5;

public class Emp {
int empno;
String name;
String job;
double salary;
int leaveavail;
public Emp(){
	super();
}


	public Emp(int empno, String name, String job, double salary,int leaveavail) {
	super();
	this.empno = empno;
	this.name = name;
	this.job = job;
	this.salary = salary;
}
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", name=" + name + ", job=" + job
				+ ", salary=" + salary + ", leaveavail=" + leaveavail + "]";
	}
public int show(Object ob){
	
	Emp e=(Emp)ob;
	if(e.job=="manager"){
		return e.leaveavail=30;
	}else{
	return e.leaveavail=20;
	}
}

public enum Leavetype{
	EL,PL,ML;
	
}
public enum Leavestatus{
	
}

	public static void main(String[] args) {
	
		Emp e1=new Emp(101, "sneha", "manager", 25000.00,0);
		Emp e2=new Emp(102, "poha", "developer", 50000.00,0);
		Emp e3=new Emp(103, "jeha", "tester", 80000.00,0);
		Emp e4=new Emp(104, "neha", "programer", 36000.00,0);
         Emp[]  arr = {e1,e2,e3,e4};
         for (Emp emp : arr) {
        		new Emp().show(emp);
        		
			System.out.println(emp);
		}
         
	}

}
