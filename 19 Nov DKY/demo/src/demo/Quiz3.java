package demo;

class Quiz3 {

  static {
    System.out.println("static");
  }
  
  Quiz3() {
    System.out.println("general");
  }
  
  public static void main(String[] args) {
    System.out.println("we");
    new Quiz3();
  }
}
