package com.hcl.Project2;


import java.util.*;



public class CustomerBAL {

	static StringBuilder sb=new StringBuilder();
	public boolean addCustomerBal(Customer objcustomer) throws CustomerException{
		boolean isAdded=true;
		if(objcustomer.getCustId()<=0){
			sb.append("customer no cannot be negative or zero \r\n");
			isAdded=false;
		}
		if(objcustomer.getCustName().length() <=5){
			sb.append("cusname more than 5 characters \r\n");
			isAdded=false;
		}
		if(objcustomer.getAnnualPremium()<=20000 && objcustomer.getAnnualPremium()>=100000){
			sb.append("Annualpremium is should be 20000 and 100000 \r\n");
			isAdded=false;
		}
		if(objcustomer.getModalPremium() <=1000 && objcustomer.getModalPremium()>=50000){
			sb.append("modal premiun should be in 1000 to 50000 \r\n");
			isAdded=false;
		}
		if(objcustomer.getPaymentMode()<=1 && objcustomer.getPaymentMode()>=3)
		{
			sb.append("paymentmode should be in 1,2,3 \r\n");
			isAdded=false;
		}
		if(isAdded==false)
		{
			throw new CustomerException(sb.toString());
		}else{
			new CustomerDAO().addCustomerDAO(objcustomer);
		}
		return isAdded;
	}
	
	public List<Customer> showCustomerBal()
	{
		return new CustomerDAO().showCustomerDAO();
	}
	
	public Customer serachCustomerBal(int cusid)
	{
		return new CustomerDAO().searchCustomerDAO(cusid);		
	}
	
	public String updateCustomerBal(Customer objcustomer){
		return new CustomerDAO().updateCustomerDAO(objcustomer);
	}
	public String deleteCustomerBal(int cusid){
		return new CustomerDAO().deleteCustomerDAO(cusid);
	}
}
