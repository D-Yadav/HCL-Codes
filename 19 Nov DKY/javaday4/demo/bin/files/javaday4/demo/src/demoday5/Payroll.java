package demoday5;

public class Payroll {
static double totsalary;
public void addSalary(double salary){
totsalary+=salary;
}
	public static void main(String[] args) {
		Payroll sneha=new Payroll();
		Payroll sankar=new Payroll();
		Payroll simran=new Payroll();
sneha.addSalary(30000.00);
sankar.addSalary(35000.00);
simran.addSalary(25000.00);
System.out.println("salary "+Payroll.totsalary);
	}

}
