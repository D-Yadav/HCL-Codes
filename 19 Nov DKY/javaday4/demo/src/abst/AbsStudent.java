package abst;
abstract class Student{
	int sno;
	String sname;
	double cgp;
	public Student(int sno, String sname, double cgp) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.cgp = cgp;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", cgp=" + cgp
				+ "]";
	}
	
}
class Sai extends Student{

	public Sai(int sno, String sname, double cgp) {
		super(sno, sname, cgp);
		// TODO Auto-generated constructor stub
	}
	
}
class Deepu extends Student{

	public Deepu(int sno, String sname, double cgp) {
		super(sno, sname, cgp);
		// TODO Auto-generated constructor stub
	}
	
}
public class AbsStudent {

	public static void main(String[] args) {
		Student[] arr={
				new Sai(101, "Sai", 9.8),
				new Deepu(102, "Deepu", 9.5)
		};
		for (Student student : arr) {
			System.out.println(student);
		}

	}

}
