package com.hcl.day3;

public class Varargs {
    public void show(String...name){
        for (String string : name) {
            System.out.println(string);
            
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Varargs obj=new Varargs();
        obj.show();
        obj.show("ram");
        obj.show("sneha","sowmy","sai");

    }

}
