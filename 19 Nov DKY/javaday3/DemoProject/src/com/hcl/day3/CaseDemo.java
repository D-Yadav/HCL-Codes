package com.hcl.day3;

public class CaseDemo {
    public void show(String dayName) {
        switch(dayName){
        case "Monday" :
            System.out.println("working day");
            break;
        case "Tuesday" :
            System.out.println("working day");
            break;
        }
        
    }

    public static void main(String[] args) {
        
        // TODO Auto-generated method stub
          String dayNmae="Monday";
          new CaseDemo().show(dayNmae);
    }

}
