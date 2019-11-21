package com.hcl.day3;

public class Strdemo {
    public void show() {
        String msg="welcome to hcl";
        System.out.println("lenght " +msg.length());
        System.out.println("char at 5th postion " +msg.charAt(5));
        System.out.println("lower case " +msg.toLowerCase());
        System.out.println("upper " +msg.toUpperCase());
        System.out.println("sub " +msg.substring(1,10));
        System.out.println("replace " +msg.replace("hcl", "java"));
        System.out.println("concat " +msg.concat("omr"));
        
        
    }

    public static void main(String[] args) {
        
     new Strdemo().show();
    }

}
