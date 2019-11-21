package intf;
interface Itraining{
	void name();
	void email();
}
class Niharika implements Itraining{

	@Override
	public void name() {
		System.out.println("name is Niharika");
	}

	@Override
	public void email() {
	System.out.println("email is niharika@hcl.com");
		
	}
	
}
class Deepak implements Itraining{

	@Override
	public void name() {
		System.out.println("name is Deepuuu");
	}

	@Override
	public void email() {
		System.out.println("email is deepu@hcl.com");
		
	}
	
}
public class Intfdemo {

	public static void main(String[] args) {
		Itraining[] arr={
				new Niharika(),new Deepak()};
		for (Itraining itraining : arr) {
			itraining.name();
			itraining.email();
		}
		}

	}


