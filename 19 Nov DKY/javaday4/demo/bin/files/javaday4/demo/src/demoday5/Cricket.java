package demoday5;

public class Cricket {
static int score;
public void inc(int x){
	score+=x;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cricket fb=new Cricket();
Cricket sb=new Cricket();
Cricket ext=new Cricket();
fb.inc(12);
sb.inc(6);
ext.inc(7);
System.out.println("score "+Cricket.score);
	}

}
