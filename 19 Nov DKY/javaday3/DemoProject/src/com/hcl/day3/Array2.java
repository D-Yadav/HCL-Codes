package com.hcl.day3;

public class Array2 {
  /**
  * program for array
  */
  public void show() {
    String[] names = {"sneha","kamakshi","sai","teja","raju"};
    for (String string : names) {
      System.out.println(string);      
    }
        
  }

  public static void main(String[] args) {
    new Array2().show();
  }

}
