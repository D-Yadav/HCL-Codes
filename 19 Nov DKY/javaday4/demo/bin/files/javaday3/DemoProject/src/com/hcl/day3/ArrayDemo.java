package com.hcl.day3;

public class ArrayDemo {
    public void show() {
        int[] a=new int[] {12,25,5,33,85};
//        for(int i=0;i<a.length;i++)
//        {
//            System.out.println(a[i]);
//        }
        for (int i : a) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        new ArrayDemo().show();
    }

}
