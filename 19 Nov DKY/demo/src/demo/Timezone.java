package demo;

public class Timezone {
int h;
int m;
public Timezone(){
	super();
}
	public Timezone(int h, int m) {
	super();
	this.h = h;
	this.m = m;
}
	
	public Timezone addTime(Timezone t1,Timezone t2){
		Timezone t3=new Timezone();
		t3.h=t1.h+t2.h;
		t3.m=t1.m+t2.m;
		if (t3.m>=60) {
			t3.h++;
			t3.m=t3.m%60;
			}
		return t3;
	}
	@Override
	public String toString() {
		return "Timezone [h=" + h + ", m=" + m + "]";
	}
	public static void main(String[] args) {
		Timezone t1=new Timezone(3,40);
	    Timezone t2=new Timezone(4,30);
		Timezone t3=new Timezone().addTime(t1,t2);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);

	}

}
