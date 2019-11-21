package demo;

  public class P36 {
	  public void name(Object ob) {
		if(ob=="ABC"){
			System.out.println("correct");
		}else{
			System.out.println("erroor");
		}
	}
	  public static void main(String[] args) {
		String s="ABC";
		P36 obj=new P36();
		obj.name(s);
	}
  }
