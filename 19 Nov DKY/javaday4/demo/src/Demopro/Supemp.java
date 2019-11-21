package Demopro;
class HclEmploy{
	String sapid;
	String name;
	String gender;
	String designation;
	public HclEmploy(String sapid, String name, String gender,
			String designation) {
		super();
		this.sapid = sapid;
		this.name = name;
		this.gender = gender;
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "HclEmploy [sapid=" + sapid + ", name=" + name + ", gender="
				+ gender + ", designation=" + designation + "]";
	}
}

	class Sneha extends HclEmploy{

		public Sneha(String sapid, String name, String gender,
				String designation) {
			super(sapid, name, gender, designation);
		
		}
		
	}
	class Sankar extends HclEmploy{

		public Sankar(String sapid, String name, String gender,
				String designation) {
			super(sapid, name, gender, designation);
		}
		}
	class Sruthi extends HclEmploy{

		public Sruthi(String sapid, String name, String gender,
				String designation) {
			super(sapid, name, gender, designation);
			// TODO Auto-generated constructor stub
		}
		
	}

public class Supemp {

	public static void main(String[] args) {
		HclEmploy employSneha=new Sneha("S001","Sneha","FEMALE","SWE");
		HclEmploy employSankar=new Sankar("S002","Sankar","MALE","SWE");
		HclEmploy employSruthi=new Sruthi("S003","Sruthi","FEMALE","SWE");
HclEmploy[] arr={employSneha,employSankar,employSruthi};
for (HclEmploy hclEmploy : arr) {
	System.out.println(hclEmploy);
}
	}

}
