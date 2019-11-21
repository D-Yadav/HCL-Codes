package intf;

interface Ione{
	void name();
}
interface Itwo{
	void email();
}
class Demo implements Ione,Itwo{

	@Override
	public void email() {
		System.out.println("hcl@gmail.com");
		
	}

	@Override
	public void name() {
		System.out.println("HCL");
		
	}
	
}
public class Multinh {

	public static void main(String[] args) {
		Demo ob=new Demo();
		ob.name();
		ob.email();
	}

}
