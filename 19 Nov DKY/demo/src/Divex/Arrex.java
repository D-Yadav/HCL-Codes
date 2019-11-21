package Divex;

public class Arrex {

	public static void main(String[] args) {
		try {
			int[] a=new int[]{12,5};
			a[10]=6;
		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println("array size small");
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
