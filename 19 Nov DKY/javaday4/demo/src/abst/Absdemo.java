package abst;
abstract class HclTrianing{
	abstract void logintime();
	abstract void empname();
	abstract void logouttime();
}
class Harika extends HclTrianing{
@Override	void logintime() {
		System.out.println("came at 9:30am");
		}
@Override
	void empname() {
		System.out.println("hi im harika");
		}
@Override
	void logouttime() {
		System.out.println("will go back at 8:30pm");
	}
	}
class Teja extends HclTrianing{
@Override
	void logintime() {
	System.out.println("teja came by 7:30am");
	}
@Override
	void empname() {
				System.out.println("hi im teju");
		}
@Override
	void logouttime() {
				System.out.println("teja logout by 10:45");
	}
	}
public class Absdemo {
public static void main(String[] args) {
		HclTrianing[] arr={new Harika(),new Teja()};
for (HclTrianing hclTrianing : arr) {
	hclTrianing.empname();
	hclTrianing.logintime();
	hclTrianing.logouttime();
}
	}
}
