package com.hcl.sup;

public class Ebill {
public void check(int units,double billpay,int b1,int b2,int b3,int b4,int b5,int b6) {
	if(units<=100){
		billpay=units*b1;
	}else if(units>100 && units<=150){
		billpay=100*b1+(units-100)*b2;
	}else if(units>150 && units<=200){
		billpay=100*b1+50*b2(units-150)*b3;
	}else if(units>200 && units<=250){
		billpay=100*b1+50*b2+50*b3(units-200)*b4;
	}else if(units>250 && units<=300){
		billpay=100*b1+50*b2+50*b3+50*b4(units-250)*b5;
	}else{
		billpay=100*b1+50*b2+50*b3+50*b4+50*b5+(units-300)*b5;
	}
System.out.println("Electricity");
}

}
}
