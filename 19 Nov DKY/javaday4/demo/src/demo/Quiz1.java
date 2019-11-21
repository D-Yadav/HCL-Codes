package demo;

public class Quiz1 {
  /**
   * program for constructor..
   * @param args arguments parsed..
   */
  public static void main(String[] args) {
    Student s1 = new Student();
    Student s2 = new Student();
    System.out.println(s1 == s2);
    s1.sno = 1;
    s1.firstname = "pappu";
    s1.lastname = "sneha";
    s1.cgp = 9.5;
    s2.sno = 2;
    s2.firstname = "sankar";
    s2.lastname = "shona";
    s2.cgp = 9.5;
    System.out.println(s1.equals(s2));

  }

}
