package com.hcl.day3;

public class Sbvalid {
public StringBuilder show(String firstName,String lastName,String city,double cgp){
    StringBuilder sb=new StringBuilder();
    if (firstName.length()<5) {
        sb.append("\n invalid firstname");
        }
    if(lastName.length()<5){
        sb.append("\ninvalid lastname");
    }
    if(city.length()<5){
        sb.append("\n invalid city");
        
    }
    if(cgp>10){
        sb.append("\ninvalid cgp");
    }
    return sb;
}
    public static void main(String[] args) {
String firstName="Ram",lastName="kishna",city="goa";
double cgp=12.5;
System.out.println(new Sbvalid().show(firstName, lastName, city, cgp));

    }

}
