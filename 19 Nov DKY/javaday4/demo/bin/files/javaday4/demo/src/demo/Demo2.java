package demo;

public class Demo2 {
	public int sum(){
		return 5;
	}
	public int sum(int x){
		return x+5;
	}
	public int sum(int x,int y){
		return x+y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Demo2 d=new Demo2();
         System.out.println(d.sum());
         System.out.println(d.sum(7));
         System.out.println(d.sum(12, 10));
	}

}
