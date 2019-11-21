package Divex;
class NegativeException extends Exception{
	NegativeException(String error){
		super(error);
	}
}
class NumberZeroException extends Exception{
	NumberZeroException(String error){
		super(error);
	}
}
public class Custom {
public void add(int a,int b) throws NegativeException, NumberZeroException {
	boolean flag=true;
	if (a<0||b<0) {
		flag=false;
		throw new NegativeException("negative not allow");
			}
	if(a==0||b==0){
		flag=false;
		throw new NumberZeroException("zero is invalid");
	}
	if (flag==true) {
		int c=a+b;
		System.out.println("sum is " +c);
		}
}
	public static void main(String[] args) {
try {
	new Custom().add(12, 5);
} catch (NegativeException e) {

	e.printStackTrace();
} catch (NumberZeroException e) {

	e.printStackTrace();
}
}

}
