package demoday5;

public class Customer {
int custid;
String name;
String city;
double premium;


	public Customer(int custid, String name, String city, double premium) {
	super();
	this.custid = custid;
	this.name = name;
	this.city = city;
	this.premium = premium;
}

	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", name=" + name + ", city="
				+ city + ", premium=" + premium + "]";
	}

	@Override
		public boolean equals(Object obj) {
		Customer c=(Customer) obj;
		if (c.city==city) {
			return true;
		}else{
			return false;
		}
		
		}

	public static void main(String[] args) {
		
		Customer c1=new Customer(102,"puja","chennai",2.35);

		Customer c2=new Customer(1024,"pooja","chennai",2.5);
		Customer c3=new Customer(103,"roja","chennai",2.3);
		Customer[] arr={c1,c2,c3};
		for (Customer customer : arr) {
			System.out.println(customer);
			
		}
		System.out.println(c1.equals(c2));
	}

}
