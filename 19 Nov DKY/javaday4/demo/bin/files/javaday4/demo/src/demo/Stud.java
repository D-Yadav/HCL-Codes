package demo;

public class Stud {
  int sno;
  String firstname;
  String lastname;
  double cgp;
  /**
   * program on constructor..
   */
  
  public Stud() {
    sno = 5;
    firstname = "kasimn";
    lastname = "sneha";
    cgp = 9.3;
  }
/**
 * program for constructor..
 * @param sno arguments parsed..
 * @param firstname arguments parsed..
 * @param lastname arguments parsed..
 * @param cgp arguments parsed..
 */
  public Stud(int sno, String firstname, String lastname, double cgp) {
    super();
    this.sno = sno;
		this.firstname = firstname;
		this.lastname = lastname;
		this.cgp = cgp;
	}
	@Override
	public String toString() {
		return "Stud [sno=" + sno + ", firstname=" + firstname + ", lastname="
				+ lastname + ", cgp=" + cgp + "]";
	}

	public static void main(String[] args) {
	}

}
