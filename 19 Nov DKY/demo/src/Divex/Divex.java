package Divex;

public class Divex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b,c;
try {
	a=Integer.parseInt(args[0]);
	b=Integer.parseInt(args[1]);
	c=a/b;
	System.out.println("Division " +c);
} 
catch(NumberFormatException e){
System.out.println("string not be converted");
}	
	catch(ArrayIndexOutOfBoundsException e){

	System.out.println("args are not passed");
}
catch (ArithmeticException e) {
	System.out.println("division by zero is impossible");
}
catch (Exception e){
	e.printStackTrace();
}finally{
	System.out.println("program by hcl");
}
	}

}
