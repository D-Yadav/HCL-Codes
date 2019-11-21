package demoday5;

public class Quiz {
 static int score;
public void inc(){
	score++;
}

	@Override
public String toString() {
	return "Quiz [score=" + score + "]";
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Quiz obj=new Quiz();
obj.inc();
System.out.println(obj);
Quiz obj1=new Quiz();
obj1.inc();
System.out.println(obj1);
Quiz obj2=new Quiz();
obj2.inc();
System.out.println(obj2);
	}

}
