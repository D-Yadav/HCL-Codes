package demo;

public class Student {
  int sno;
  String firstname;
  String lastname;
  double cgp;
  
  /**
   * program to string..
   */
  
  @Override
  
    public String toString() {
    return "Student [sno=" + sno + ", firstname=" + firstname + ", lastname=" 
      + lastname + ", cgp=" + cgp + "] ";
  }
  
  /**
   * program for equals..
   */
  
  @Override
  
    public boolean equals(Object obj) {
    Student s = (Student) obj;
    if (s.cgp == cgp) {
      return true;
    } else {
      return false;
    }
  }
}
