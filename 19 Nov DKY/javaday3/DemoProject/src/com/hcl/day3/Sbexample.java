package com.hcl.day3;

public class Sbexample {
public void show() {
    StringBuilder sb=new StringBuilder("welcome ");
    System.out.println(sb);
    sb.append("from hcl batch");
    System.out.println(sb);
    sb.insert(3, "Sneha");
    System.out.println(sb);
    sb.delete(3,8);
    System.out.println(sb);
    sb.append("\n first validation");
    System.out.println(sb);
    sb.append("\nlastname validation");
    System.out.println(sb);
    
}
public static void main(String[] args) {
    new Sbexample().show();
}
}
