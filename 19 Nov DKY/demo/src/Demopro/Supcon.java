package Demopro;
class First{
	int sno;
	String name;
	public First(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}
	@Override
	public String toString() {
		return "First [sno=" + sno + ", name=" + name + "]";
	}
	}
class Second extends First{

	public Second(int sno, String name) {
		super(sno, name);
	
	}
	
}
public class Supcon {

	public static void main(String[] args) {
		First f=new Second(1, "Sneha");
		System.out.println(f);

	}

}
